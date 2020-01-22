<%-- 
    Document   : LoginPage
    Created on : Jun 4, 2015, 12:52:38 PM
    Author     : ACHIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC >
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/Site.css" rel="stylesheet" type="text/css" />
        <title>Login</title>

    </head>

    <body class="main" >
        <fieldset id="fieldset" style="height:400px ">
            <legend style="font-size:15px" > Login</legend>
            <div style="color: red ;"   id="message">${result}</div>
            <form style=" background-color: transparent" action="Login.htm" method="POST" id="form1" modelAttribute="loginPage" >
            <table class="gridLayout" style="margin-top:150px; margin-left: 350px;" cellpadding="5" cellspacing="0">

                <tr>
                    
                        <td>User Name :</td>
                        <td><input type="text" name="username" value="${username}" id="username"/>                        </td>
                    </tr>
                    <tr>
                        <td> Password : </td><td> <input type="password" name="passwrd"  id="passwrd"/> <input type="hidden" name="a" id="a" value="${aval}"/></td>
                    </tr>
                    <tr>
                        <td align="center" colspan="1" ><input type="submit" value="Login" /></td>
                    </tr>
                </table>    
            </form>
        </fieldset>
    </body>
</html>
