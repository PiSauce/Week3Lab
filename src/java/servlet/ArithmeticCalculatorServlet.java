package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xhunt
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstStr = request.getParameter("first"); 
        String secondStr = request.getParameter("second");
        String type = request.getParameter("type");
        
        request.setAttribute("first", firstStr);
        request.setAttribute("second", secondStr);
        
        if (firstStr == null || firstStr.equals("") || secondStr == null || secondStr.equals("")) {
            request.setAttribute("message", "invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        try{
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            if(type.equals("+")){
                request.setAttribute("message", first+second);
            } else if (type.equals("-")){
                request.setAttribute("message", first-second);
            } else if (type.equals("*")){
                request.setAttribute("message", first*second);
            } else if (type.equals("%")){
                request.setAttribute("message", first%second);
            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "invalid");
        } catch (ArithmeticException e) {
            request.setAttribute("message", "invalid");
        } finally {
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
    }
}
