// pages/signin/signin.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    motto:'距 离',
   choosen:{
     latitude:0,
     longitude:0
   },
   got: {
      latitude: 0,
      longitude:0
    },
    flag1:false,
    flag2:false
  },

  chooseLocation: function(){
    // let that = this
    wx.chooseLocation({
      type:'gcj02',
      success: (res)=> {
        // console.log(res)
        this.setData({
          choosen: res,
          flag1:true
        })
      },
    })
  },

getLocation: function(){
  wx.getLocation({
    success: (res)=> {
      this.setData({
        got: res,
        flag2: true
      })
    },
  })
},

Rad:function(d){
  return d * Math.PI / 180.0;
},

calculate:function(){
  let lat1 = this.data.choosen.latitude
  let lat2 = this.data.got.latitude
  let lng1 = this.data.choosen.longitude
  let lng2 = this.data.got.longitude
  var radLat1 = this.Rad(lat1);
  var radLat2 = this.Rad(lat2);
  var a = radLat1 - radLat2;
  var b = this.Rad(lng1) - this.Rad(lng2);
  var s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
  s = s * 6378137.0; // 取WGS84标准参考椭球中的地球长半径(单位:m)
  s = Math.round(s * 10000) / 10000;
  s= s.toFixed(2)
  this.setData({
    motto: s + 'm'
  })
},

getteseList() {
  var that = this;
  wx.request({
   //服务器的网址（这里不是正规的网址，所以要使用的话，在微信开发者工具中要勾选不校验合法域名）
    url: 'https://212.64.73.31.3306/wesoft/course/cname',
    //提交方式
    method: 'post',
    success: function (res) {
      that.setData({
      //把获取的值赋值给selectArray数组
        selectArray: res.data          
      })
    }
  })
  wx.request({ 
    url: 'https://212.64.73.31.3306/wesoft/course/cno', 
    method: 'GET',
     data: { param1: 'foo' , param2: 'bar' }, 
     header: { 'Content-Type': 'application/json' }, 
     success: function(res) { console.log(res.data) } 
    })
},
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})