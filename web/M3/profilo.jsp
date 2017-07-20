<%@page import="social.User"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Profilo</title>
        <meta charset="UTF-8">
        <meta name="description" content="Profilo utente Nerdbook">
        <meta name="author" content="Giovanni Antonio Moreddu">
                <link rel="stylesheet" type="text/css" href="style.css" media="screen">

    </head>
    <body>
    <div class="barra">
        <div class="menu">
        <a href="profilo.html">Il mio Profilo</a>
        <a href="bacheca.html">Bacheca</a>
        <a href="login.html">Login</a>
        <a href="descrizione.html">Descrizione</a>
        </div>
<p>Giovanni Moreddu&ensp;</p>
            
            <a href="login.html">Logout</a>

</div>


        
        <header>
        <h1>Nerdbook</h1>
        </header>

        <div class="content">
        <div class="profilo">
        <h2>Il mio profilo</h2>
        
        <h3>Inserisci i tuoi dati personali</h3>
        
        <form>
            <label for="Nome"> Nome</label>
            
            <% User user = (User)session.getAttribute("user");
                String name=user.getNome();
                String surname=user.getCognome();
                String presentation=user.getPresentation();
                
            %>
          
            
            <input type="text" name="Nome" id="Nome" value="<%= name %>"
           />
            <br>
            <label for="Cognome">Cognome</label>
            <input type="text" name="Cognome" value="<%= surname %>"
         id="Cognome"  />
            <br>
            <label for="immagine" >Immagine del profilo</label>
            <input type="url" id="immagine" name="immagine" />
            <br>
            <label for="lungo">Frase di presentazione</label>
            <textarea rows="4" cols="20"
                      name="lungo" id="lungo">
                      <%= presentation!=null ? presentation : "" %>
            </textarea>   
            <br>
            <label for="data">Data di nascita</label>
            <input type="text" name="data"
         id="data" />
            <br>
            
            <label for="pswd">Inserisci la password</label>
            <input type="password" name="pswd"
         id="pswd"  />
            <br>
            
            <label for="pswd1">Conferma password</label>
            <input type="password" name="pswd1"
         id="pswd1"  />
            <input type="submit" value="Conferma dati" />
        </form>
        </div>
        </div>
    
    </body>
</html>
