package ada.wm2;
import ada.wm2.helper.Helper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            String year = request.getParameter("year");

            double grossSalary = Double.parseDouble(request.getParameter("gross"));

            String sector = request.getParameter("sector");

            boolean active;
            String discounts;

            if(request.getParameter("discount") != null) {
                active = true;
            }
            else active = false;

            if(active) {
               discounts = request.getParameter("discounts");
            }
            else discounts = null;

            double quantity = Double.parseDouble(request.getParameter("quantity"));

            String myHtml = "<html>";
            myHtml += "<h4>Net Salary is " + Helper.grossToNet(grossSalary, year, quantity, discounts, sector) + "</h4>";
            myHtml += "</html>";

            out.println(myHtml);

        }
        catch (Exception ex){
            String myErrorHtml = "<html>";
            myErrorHtml += "<h4>Please, fill in the blank spaces correctly!</h4>";
            myErrorHtml += "</html>";
            out.println(myErrorHtml);
        }
//        catch (NullPointerException ex){
//            out.println("Please, fill in the blank spaces!");
//        }
//        catch (NumberFormatException ex){
//            out.println("Please, fill in the blank spaces!");
//        }
    }


}
