<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="description" content="Pagina di login">
        <meta name="author" content="Giovanni Antonio Moreddu">
        <link rel="stylesheet" type="text/css" media="screen" href="style.css"/>
    </head>
    <body>
<div class="barra">
        <div class="menu">
        <a href="profilo.html">Il mio Profilo</a>
        <a href="bacheca.html">Bacheca</a>
        <a href="login.html">Login</a>
        <a href="descrizione.html">Descrizione</a>
        </div>

</div>

        
        <header>
        <h1>Nerdbook</h1>
        </header>

        <div class="content">
			<div class="login">
				<h2>Login</h2>
				<h3>Inserisci le credenziali per accedere</h3>
				<form method="post" action="/AmmM1/login.html">
				    <label for="Username"> Username</label>
				    <input type="text" name="Username"
				 id="Username" value="Username" />
				    <br>
				    <label for="pswd">Inserisci la password</label>
				    <input type="password" name="pswd"
				 id="pswd" value="oscurato" />
				    <input type="submit" value="Accedi" />

				</form>
			</div>
        </div>
    </body>
</html>
