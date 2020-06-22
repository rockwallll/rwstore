// 新增按钮
function add() {
    // 打开新增框架
    document.getElementById('addBlock').style.display = 'block';
    document.getElementById('totalBackground').style.display = 'block';
}

// 提交按钮
function sumbit() {
    // 关闭新增框架
    document.getElementById('addBlock').style.display = 'none';
    document.getElementById('totalBackground').style.display = 'none';

    // 写入表单
    // 获取表
    var iTable = document.getElementById('myTable');
    // 获取输入值
    var courseId = document.getElementById('courseId1').value;
    var course = document.getElementById('course1').value;
    var name = document.getElementById('name1').value;
    var phoneNum = document.getElementById('phoneNum1').value;
    var nums = iTable.rows.length;

    // 创建一行tr
    var iTr = document.createElement('tr');

    // 隔行换色
    if (nums % 2 != 0)
    {
        iTr.className = 'mainTbodyTr1';
    }
    else {
        iTr.className = 'mainTbodyTr2';
    }

    // 将tr添加到table中
    iTable.appendChild(iTr);

    // 创建选择按钮
    var sel = document.createElement('input');
    sel.setAttribute('type','checkbox');
    sel.setAttribute('name','item');

    // 创建单元格td，并添加属性、内容
    var iTd1 = document.createElement('td');
    iTd1.className = "col1";
    iTd1.appendChild(sel);
    var iTd2 = document.createElement('td');
    iTd2.className = "col2";
    iTd2.appendChild(document.createTextNode(nums));
    var iTd3 = document.createElement('td');
    iTd3.className = "col3";
    iTd3.appendChild(document.createTextNode(courseId));
    var iTd4 = document.createElement('td');
    iTd4.className = "col4";
    iTd4.appendChild(document.createTextNode(course));
    var iTd5 = document.createElement('td');
    iTd5.className = "col5";
    iTd5.appendChild(document.createTextNode(name));
    var iTd6 = document.createElement('td');
    iTd6.className = "col6";
    iTd6.appendChild(document.createTextNode(phoneNum));
    // 将单元格添加到行
    iTr.appendChild(iTd1);
    iTr.appendChild(iTd2);
    iTr.appendChild(iTd3);
    iTr.appendChild(iTd4);
    iTr.appendChild(iTd5);
    iTr.appendChild(iTd6);
    // 将新增框架中的输入框值初始化
    document.getElementById('courseId1').value = null;
    document.getElementById('course1').value = null;
    document.getElementById('name1').value = null;
    document.getElementById('phoneNum1').value = null;
    document.getElementById('nums').innerText = nums;
    var pageNum = document.getElementById('pageNum').innerText;
    pageNum = parseInt(pageNum);
    for (var i=10*pageNum+1; i<=nums; i++) {
        iTable.rows[i].style.display = 'none';
    }
}

// 新增中的取消按钮
function addCancel() {
    // 关闭新增框架
    document.getElementById('addBlock').style.display = 'none';
    document.getElementById('totalBackground').style.display = 'none';
}
