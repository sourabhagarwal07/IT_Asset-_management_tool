<%-- 
    Document   : NewAsset
    Created on : Jun 11, 2015, 2:47:46 PM
    Author     : ACHIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="style/Site.css" rel="stylesheet" type="text/css" />
    <title>Asset Register</title>
    <script type="text/javascript">
        function validate(){
            var emp_id =  document.getElementById("emp_id").value;
            // alert(emp_id)
            if(emp_id == ''){
                alert("Please Enter Employee ID.");
                return false;
            }
        }
        
    </script>

</head>
<body class="main">

    <fieldset id="fieldset1" style="height:400px ">
        <legend style="font-size:15px" > New Asset</legend>
        <form style="background-color: transparent" action="NewAsset.htm" method="POST"  modelAttribute="newasset" >
            <table class="gridLayout" cellpadding="10" border="0" cellspacing="15">
                <tr>
                    <td>Employee Id</td>
                    <td><input type="text" id="emp_id" name="emp_id"></td>
                    <td>Employee Name</td>
                    <td><input type="text" id="emp_name" name="emp_name"></td>
                </tr>

                <tr>                                
                    <td>Contact No</td>
                    <td><input type="text" id=ph_no" name="ph_no"></td>
                    <td>Email Id</td>
                    <td><input type="text" id="email_id" name="email_id"></td>
                </tr>
                <tr>                                
                    <td>Department</td>
                    <td><input type="text" id="dept" name="dept"></td>
                    <td>Division</td>
                    <td><input type="text" id="div" name="div"></td>
                </tr>

                <tr>                                
                    <td>Building</td>
                    <td><input type="text" id="bld" name="bld"></td>
                    <td>Floor</td>
                    <td><input type="text" id="flr" name="flr"></td>
                </tr>

                <td>Asset required</td>
                <td><select name="a_name" id="a_name">
                        <option value="---select---">---select---</option>
                        <option value="Laptop" id="laptop" name="laptop">Laptop</option>
                        <option value="Desktop" id="desktop" name="desktop">Desktop</option>
                        <option value="Network Switches" id="switches" name="switches">Network Switches</option>
                        <option value="Printer" id="printer" name="Printer">Printer</option>
                    </select>
                <td>Remarks</td>
                <td><input type="text" id="rem" name="rem"</td>
                </td>
                <tr >
                    <td align="center" colspan="4"  >____________________________________________Request to superior____________________________________________</td>
                </tr>


                <tr >                     
                    <td>Employee Id</td>
                    <td><input type="text" id=sremp_id" name="sremp_id"></td>
                    <td>Email Id</td>
                    <td><input type="text" id="sremail_id" name="sremail_id"></td>
                </tr>

                <tr>
                    <td align="center" colspan="4" ><a href="#" > <input value="Submit" type="submit"></a></td>
                </tr>
            </table> 
        </form>

    </fieldset>

</body>

</html>
