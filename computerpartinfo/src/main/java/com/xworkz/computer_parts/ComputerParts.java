package com.xworkz.computer_parts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/ComputerParts", loadOnStartup = 1)
public class ComputerParts extends HttpServlet {
    public ComputerParts(){
        System.out.println("created no-arg const of compter parts");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created computerParts");
        String brand=req.getParameter("brand");
        String model=req.getParameter("model");
        String color=req.getParameter("color");
        String type=req.getParameter("Type");
        String RAM=req.getParameter("RAM");
        String Hard_Disk=req.getParameter("Hard Disk");
        String processor=req.getParameter("Processor");
        String generation=req.getParameter("Generation");
        String motherboard=req.getParameter("Motherboard");
        String Cache_size=req.getParameter("Cache size");
        String price=req.getParameter("Price");
        String quantity=req.getParameter("Quantity");
        PrintWriter writer=resp.getWriter();
        resp.setContentType("text/html");
        System.out.println(brand+" "+model+" "+color+" "+ type+ " "+ RAM+" "+ " "+Hard_Disk+" "+ processor+ " "+generation+" "+motherboard+" "+Cache_size+" "+price+" "+quantity);
        double priceCon=Double.parseDouble(price);
        int quantityCon=Integer.parseInt(quantity);
        double totalPrice=priceCon*quantityCon;

writer.println("<html>");
writer.println("<head>");
        writer.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
writer.println("</head>");
writer.println("<body class=\"p-3 mb-2 bg-secondary text-white\">");

writer.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
        "  <div class=\"container-fluid\">\n" +
        "    <a class=\"navbar-brand\" href=\"./index.html\">HOME</a>\n" +
        "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
        "      <span class=\"navbar-toggler-icon\"></span>\n" +
        "    </button>\n" +
        "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
        "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
        "        <li class=\"nav-item\">\n" +
        "          <a class=\"nav-link active\" aria-current=\"page\" href=\"./ComputerParts.html\">FORM</a>\n" +
        "        </li>"+
        "</nav>");



        writer.println("Your form under processing.....................!!");

        writer.println("Total cost of "+ quantityCon+" laptop's is "+ totalPrice+" rs");
writer.println("</body>");
writer.println("</html>");


    }
}
