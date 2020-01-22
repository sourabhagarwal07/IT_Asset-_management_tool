<%-- 
    Document   : Repair.jsp
    Created on : Jun 15, 2015, 3:05:04 PM
    Author     : ACHIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="style/Site.css" rel="stylesheet" type="text/css" />
   <!-- <link href="resources/css/jquery.datetimepicker.css" rel="stylesheet" type="text/css" />  -->
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

    <fieldset id="fieldset" style="height:400px ">
        <legend style="font-size:15px" >Old Asset Request</legend>
        <form style="background-color: transparent" action="OldAsset.htm" method="POST"  modelAttribute="oldasset" >
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
             
                <tr>
                    <td>Asset</td>
                    <td>
                        <select name="a_name" id="a_name">
                            <option value="---select---">---select---</option>
                            <option value="Laptop" id="laptop" name="laptop">Laptop</option>
                            <option value="Desktop" id="desktop" name="desktop">Desktop</option>
                            <option value="Network Switches" id="switches" name="switches">Network Switches</option>
                            <option value="Printer" id="printer" name="Printer">Printer</option>
                        </select>
                    </td>
                    <td>Asset ID (COMPANY)</td>
                    <td><input type="integer" id="aid_c" name="aid_c"</td>  
                </tr>
                <tr>
                    <td>Asset ID (JUSCO)</td>
                    <td><input type="integer" id="aid_j" name="aid_j"</td>
                    <td>Date of Issue (DD-MM-YYYY)</td>
                    <td><input type="integer" class="c_dmy cal_img" id="doi" name="doi"></td>
                </tr>
                <tr>
                    <td>Request Type</td>
                    <td>
                        <select name="r_type" id="r_type">
                            <option value="---select---">---select---</option>
                            <option value="Repair" id="repair" name="repair">Repair</option>
                            <option value="Replace" id="replace" name="replace">Replace</option>
                            <option value="Return" id="return" name="return">Return</option>
                        </select>
                    </td>
                    <td>Remarks</td>
                    <td><input type="text"  id="rem" name="rem"</td>
                </tr>
                <tr>
                    <td align="center" colspan="4" ><input value="Submit" type="submit"></a></td>
                </tr>
            </table> 
        </form>
    </fieldset>
</body>
<!--<script type="text/javascript" href="resources/js/calender.js"></script>
<script type="text/javascript" href="resources/js/jquery.datetimepicker.js"></script>
<script type="text/javascript" href="resources/js/jquery.js"></script>    -->
</html>