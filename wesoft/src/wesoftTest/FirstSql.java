package wesoftTest;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FirstSql")
public class FirstSql extends HttpServlet{
	private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";// mysql连接驱动,无需改
	
	public static String jdbcUrl = "jdbc:mysql://localhost:3306/student?&useSSL=false&serverTimezone=UTC";
	public static String jdbcUser = "root";//数据库用户名
	public static String jdbcPwd = "123789";//数据库密码
	private static Connection conn;
	public static Statement st;
	
	static {
		try {
			Class.forName(jdbcDriver);// 加载mysql驱动类
			conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
			// 驱动利用驱动地址，数据库用户名，密码创建连接
			st = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//以上基本是固定格式的
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Map> list =new ArrayList<Map>();//创建list集合用于存入map的键值对集合
		
		String idcard_w = request.getParameter("idcard_w");//接收到前台传来的数据
		System.out.println(idcard_w);
	
		
		try {
			String sql ="select cname from course where cno in (select cno from sc where snumber = '"+idcard_w+"')";

			
			ResultSet rs = st.executeQuery(sql);
			//从数据库读取的内容，返回一个结果集。
			System.out.println("获取数据");
			while (rs.next()) {
				String cname = rs.getString("cname");
				
				//获取用循环接收数据库的表格信息
				
				Map map = new HashMap(); 
				map.put("cname",cname);		
				//用键值对存入到map集合中
				System.out.println(map);
				list.add(map);//在将map集合对象存入list集合
				System.out.println("放入集合");
				for (Map map_1 :list) {
					System.out.println(map_1);
				}//在打印台遍历出数据查看是否有错误
				
			}//遍历结果集
		} catch (Exception e) {
			e.printStackTrace();
		}
	
 
		System.out.println("跳转");
		request.setAttribute("key_list",list);//将list集合数据放入到request中共享
		request.getRequestDispatcher("/index.jsp").forward(request, response);

		//跳转到index.jsp页面
	}
}