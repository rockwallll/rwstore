// pages/register/userlogin.js
var util = require('../../utils/util.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    motto:"0",
    size:"0",
    pushL:[],
    time:"",
    dtime:"",
    curtime:"",
    timedist:"",
    max:"",
    // {
    //   latitude:0,
    //   longitude:0
    // }
    got: {
       latitude: 0,
       longitude:0
     },
     flag1:false,
     flag2:false,
     flagface:false,
     flagdist:false,
     flagtime:false
  },
  pushLocation: function(){
    wx.request({
      url: 'http://10.21.232.109//findallcdjson',
      success: (data) => {
        console.log(data)
        this.setData({
          pushL: data.data,
          flag1: true
        })
      }
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
  calculate1:  function(date1, date2){
    date1 = date1.substring(0,19);    
    date1 = date1.replace(/-/g,'/');
    var timestamp1 = (new Date(date1).getTime())/1000;
   
    date2 = date2.substring(0,19);    
    date2 = date2.replace(/-/g,'/');
    var timestamp2 = (new Date(date2).getTime())/1000;
   
    var min = (timestamp1 - timestamp2)/60
    console.log('相差:' + min + '分钟');
    return min;
   },
  calculate: function(){
    // this.data.size = this.data.pushL.length,
    this.setData({
      size: this.data.pushL.length
    })
    console.log(this.data.size)
    console.log(this.data.pushL[this.data.size-1].csignposiL)
    let lat1 = this.data.pushL[this.data.size-1].csignposiW//choosen.latitude老师经度
    let lat2 = this.data.got.latitude
    let lng1 = this.data.pushL[this.data.size-1].csignposiL//choosen.longitude老师维度
    let lng2 = this.data.got.longitude
    var radLat1 = this.Rad(lat1);
    var radLat2 = this.Rad(lat2);
    console.log(lat1,lat2,lng1,lng2)
    var a = radLat1 - radLat2;
    var b = this.Rad(lng1) - this.Rad(lng2);
    var s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
    s = s * 6378137.0; // 取WGS84标准参考椭球中的地球长半径(单位:m)
    s = Math.round(s * 10000) / 10000;
    s= s.toFixed(2)
    if(s<10000000000){
      this.setData({
       flagdist:true
      })
    }
    this.setData({
      motto: s + 'm'
    })
  },
  caltime: function(){
    this.setData({
      time: this.data.pushL[this.data.size-1].csigntime.replace(/-/g, "/")
    })
    let intval = this.data.pushL[this.data.size-1].signtimelast;
    console.log(intval)
    this.setData({
      dtime: intval
    })
    // this.setData({
    //   intval: this.data.pushL[this.data.size-1].signtimelast
    // })
    // 调用函数时，传入new Date()参数，返回值是日期和时间
    var curtime = util.formatTime(new Date());
    // 再通过setData更改Page()里面的data，动态更新页面的数据
    this.setData({
    curtime: curtime
    })
    console.log(curtime)
    console.log(this.data.time)
   var min = this.calculate1(this.data.curtime,this.data.time);
   console.log(min)
   this.setData({
     timedist: min
   })
    if(this.data.timedist>this.data.dtime){
      this.setData({
        flagtime:true
       })
    }
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