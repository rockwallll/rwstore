//小程序配置文件

var apiUrl ="https://zjgsujiaoxue.applinzi.com/index.php/Api"
var appid = "wx5ee2da791099a208"

var config ={
  apiUrl,
  appid,
  wxUrl:`${apiUrl}/Weixin/`,
  userUrl: `${apiUrl}/User/`,
  courseId:10631
};

module.exports = config