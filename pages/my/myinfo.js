// // pages/my/myinfo.js
const app = getApp()
Page({
  data: {
    userName: '',
    userPwd:""
  },
  //获取用户输入的用户名
  userNameInput:function(e)
  {
    this.setData({
      userName: e.detail.value
    })
  },
  passWdInput:function(e)
  {
    this.setData({
      userPwd: e.detail.value
    })
  },
  //获取用户输入的密码
  loginBtnClick: function (e) {
    console.log("用户名："+this.data.userName+" 密码：" +this.data.userPwd);
    this.setData({
      stuphone:this.data.userPwd
    })
    app.globaldata.stuphone = this.data.userPwd
    console.log(app.globaldata.stuphone);
    // wx.request({
    //   url: 'http://10.21.232.109/findbynumjson?snumber=' + app.data.stuphone,
    //   success: (data) => {
    //     console.log(data)
    //     this.setData({
    //       messagearr: data.data
    //     })
    //   }
    // })
  },
  
  // 用户点击右上角分享
  onShareAppMessage: function () {

  }
})
// Page({

//   /**
//    * 页面的初始数据
//    */
//   data: {

//   },

//   /**
//    * 生命周期函数--监听页面加载
//    */
//   onLoad: function (options) {

//   },

//   /**
//    * 生命周期函数--监听页面初次渲染完成
//    */
//   onReady: function () {

//   },

//   /**
//    * 生命周期函数--监听页面显示
//    */
//   onShow: function () {

//   },

//   /**
//    * 生命周期函数--监听页面隐藏
//    */
//   onHide: function () {

//   },

//   /**
//    * 生命周期函数--监听页面卸载
//    */
//   onUnload: function () {

//   },

//   /**
//    * 页面相关事件处理函数--监听用户下拉动作
//    */
//   onPullDownRefresh: function () {

//   },

//   /**
//    * 页面上拉触底事件的处理函数
//    */
//   onReachBottom: function () {

//   },

//   /**
//    * 用户点击右上角分享
//    */
//   onShareAppMessage: function () {

//   }
// })