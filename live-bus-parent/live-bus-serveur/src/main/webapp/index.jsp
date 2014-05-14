 <!DOCTYPE html>
<html lang="fr">
<head>
<title>Welcome to the Lacl web site for live bus</title>
<!-- On ouvre la fenêtre à la largeur de l'écran -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Intégration du CSS Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
</head>
<body>

<div class="container">

<!-- Barre de navigation -->
<div class="navbar navbar-inverse">
<div class="navbar-inner">
<!-- Bouton apparaissant sur les résolutions mobiles afin de faire apparaître le menu de navigation -->
<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</a>
<a class="brand" href="#">Lacl1a site</a>
<!-- Structure du menu -->
<div class="nav-collapse collapse">
<ul class="nav">
<li class="active"><a href="#">Accueil</a></li>
<li><a href="#">A propos</a></li>
<li><a href="#">Contactez-nous</a></li>
</ul>
<ul class="nav secondary-naw">
	<li>
		<a href="#" class="menu">Se connecter</a>
	</li>

</ul>

</div>
</div>

 <form class="form-signin">
        <h2 class="form-signin-heading">Connecter vous!</h2>
        <p>
			<label for="test">Login</label>
			<input type="text" name="test" id="test">
		</p>
		<p>
			<label for="test2">Password</label>
			<input type="text" name="test" id="test2">
		</p>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Se souvenir!
        </label>
        <button class="btn btn-large btn-primary" type="submit">Connexion</button>
      </form>

</div>


<script src="bootstrap/js/jquery-1.8.3.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html> 