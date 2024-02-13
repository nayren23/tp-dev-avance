<%@ page import="bean.Annonce" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste d'annonces</title>
    <!-- Intégration de Bootstrap -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Liste des annonces</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Titre</th>
            <th scope="col">Description</th>
            <th scope="col">Adresse</th>
            <th scope="col">Mail</th>
        </tr>
        </thead>
        <tbody>
        <%-- Boucle forEach pour itérer sur chaque annonce --%>
        <% for (Annonce annonce : (List<Annonce>)request.getAttribute("annonces")) { %>
        <tr>
            <td><%= annonce.getTitle() %></td>
            <td><%= annonce.getDescription() %></td>
            <td><%= annonce.getAddress() %></td>
            <td><%= annonce.getMail() %></td>

        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
