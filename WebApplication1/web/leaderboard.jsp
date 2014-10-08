<%-- 
    Document   : leaderboard
    Created on : Oct 8, 2014, 2:01:12 AM
    Author     : macus.khoo.2012
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type = "text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.1.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <title>Leaderboard</title>
    </head>
    <body>
        <div id="top">
            <div id="title" align="center">
                <font size="10" color ="white" face="verdana"><b>Leaderboard</b></font>
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
        
        <div id="stripes" align="center">
            <div class="first">
                <img src="./images/first.jpg">
                <div id="stripes" style="margin-top:0px" align="center">
                    <div class="first">
                        <img src="./images/second.jpg">
                        <div id="stripes" style="margin-top:0px">
                            <div class="first">
                                <img src="./images/third.jpg">
                                <div id="stripes" style="margin-top:0px">
                                    <div class="first">
                                        <img src="./images/forth.jpg">
                                        <div id="stripes" style="margin-top:0px">
                                            <div class="first">
                                                <img src="./images/fifth.jpg">
                                                <div id="stripes" style="margin-top:0px">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

