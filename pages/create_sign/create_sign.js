
import request from '../../service/network.js'

Page({
    mixins: [require('../../mixin/themeChanged')],
    data: {
        array3: ['软件理论与工程', '机器学习', '英语'],
        a3:[],
        value3: 0,       
        arraylast: ['10分钟', '15分钟','20分钟',  '30分钟','40分钟', '60分钟', '90分钟', ],
        index: 0,
        time: '12:01',
        last:0,
        toast: false,
        loading: false,
        hideToast: false,
        hideLoading: false,
        mycourse00:[],
        got:{
            latitude:0,
            longitude:0
        },
        inputValue:'',
        inputdata:'11'
        
    },
    getLocation:function(){
        type:'gcj02'
        wx.getLocation({
            success:(res)=>{
                this.setData({
                    got:res
                })
            },
          
        })
    },

    //获取的课程信息需要数据处理
    onLoad: function (options) {
        request({
          url:'http://10.21.232.109/findalljson'
        }).then(res =>{ 
          const mycourse00=res.data
          this.setData({
            mycourse00:mycourse00
          })
        })
    },


    // 发送签到信息失败
    loginBtnClick: function (e) {
        wx.request({
            url: 'http://10.21.232.109/addstusign',
            data: {
               last:'arraylast'
            },
            method: "POST",
            success:function(e){
              console.log(e)
            },fail:function(){
              console.log('fail')
            }
          })
    },





    bindTimeChange: function (e) {
        this.setData({
            time: e.detail.value,
        })
    },
    bindLastChange: function (e) {
        this.setData({
            last: e.detail.value
        })
    },

    bindPicker3Change: function(e) {
        this.setData({
            value3: e.detail.value
        })
        
    },
    bindDateChange: function(e) {

        this.setData({
            date: e.detail.value,
        })
    },
    openToast: function() {
        this.setData({
            toast: true,
        });
        setTimeout(() => {
            this.setData({
                hideToast: true
            });
            setTimeout(() => {
                this.setData({
                    toast: false,
                    hideToast: false,
                });
            }, 300);
        }, 3000);
    },
    openLoading: function() {
        this.setData({
            loading: true
        });
        setTimeout(() => {
            this.setData({
                hideLoading: true
            });
            setTimeout(() => {
                this.setData({
                    loading: false,
                    hideLoading: false,
                });
            }, 300);
        }, 3000);
    },


    inputLoc:function(e){
        this.setData({
            inputValue:e.detail.value,
            inputdata:'inputValue',
        })
    }

    





});