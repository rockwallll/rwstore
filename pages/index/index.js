//index.js
//获取应用实例
const app = getApp()
Page({
  data: {
    messagearr:[],
    curseid: 0,
    cursename: 0
  },
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
      wx.request({
        url: 'http://10.21.232.109/findbynumjson?snumber=' + app.globaldata.stuphone,
        success: (data) => {
          console.log(data)
          this.setData({
            messagearr: data.data
          })
        }
      })
    },
})
