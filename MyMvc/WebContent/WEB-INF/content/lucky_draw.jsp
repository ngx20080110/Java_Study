<html>
<head>
	<title>Lucky Draw</title>
	<script type="text/javascript" src="jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="timer.jquery.min.js"></script>
	<script type="text/javascript">
var t
 var x = 1200;       

     var y = 1;  
function timedCount()
 {         

   var rand = parseInt(Math.random() * (x - y + 1) + y);      

        $("#div1").html("").append("<div>" + rand + "</div>");  
 t=setTimeout("timedCount()",50)
 }
	</script>
</head>
<body onload="timedCount()">
<div id="div1">
test
</div>
</body>
</html>