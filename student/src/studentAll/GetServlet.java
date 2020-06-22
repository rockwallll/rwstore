package studentAll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet  extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String age=request.getParameter("age");
		String cla=request.getParameter("class");
		
		student employ=new student();
		employ.setName(name);
		employ.setSex(sex);
		employ.setAge(Integer.parseInt(age));
		employ.setCla(cla);
		
		studentAdd ema=new studentAdd();
		ema.addEmploy(employ);
	}


}
