package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageStr = request.getParameter("age"); 
        
        if (ageStr == null || ageStr.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        try{
            int age = Integer.parseInt(ageStr);
            request.setAttribute("age", age);
        } catch (NumberFormatException e) {
            getServletContext().getRequestDispatcher("/WEB_INF/agecalculator.jsp").forward(request, response);
            return;
        }
    }
}
