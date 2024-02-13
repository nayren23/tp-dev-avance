package com.example.tp1dev;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServletForm", value = "/hello-servlet-form")
public class HelloFormServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Formulaire de saisie du nom
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action='hello-servlet' method='post'>");
        out.println("Nom: <input type='text' name='nom'>");
        out.println("<input type='submit' value='Envoyer'>");
        out.println("</form>");
        out.println("</body></html>");
    }


}
