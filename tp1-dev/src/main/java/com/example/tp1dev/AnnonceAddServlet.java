package com.example.tp1dev;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import bdd.AnnonceDAO;
import bdd.ConnectionDB;
import bdd.DAO;
import bean.Annonce;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "annonceServlet", value = "/annonce-servlet")
public class AnnonceAddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Afficher la JSP pour ajouter une annonce
       RequestDispatcher dispatcher  = this.getServletContext().getRequestDispatcher("/AnnonceAdd.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Traitement des données du formulaire (à ajouter selon vos besoins)
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String adress = request.getParameter("adress");
        String mail = request.getParameter("mail");

        System.out.println("mail:" + mail);

        Annonce annonce = new Annonce(title,description, adress, mail);

        Connection conn = null;
        try {
            conn = ConnectionDB.getInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        AnnonceDAO annonceDAO = new AnnonceDAO(conn);
        annonceDAO.create(annonce);
        System.out.println("c'est bon !!!!");


        // Rediriger vers la JSP après le traitement
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/AnnonceAdd.jsp");
        dispatcher.forward(request, response);
    }
}
