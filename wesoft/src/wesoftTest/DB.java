package wesoftTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	private static  String driver ="com.mysql.cj.jdbc.Driver";
	private static  String url="jdbc:mysql://localhost:3306/wesoft?&useSSL=false&serverTimezone=UTC";//声明数据库test的url
	private static  String user="root";//数据库的用户名
	private static  String password="123789";//数据库的密码
	public static Connection getConnection() {
		Connection con=null;
 		try {
 			Class.forName(driver);
 			con=DriverManager.getConnection(url,user,password);
 		}
 		catch(Exception e) {
 			e.printStackTrace();
 		}
 		
 		return con;	
	}
}
