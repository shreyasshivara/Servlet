package com.xworkz.tvrecargeform;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/TvRecharge", loadOnStartup = 1)
public class TvRecharge extends HttpServlet {
    public TvRecharge(){
        System.out.println("created no-arg const of Tv recherge");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String custId=req.getParameter("customerId");
String vendor=req.getParameter("vendor");
String recharge_type=req.getParameter("Recharge type");
String recharge_Amount=req.getParameter("Recharge Amount");
String accept=req.getParameter("accept");
        PrintWriter writer=resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");

        writer.println("<body");
        writer.println("class=\"p-3 mb-2 bg-secondary text-white\">");
        writer.println("<div class=\"container\">");
        writer.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n" +
                "    <a class=\"navbar-brand\" href=\"index.html\">HOME</a>\n" +
                "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "        <span class=\"navbar-toggler-icon\"></span>\n" +
                "    </button>\n" +
                "\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "        <ul class=\"navbar-nav mr-auto\">\n" +
                "            <li class=\"nav-item active\">\n" +
                "                <a class=\"nav-link\" href=\"./TVrecharge.html\">Form <span class=\"sr-only\"></span></a>\n" +
                "            </li>\n" +
                "\n" +
                "        </ul>\n" +
                "    </div>\n" +
                "</nav>");
        writer.println("</div>");
        writer.println("<body>");
        writer.println("<div class=\"container\">");
        writer.println("Recharge under processing...............................!!!!");
       writer.println("</div>");
        writer.println("</body>");
        writer.println("</head>");
        writer.println("</html>");
        System.out.println(custId+" "+vendor+" "+ recharge_type+" "+recharge_Amount+" "+accept);
    }
}
