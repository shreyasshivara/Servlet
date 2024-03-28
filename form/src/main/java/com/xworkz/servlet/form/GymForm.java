package com.xworkz.servlet.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/GymForm", loadOnStartup = 1)
public class GymForm extends HttpServlet {
    public GymForm(){
        System.out.println("created no-arg cost 0f gym form");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("created Gym form");
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        String hight=req.getParameter("hight");
        String weight=req.getParameter("weight");
        String joiningDate=req.getParameter("Joining date");
        String membership=req.getParameter("membership");
        PrintWriter writer=resp.getWriter();
        resp.setContentType("text/plain");
        writer.println("gym applicatin is pending.......................!!!");
        System.out.println(name+ " "+ age + " "+ hight+ " "+ weight + " "+ joiningDate+ " "+membership);
    }
}
