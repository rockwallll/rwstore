
import request from '../../service/network.js'
var util = require('../../utils/util.js');

Page({
    mixins: [require('../../mixin/themeChanged')],
    data: {
        array3: ['软件理论与工程', '机器学习', '英语'],
        a3:[],
        value3: 0,       
        arraylast: ['10', '15','20',  '30','40', '60', '90', ],
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
        inputdata:'11',
        cno:'99',
        cname:'sss',
        csiname:'a',
        csignposiL:'0',
        csignposiW:'0',
        signtimelast:'10'


        
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
        var time = util.formatTime(new Date());
    // 再通过setData更改Page()里面的data，动态更新页面的数据
        this.setData({
        time: time
        });
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
        this.setData({
            cname:this.data.array3[this.data.value3],
            csigname:this.data.time,
            csignposiL:this.data.got.longitude,
            csignposiW:this.data.got.latitude,
            signtimelast:this.data.arraylast[this.data.last]


        })
        wx.request({
            //url: 'http://10.21.232.109/addcsdsign?cno=0&cname='+ this.data.cname+'&csigname='+ this.data.csigname+'&csignposiL='+ this.data.csignposiL+'&csignposiW='+ this.data.csignposiW+'&signtimelast='+ this.data.signtimelast+'&csigned=00&czno=0&csigntime=0',
            url:'http://10.21.232.109/addcsdsign?cno=0&cname='+ this.data.cname+'&csigname='+ this.data.csigname+'&csignposiL='+ this.data.csignposiL+'&csignposiW='+ this.data.csignposiW+'&signtimelast='+ this.data.signtimelast+'&csigned=02&czno=3&csigntime=1111111',
            success:function(e){
              console.log('success')
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