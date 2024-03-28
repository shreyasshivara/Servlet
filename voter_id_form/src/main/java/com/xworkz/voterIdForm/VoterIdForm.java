package com.xworkz.voterIdForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/VoterIdForm", loadOnStartup = 1)
public class VoterIdForm extends HttpServlet {
    public VoterIdForm(){
        System.out.println("created no-arg const of VoterIdForm");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created voterIDForm");
        String name=req.getParameter("Name");
        String address=req.getParameter("Address");
        String proof=req.getParameter("ID");
        String category=req.getParameter("Category");
        String gender=req.getParameter("Gender");
        String check=req.getParameter("checkbox");
        PrintWriter writer=resp.getWriter();

        resp.setContentType("text/html");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
        writer.println("<div class=\"container\">\n" +
                "<nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n" +
                "    <div class=\"container-fluid\">\n" +
                "        <a class=\"navbar-brand\" href=\"./index.html\">HOME</a>\n" +
                "        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "            <span class=\"navbar-toggler-icon\"></span>\n" +
                "        </button>\n" +
                "        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active\" aria-current=\"page\" href=\"./VoterIdForm.html\">Registration form</a>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</nav>");
        writer.println("<body>");
        writer.println("</body>");
        writer.println("</head>");
        writer.println("</html>");
        writer.println("Name: "+name+" "+",Address: "+address+" "+",proof: "+proof+" "+",Category: "+category+ " "+",Gender "+gender+" "+",check: "+check+" ");

        writer.println("Your application is under process..........................!!!!!!!!");
    }
}
