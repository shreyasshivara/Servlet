package com.xworkz.servlet.vegetables;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "onion",urlPatterns = "/onion", loadOnStartup = 3)
public class Onion extends HttpServlet {
    public Onion(){
        System.out.println("Created no-arg const of onion");

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created onion");
    }
}
