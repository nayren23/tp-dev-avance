<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Accueil</title>
  <!-- Intégration de Bootstrap -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Nayren</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="hello-servlet">Hello Servlet</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="annonce-servlet">Ajouter Annonce</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="annonce-list-servlet">Liste des Annonces</a>
      </li>
      <!-- Ajoutez d'autres liens ici si nécessaire -->
    </ul>
  </div>
</nav>
<div class="container mt-5">
  <h1><%= "TP Nayren!" %></h1>
  <!-- Vous pouvez ajouter du contenu supplémentaire ici -->
</div>
<!-- Intégration de jQuery et Bootstrap JavaScript -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
