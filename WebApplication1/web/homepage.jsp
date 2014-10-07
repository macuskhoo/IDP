<%-- 
    Document   : homepage
    Created on : Oct 6, 2014, 2:51:43 PM
    Author     : test2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="js/jquery.mambo.min.js"></script>
        <script src="js/mambo.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>


        <div class="container">
            <div class="col-lg-4">    
            </div>
            <div class="col-lg-4 text-center">
                <h1><center>Envision by Envisage</center></h1> 
            </div>
            <div class="col-lg-4 text-right">
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown">
                        Dropdown <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/achievements.jsp">Achievements / Badges</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/adventure.jsp">Play Adventure Mode</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/leaderboard.jsp">Leaderboard</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/faq.jsp">Ask a question / FAQ</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/submission.jsp">Submission</a></li>
                        <li role="presentation" class="divider"></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="/WebApplication1/login.jsp">Logout</a></li>
                    </ul>
                </div>
            </div>            
        </div>
        
        <canvas class="demo" width="180" height="180">  
    </body>
</html>
