package Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Demo.Student;

public class StudentAdd {
	private Connection con=null;
	public StudentAdd()
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
	 public boolean addEmploy(Student employ) {
		 String sql="insert into stu_inf(stu_name,stu_telephone,stu_sex,stu_profession,stu_id) values (?,?,?,?,?)";
		 boolean b=false;
		 try {
				PreparedStatement ps;
				ps=con.prepareStatement(sql);
				ps.setString(1,employ.getStu_name());
				ps.setString(2,employ.getStu_telephone());
				ps.setString(3,employ.getStu_sex());
				ps.setString(4,employ.getStu_profession());
				ps.setString(5,employ.getStu_id());
				ps.executeUpdate();
				b=true;
			}
		 catch(Exception e)
			{
				e.printStackTrace();
			}
		 
		 
		 return b;
	 }
}
