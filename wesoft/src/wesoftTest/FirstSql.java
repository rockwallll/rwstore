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
	private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";// mysql��������,�����
	
	public static String jdbcUrl = "jdbc:mysql://localhost:3306/student?&useSSL=false&serverTimezone=UTC";
	public static String jdbcUser = "root";//���ݿ��û���
	public static String jdbcPwd = "123789";//���ݿ�����
	private static Connection conn;
	public static Statement st;
	
	static {
		try {
			Class.forName(jdbcDriver);// ����mysql������
			conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
			// ��������������ַ�����ݿ��û��������봴������
			st = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//���ϻ����ǹ̶���ʽ��
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Map> list =new ArrayList<Map>();//����list�������ڴ���map�ļ�ֵ�Լ���
		
		String idcard_w = request.getParameter("idcard_w");//���յ�ǰ̨����������
		System.out.println(idcard_w);
	
		
		try {
			String sql ="select cname from course where cno in (select cno from sc where snumber = '"+idcard_w+"')";

			
			ResultSet rs = st.executeQuery(sql);
			//�����ݿ��ȡ�����ݣ�����һ���������
			System.out.println("��ȡ����");
			while (rs.next()) {
				String cname = rs.getString("cname");
				
				//��ȡ��ѭ���������ݿ�ı����Ϣ
				
				Map map = new HashMap(); 
				map.put("cname",cname);		
				//�ü�ֵ�Դ��뵽map������
				System.out.println(map);
				list.add(map);//�ڽ�map���϶������list����
				System.out.println("���뼯��");
				for (Map map_1 :list) {
					System.out.println(map_1);
				}//�ڴ�ӡ̨���������ݲ鿴�Ƿ��д���
				
			}//���������
		} catch (Exception e) {
			e.printStackTrace();
		}
	
 
		System.out.println("��ת");
		request.setAttribute("key_list",list);//��list�������ݷ��뵽request�й���
		request.getRequestDispatcher("/index.jsp").forward(request, response);

		//��ת��index.jspҳ��
	}
}