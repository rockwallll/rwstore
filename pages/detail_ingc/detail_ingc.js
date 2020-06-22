
// pages/signin/signin.js

import request from '../../service/network.js'

Page({

    /**
     * 页面的初始数据
     */
    data: {
        signhis: [{
            name: '软件理论与工程',serial:'第一次',week:'周一',signtime:'19:00',signloc:'A111',signrate:'2'
          }, 
        ] ,
        coursename:[],
        signtime:[]
         

    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        this.setData({
            coursename:options.coursename,
            signtime:options.signtime 
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