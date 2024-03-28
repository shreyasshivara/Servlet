package com.xworkz.servlet.vegetables;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet (urlPatterns = "/carrot", loadOnStartup = 6)
public class Carrot extends HttpServlet {
    public Carrot(){
        System.out.println("created no-arg const pof carrot");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created carrot");
        System.out.println(req.getLocalAddr());
    }
}
