package com.xworkz.servlet.vegetables;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Tomato",urlPatterns = "/tomato",loadOnStartup = 1)
public class Tomato extends HttpServlet {

 public Tomato(){
  System.out.println("ctrated no-arg const");


 }

 @Override
 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  System.out.println("created tomato ");
 }
}
