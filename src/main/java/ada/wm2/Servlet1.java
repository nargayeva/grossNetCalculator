package ada.wm2;

import ada.wm2.helper.Helper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
        Double net = Double.parseDouble(request.getParameter("net"));

        String year = request.getParameter("year");

        String sector = request.getParameter("sector");

            String myHtml = "<html>";
            myHtml += "<h4>Gross Salary is " + Helper.netToGross(net, sector) + "</h4>";
            myHtml += "</html>";

            out.println(myHtml);

        } catch (Exception ex){
            String myErrorHtml = "<html>";
            myErrorHtml += "<h4>Please, fill in the blank spaces correctly!</h4>";
            myErrorHtml += "</html>";
            out.println(myErrorHtml);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doPost(request, response);
    }
}
