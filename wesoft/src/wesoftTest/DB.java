package wesoftTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	private static  String driver ="com.mysql.cj.jdbc.Driver";
	private static  String url="jdbc:mysql://localhost:3306/wesoft?&useSSL=false&serverTimezone=UTC";//�������ݿ�test��url
	private static  String user="root";//���ݿ���û���
	private static  String password="123789";//���ݿ������
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
