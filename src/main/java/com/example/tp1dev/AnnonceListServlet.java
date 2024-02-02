package com.example.tp1dev;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bdd.AnnonceDAO;
import bdd.ConnectionDB;
import bdd.DAO;
import bean.Annonce;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

    @WebServlet(name = "annonceListServlet", value = "/annonce-list-servlet")
public class AnnonceListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection conn = null;
            try {
                conn = ConnectionDB.getInstance();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            AnnonceDAO annonceDAO = new AnnonceDAO(conn);
            List<Annonce> annonces = annonceDAO.fetchAll();

            // Mettre la liste des annonces dans l'attribut de la requête
            request.setAttribute("annonces", annonces);

            // Dispatcher vers la JSP pour afficher la liste
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/AnnonceList.jsp");

        } catch (SQLException  e) {
            e.printStackTrace();
            // Gérer les erreurs, par exemple en renvoyant un message d'erreur à la JSP
            response.sendRedirect(request.getContextPath() + "/error.jsp");
        }
    }
}
