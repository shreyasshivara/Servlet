package com.xworkz.jsp.iplmatches;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(urlPatterns = "/ipl",loadOnStartup = 6)
public class IplMatch extends HttpServlet{



    public IplMatch(){
        System.out.println("no arg constructor from IplMatch");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service from IplMatch");
        String team1=req.getParameter("team1");
        String team2=req.getParameter("team2");
        String venue=req.getParameter("venue");
        String date=req.getParameter("date");
        String time=req.getParameter("time");
        String toss=req.getParameter("toss");
        String decision=req.getParameter("decision");
        String innings1=req.getParameter("innings1");
        String innings2=req.getParameter("innings2");
        String man=req.getParameter("man");
        String top=req.getParameter("top");
        String bowler=req.getParameter("bowler");
        String tv=req.getParameter("tv");
        String weather=req.getParameter("weather");
        String six=req.getParameter("six");

        System.out.println(team1+" "+team2+" "+venue+" "+date+" "+time+" "+toss+" "+decision+" "+
                innings1+" "+innings2+" "+man+" "+top+" "+bowler+" "+tv+" "+weather+" "+six);


        req.setAttribute("weather",weather);
        req.setAttribute("team1",team1);
        req.setAttribute("team2",team2);
        req.setAttribute("venue",venue);
        req.setAttribute("date",date);
        req.setAttribute("time",time);
        req.setAttribute("toss",toss);
        req.setAttribute("decision",decision);
        req.setAttribute("innings1",innings1);
        req.setAttribute("innings2",innings2);
        req.setAttribute("man",man);
        req.setAttribute("top",top);
        req.setAttribute("bowler",bowler);
        req.setAttribute("tv",tv);
        req.setAttribute("six",six);


        String cookieName = "customCookie";
        String cookieValue=UUID.randomUUID().toString();// Generating a random UUID as the cookie value
        //*String cookieValue = "96ads234as";
        Cookie customCookie = new Cookie(cookieName, cookieValue);
        resp.addCookie(customCookie);


        RequestDispatcher dispatcher = req.getRequestDispatcher("iplResult.jsp");



        dispatcher.forward(req,resp);



    }


}