package com.xworkz.cookies;


        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.Cookie;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sendCookie",loadOnStartup = 3)
public class Cookies extends HttpServlet {

    public Cookies(){

        System.out.println("no arg constructor from Cookie");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        System.out.println(name);
        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.write("<html><body>");

        Cookie[] cookies = req.getCookies();
        writer.println("<html>");
        writer.println("<head><title>Cookie Display</title></head>");
        writer.println("<body>");
        writer.println("<h1>Cookie Display</h1>");

        if (cookies != null) {
            writer.println("<h2>Cookies:</h2>");
            for (Cookie cookie : cookies) {
                writer.println("<p>" + cookie.getName() + " : " + cookie.getValue() + "</p>");
            }
        } else {
            writer.println("<p>No cookies found.</p>");
        }



        writer.println("</body>");
        writer.println("</html>");

        // Close the PrintWriter
        writer.close();


    }

}

