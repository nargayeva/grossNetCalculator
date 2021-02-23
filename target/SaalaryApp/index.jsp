<!DOCTYPE html>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script>

        $(document).ready(function(){
            $(".button1").click(function(){
                $("#div1").load("welcomeGross.html");
            });
        });
    </script>
    <script>

        $(document).ready(function(){
            $(".button2").click(function(){
                $("#div1").load("welcomeNet.html");
            });
        });

    </script>

    <style>


        body {
            margin-top: 340px;
            background-color: #17a2b8;
        }

        .division {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        div.text {
            text-align: center;
        }

    </style>

    <meta charset="utf-8">
    <title>Salary Calculator</title>
</head>
<body>
<div id="div1" class="text"><h1> Welcome to Salary Calculator </h1></div>
<div class="division">
    <button type = "button" class = "button1" >Click here to get to Net to Gross Calculator</button>
    <button type = "button" class = "button2" >Click here to get to Gross to Net Calculator</button>
</div>


<br>

</body>
</html>