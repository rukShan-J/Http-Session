
package MyPackage;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int addition = i + j;
        
//        res.sendRedirect("SqServlet?k="+addition);

        //send addition value to SqServlet via a session
        HttpSession session = req.getSession();     //session start
        session.setAttribute("addition_key", addition);           //send value

        
        res.sendRedirect("SqServlet");
        
    }

}
