<%-- 
    Document   : achievements
    Created on : Oct 6, 2014, 11:44:42 PM
    Author     : macus.khoo.2012
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/achievement.css" rel="stylesheet" type = "text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <title>Achievements</title>
    </head>
    <body>
        <div id="achievementTop">


            <div id="title" align="center">
                <font size="10" color ="white" face="verdana"><b>Achievements</b></font>
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
                <div id="homeRedirect" style="cursor:pointer" onclick="window.location = '/WebApplication1/homepage.jsp'">>
                </div>
            </div>
        </div>
        <div class="whitespace"></div>
         <div id="image1">
        </div>
        <div class="whitespace"></div>
        <div id="image2"></div>
        <div class="whitespace"></div>
        <div id="image3"></div>
        <div class="whitespace"></div>
        <div id="image4"></div>
        <div class="whitespace"></div>
        <div id="image5"></div>
    </body>
</html>
