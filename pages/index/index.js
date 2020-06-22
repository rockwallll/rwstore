//index.js
//获取应用实例
import request from '../../service/network.js'
const app = getApp()

Page({
  data: {
    motto: 'Hello World',

    array: [1, 2, 3, 4, 5],
    mycourse: [{
      name: '机器学习',loc:'A101',date:'周一',time:'19:00'
    }, {
      name: '大数据',loc:'A202',date:'周五',time:'18:00'
    }],
    signcourse: [{
      name: '软件理论与工程',loc:'C222',date:'周一',time:'19:00'
    }, ] , 
    mycourse00:[21],
    mycourse:[],
    signcourse00:[],
    temp:[]
  },
  



  onLoad: function (options) {
    request({
      url:'http://10.21.232.109/findallcoursesjson'
    }).then(res =>{
      console.log(res)
      const mycourse00=res.data
      this.setData({
        mycourse00:mycourse00       
      })  
    })
    request({
      url:'http://10.21.232.109/findallcdjson'
    }).then(res =>{
      
      const signcourse00=res.data
      this.setData({
        signcourse00:signcourse00
      })
    })



  },

  sx:function(){
    this.onLoad()
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
