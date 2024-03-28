package com.xworkz.servlet.forms;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/DeathForm", loadOnStartup = 1)
public class DeathCertForm  extends HttpServlet {
    public DeathCertForm(){
        System.out.println("created no-arg const of death cert form");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created death form");
        System.out.println(req.getLocalAddr());
        PrintWriter writer;
        String name= req.getParameter("name");
        String age= req.getParameter("age");
        String dob= req.getParameter("dob");
        String cause= req.getParameter("cause");
        String dd= req.getParameter("dd");
        System.out.println(req.getLocalAddr());
    }
}
