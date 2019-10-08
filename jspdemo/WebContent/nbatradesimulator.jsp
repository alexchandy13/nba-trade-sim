<%@ page import= "com.test1.jsp.PlayerOpt" %>
<%@ page import= "com.test1.jsp.TmOpt" %>

<html>
<body bgcolor="#20437c" text="#ffffff" style="font-family:verdana; font-size: 150%;">


<h1 >NBA Trade Simulator</h1>

<hr>
<h2 style="font-size: 50%; font-family:arial; color:#99e88d;">
<form action="nbaform.jsp">

Tm 1 Asset 1: <select name="T1A1">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("1")) %>
	
	
</select>

Tm 1 Asset 1 Dest.: <select name="DT1A1"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 1 Asset 2: <select name="T1A2">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("2"))%>
	
</select>

Tm 1 Asset 2 Dest.: <select name="DT1A2"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 1 Asset 3: <select name="T1A3">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 1 Asset 3 Dest.: <select name="DT1A3"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 1 Asset 4: <select name="T1A4">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 1 Asset 4 Dest.: <select name="DT1A4"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 1 Asset 5: <select name="T1A5">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 1 Asset 5 Dest.: <select name="DT1A5"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 1 Asset 6: <select name="T1A6">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 1 Asset 6 Dest.: <select name="DT1A6"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>
</h2>
<hr>
<h3 style="font-size: 50%; font-family:arial; color:#eaa6a6;">
<form action="nbaform.jsp">

Tm 2 Asset 1: <select name="T2A1">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("1")) %>
	
</select>

Tm 2 Asset 1 Dest.: <select name="DT2A1"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 2 Asset 2: <select name="T2A2">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("2"))%>
	
</select>

Tm 2 Asset 2 Dest.: <select name="DT2A2"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 2 Asset 3: <select name="T2A3">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 2 Asset 3 Dest.: <select name="DT2A3"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 2 Asset 4: <select name="T2A4">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 2 Asset 4 Dest.: <select name="DT2A4"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 2 Asset 5: <select name="T2A5">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 2 Asset 5 Dest.: <select name="DT2A5"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 2 Asset 6: <select name="T2A6">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 2 Asset 6 Dest.: <select name="DT2A6"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>


<hr>
</h3>

<h4 style="font-size: 50%; font-family:arial; color:#c6caff;">

<form action="nbaform.jsp">
Tm 3 Asset 1: <select name="T3A1">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("1")) %>
	
</select>

Tm 3 Asset 1 Dest.: <select name="DT3A1"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 3 Asset 2: <select name="T3A2">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("2"))%>
	
</select>

Tm 3 Asset 2 Dest.: <select name="DT3A2"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 3 Asset 3: <select name="T3A3">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 3 Asset 3 Dest.: <select name="DT3A3"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 3 Asset 4: <select name="T3A4">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 3 Asset 4 Dest.: <select name="DT3A4"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 3 Asset 5: <select name="T3A5">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 3 Asset 5 Dest.: <select name="DT3A5"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 3 Asset 6: <select name="T3A6">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 3 Asset 6 Dest.: <select name="DT3A6"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<hr>
</h4>

<h5 style="font-size: 50%; font-family:arial; color:#fcf9a4;">
<form action="nbaform.jsp">
Tm 4 Asset 1: <select name="T4A1">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("1")) %>
	
</select>

Tm 4 Asset 1 Dest.: <select name="DT4A1"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 4 Asset 2: <select name="T4A2">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("2"))%>
	
</select>

Tm 4 Asset 2 Dest.: <select name="DT4A2"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 4 Asset 3: <select name="T4A3">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 4 Asset 3 Dest.: <select name="DT4A3"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 4 Asset 4: <select name="T4A4">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 4 Asset 4 Dest.: <select name="DT4A4"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 4 Asset 5: <select name="T4A5">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 4 Asset 5 Dest.: <select name="DT4A5"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>

<br>

Tm 4 Asset 6: <select name="T4A6">
	<option>None 0 0 0 0 0 0 0 0 0 </option>
	<%=PlayerOpt.TradeSim(request.getParameter("3"))%>
	
</select>

Tm 4 Asset 6 Dest.: <select name="DT4A6"> 
	<option>None</option>
	<%=TmOpt.TradeSim(request.getParameter("1")) %>
	
</select>
</h5>




<input type="submit" value="See Trade Probability" style="height:50px;width:200px" /> 

</form>

</body>

</html>