<%--
  Created by IntelliJ IDEA.
  User: rayan
  Date: 31/01/2024
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout d'Annonce</title>
    <!-- Ajouter le lien vers la bibliothèque Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <form method="post" action="annonce-servlet" class="col-md-6 offset-md-3">
        <h2 class="text-center mb-4">Ajouter une Annonce</h2>

        <div class="form-group">
            <label for="title">Titre:</label>
            <input type="text" id="title" name="title" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="description">Description:</label>
            <textarea id="description" name="description" class="form-control" rows="4" required></textarea>
        </div>

        <div class="form-group">
            <label for="adress">Adresse:</label>
            <input type="text" id="adress" name="adress" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="mail">Email:</label>
            <input type="email" id="mail" name="mail" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-primary">Ajouter</button>
    </form>
        
</div>

<!-- Ajouter le lien vers le script Bootstrap (jQuery et Popper.js sont requis pour Bootstrap) -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

