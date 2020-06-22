package studentAll;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class studentAdd {
	public boolean addEmploy(student employ) {
    	String name=employ.getName();
    	String sex=employ.getSex();
    	int age=employ.getAge();
    	String cla=employ.getCla();
    	
    	Connection conn=null;
    	PreparedStatement pstat=null;
    	 //ע������
        String driver = "com.mysql.cj.jdbc.Driver";
        //URLָ��Ҫ���ʵ����ݿ���mysql
        String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC&characterEncoding=utf8";
        //MySQL����ʱ�û���
        String user = "root";
        //MySQL����ʱ������
        String password = "123789";
    	try {
			Class.forName(driver); //������������
			conn=DriverManager.getConnection(url, user, password);//��ȡ���ݿ�����
			String sql="insert into student (name,age,sex,cla) values (?,?,?,?)";
			pstat=conn.prepareStatement(sql); //����prepareStatement���������ִ��SQL���
			pstat.setString(1, name);
			pstat.setInt(2, age);
			pstat.setString(3, sex);
			pstat.setString(4, cla);
			pstat.executeUpdate();//ִ��sql���
			
			pstat.close();
			conn.close();
		} catch(ClassNotFoundException e) {   
            System.out.println("���������쳣!");   
            e.printStackTrace();   
            } catch(SQLException e) {    
            System.out.println("��ȡ�����쳣!"); 
            e.printStackTrace();  
            }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
		return true;   	  
      }

}
