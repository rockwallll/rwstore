package Demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Getservle
 */
@WebServlet("/Getservle")
public class Getservle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Getservle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String stu_name=request.getParameter("name");
		String stu_telephone=request.getParameter("telephone");
		String stu_sex=request.getParameter("sex");
		String stu_profeession=request.getParameter("profession");
		String stu_id=request.getParameter("id");
		System.out.println(stu_name);
		System.out.println(stu_telephone);
		System.out.println(stu_sex);
		System.out.println(stu_profeession);
		System.out.println(stu_id);
		 
		Student employ=new Student();
		employ.setStu_name(stu_name);
		employ.setStu_telephone(stu_telephone);
		employ.setStu_sex(stu_sex);
		employ.setStu_profession(stu_profeession);
		employ.setStu_id(stu_id);
		
		StudentAdd ema=new StudentAdd();
		ema.addEmploy(employ);
		ema.destory();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
