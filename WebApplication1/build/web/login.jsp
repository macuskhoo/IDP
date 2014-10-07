
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/login.css" rel="stylesheet" type = "text/css"> 
        <title>Login Page</title>
    </head>
    <body>
        <div id="Wrapper">
      <div id="Header">
        <div id="Header1"></div>
        <div id="Header2"></div>
      </div>
  <div id="Header3">
  </div>

      <div id="Menu">
      
      </div>
      
      <div id="Navigation">
        
  </div>
  <div id="Body"> 
  <br /><br />

        <div align="center">
        	<div id="LeftContent">
            	<h1>Envision by Envisage</h1>
            </div>
            <div align="center">
                <form action ="LoginServlet" method="post">
                    <p>Username:<input type = "text" name ="userName"/><br /></p>
                    <p>Password: <input type = "password" name = "txt_Password"/><br/><br /></p>
                    <input type="submit" id="Image-Button" value="">
                </form>
            </div>
        </div>
  </div>
      
      <div id="Footer"></div>
</div>
</body>
</html>
