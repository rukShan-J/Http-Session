package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


//        int K = Integer.parseInt(req.getParameter("k"));

        HttpSession session = req.getSession();                 //session start
        int K = (int) session.getAttribute("addition_key");    //catch value
        
        
        PrintWriter out = res.getWriter();
        out.println("num1 + num2 = " + K);

    }

}
