package com.xworkz.cookies;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

    @WebServlet(urlPatterns = "/CustomCookieServlet",loadOnStartup = 4)
    public class SetNewCookie extends HttpServlet {

        public SetNewCookie() {
            System.out.println("no arg constructor in SetNewCookie");
        }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {

        // Create a new cookie
//        String cookieName = generateRandomValue();
//        Cookie customCookie = new Cookie("Custom Cookie", cookieName);
//
//        // Set other cookie attributes as needed
//        customCookie.setMaxAge(24 * 60 * 60); // 24 hours in seconds
////        customCookie.setPath("/"); // Cookie is valid for the whole application
//        response.addCookie(customCookie);
//
//        // Set response content type
////        response.setContentType("text/html");
//
//        // Write HTML response
////        response.getWriter().println("<html><body>");
////        response.getWriter().println("<h1>Custom Cookie Sent!</h1>");
//////        response.getWriter().println("<p>Cookie ID: " + cookieName + "</p>");
////        response.getWriter().println("</body></html>");
//    }
//
//    private String generateRandomValue(){
//        return UUID.randomUUID().toString();
//    }
//    }


        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String randomValue = getCookieValue(req, "myCookie");


            if (randomValue == null) {
                randomValue = generateRandomValue();


                Cookie cookie = new Cookie("myCookie", randomValue);
                cookie.setMaxAge(60 * 60);
                resp.addCookie(cookie);
            }

            Cookie[] cookies = req.getCookies();
            if (cookies != null && cookies.length > 0) {
                for (Cookie receivedCookie : cookies) {
                    System.out.println("Received Cookie Name: " + receivedCookie.getName());
                    System.out.println("Received Cookie Value: " + receivedCookie.getValue());
                }
            } else {
                System.out.println("No cookies found in the request.");
            }
        }

        private String generateRandomValue() {
            return UUID.randomUUID().toString();
        }

        private String getCookieValue(HttpServletRequest request, String cookieName) {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals(cookieName)) {
                        return cookie.getValue();
                    }
                }
            }
            return null;
        }
    }




