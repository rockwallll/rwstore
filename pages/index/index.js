//index.js
//获取应用实例
const app = getApp()
const userUrl=require('../../config.js').userUrl
const courseId = require('../../config.js').courseId
Page({
  data: {
    current_course:{},
    ques_count: 0
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onShow:function(){
    var that = this
    wx.request({
      url: userUrl+'getDoneQuesCount',
      data:{
        openid: wx.getStorageSync('jiaoxue_OPENID'),
        courseId:courseId
      },
      success: function(res){
        // console.log(res)
        that.setData({
          ques_count: res.data.msg
        })
      }
    })
  },
  exercise(e){
    console.log(e)
    let type = e.currentTarget.dataset.type
    var _url
    if(type == 'sxlx'){
      _url="/pages/answer/answer_info/info?subject=&type=sxlx"
    }else if(type== 'zjlx'){
      _url = "/pages/answer/answer_chapter/chapter?subject=&type=zjlx"
    } else if (type == 'ztlx') {
      _url = "/pages/answer/answer_classify/classify?subject=&type=ztlx"
    }
    wx.navigateTo({
      url: _url,
    })
  },
  
  onLoad: function () {
    //this.getCurrentCourse(courseId)
    wx.request({ 
      url: 'https://212.64.73.31', 
      method: 'GET', 
      data: { param1: 'foo' , param2: 'bar' },
      header: { 'Content-Type': 'application/json' }, 
      success: function(res) { console.log(res.data) } })
  },
  /*getCurrentCourse(course_id=''){
    wx.request({
      url:userUrl + 'current',
      data:{
        current_course_id: course_id,
        openid: wx.getStorageSync('jiaoxue_OPENID'),
      },
      success: res=>{
        console.log('res1',res)
        this.setData({
          current_course: res.data.data
        })
      }
    })
  }*/
})
