
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.*;


public class SecondServlet extends HttpServlet{ 
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        HttpSession session=req.getSession();
        String name=(String)session.getAttribute("uname");
        out.println("<h2>Hello "+name+"</h2>");
        out.close();
    }
}