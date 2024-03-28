package com.xworkz.servlet.vegetables;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "beetroot", urlPatterns = "/beetroot",loadOnStartup = 2)
public class Beetroot extends HttpServlet {
    public Beetroot(){
        System.out.println("Created no-arg const beetroot");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created beetroot");
        System.out.println(req.getLocalAddr());
    }
}
