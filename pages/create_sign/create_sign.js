


Page({
    mixins: [require('../../mixin/themeChanged')],
    data: {
        array1: ['软件理论与工程', '机器学习', '英语'],
        array2: ['+86', '+80', '+84', '+87'],
        array3: ['软件理论与工程', '机器学习', '英语'],
        value1: 0,
        value2: 0,
        value3: 0,       
        arraylast: ['10分钟', '15分钟','20分钟',  '30分钟','40分钟', '60分钟', '90分钟', ],
        index: 0,
        time: '12:01',
        last:0,
        toast: false,
        loading: false,
        hideToast: false,
        hideLoading: false,
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


    bindPicker1Change: function(e) {
        this.setData({
            value1: e.detail.value
        })
    },
    bindPicker2Change: function(e) {
        this.setData({
            value2: e.detail.value
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