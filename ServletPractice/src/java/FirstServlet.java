
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import jakarta.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
    
 
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("username");
        out.println("<h2>Welcome "+name+"</h2>");
        HttpSession session=req.getSession();
        session.setAttribute("uname",name);
        out.println("<a href='servlet2'>visit</a>");
        out.close();
    }
}