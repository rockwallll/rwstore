// pages/detail_myc/detail_myc.js
import request from '../../service/network.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    signhis: [{
      name: '软件理论与工程',serial:'第一次',week:'周一',signtime:'19:00',signloc:'A111',signrate:'44/50'
    }, {
      name: '软件理论与工程',serial:'第二次',week:'周三',signtime:'19:00',signloc:'A221',signrate:'24/50'
    },
    ] ,
    coursename:[]

  },



  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      coursename:options.coursename
    }),
    request({
      url:'http://10.21.232.109/findalljson'
    }).then(res =>{
      const mycourse00=res.data
      this.setData({
        mycourse00:mycourse00
      })
    })

    

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