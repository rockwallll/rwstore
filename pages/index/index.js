//index.js
//获取应用实例
import request from '../../service/network.js'
const app = getApp()

Page({
  data: {
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    array: [1, 2, 3, 4, 5],
    mycourse: [{
      name: '机器学习',loc:'A101',date:'周一',time:'19:00'
    }, {
      name: '大数据',loc:'A202',date:'周五',time:'18:00'
    }],
    signcourse: [{
      name: '软件理论与工程',loc:'C222',date:'周一',time:'19:00'
    }, ] , 
    mycourse00:[],
    signcourse00:[]
  },
  



  onLoad: function (options) {
    request({
      url:'http://10.21.232.109/findalljson'
    }).then(res =>{
      const mycourse00=res.data
      this.setData({
        mycourse00:mycourse00
      })
    })
    request({
      url:'http://10.21.232.109/findallcdjson'
    }).then(res =>{
      console.log(res)
      const signcourse00=res.data
      this.setData({
        signcourse00:signcourse00
      })
    }),

    
    wx.request({
      url: 'http://112.124.24.195',
      data: Util.json2Form({
         type:'slogin',name:'sss',password:'asds'
      }),
      method: "POST",
      success:function(e){
        console.log(e)
      }
}) 

  },





  
  mixins: [require('../../mixin/themeChanged')],
  open: function (event) {
      wx.navigateTo({
          url: event.currentTarget.dataset.url,
      })
  },


  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  
  getUserInfo: function(e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  }
})
