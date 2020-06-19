import request from '../../service/network.js'


Page({
  data: {
    banners:[] ,
    recomends:[]
  },
  onLoad: function (options) {
    request({
      url:'http://123.207.32.32:8000/home/multidata'
    }).then(res =>{
      const banners=res.data.data.banner.list;
      const recomends=res.data.data.recommend.list;
      this.setData({
        banners:banners,
        recomends:recomends
      })
    })

  }
  
})