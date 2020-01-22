<%-- 
    Document   : AssetTrf
    Created on : Jun 19, 2015, 3:38:07 PM
    Author     : ACHIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/Site.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="main">
        <fieldset id="fieldset" style="height:400px ">
            <legend style="font-size:15px" > Asset Transfer</legend>
            <form style="background-color: transparent" action="AssetTrf.htm" method="POST" modelAttribute="assettrf" >
                <table class="gridLayout" cellpadding="10"  cellspacing="15">
                    <tr>
                        <td colspan="2.5" style="text-align:center;">From</td>      
                        <td colspan="5" style="text-align:center;">To</td> 
                    </tr>
                    <tr>
                        <td>Asset ID</td>
                        <td><input type="text" id="aid_j" name="aid_j" ></td>
                    </tr>
                    <tr>
                        <td>Employee ID</td>
                        <td><input type="text" id="s_emp_id" name="s_emp_id"></td>
                        <td></td>
                        <td>Employee ID</td>
                        <td><input type="text" id="d_emp_id" name="d_emp_id"></td>
                    </tr>
                    <tr><td ></td> </tr>
                    <tr>
                        <td align="center" colspan="5"  ><input value="Transfer" type="submit" ></a></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>