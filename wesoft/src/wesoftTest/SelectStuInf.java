package wesoftTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStuInf {
	private Connection con=null;
	public SelectStuInf()
	{
		con=DB.getConnection();
	}
	public void destory()
	{
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 public boolean addEmploy() {
		 String sql="select cname from course where cno in (select cno from sc where snumber = '1234')";
		 ResultSet resultSet=null;
		 boolean b=false;
		 try {
				Statement statement;
				statement=con.createStatement();
				
				resultSet=statement.executeQuery(sql);
				while(resultSet.next()) {	//�൱�ڵ�����ѭ�����ж��Ƿ���ڣ�������ʱ����getString();�����õ�ֵ��
					String sno=resultSet.getString("sno");
					String sname=resultSet.getString("sname");
					String sex=resultSet.getString("sex");
					System.out.println(sno+":"+sname+":"+sex);
				}

				b=true;
			}
		 catch(Exception e)
			{
				e.printStackTrace();
			}
		 
		 
		 return b;
	 }
	
}
