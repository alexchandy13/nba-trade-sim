<%@ page import= "com.test1.jsp.Value" %>

<html>
<body bgcolor="#20437c" text="#ffffff" style="font-family:verdana; font-size:200%;">
<%= Value.TradeSim(request.getParameter("T1A1"),request.getParameter("T1A2"),request.getParameter("T1A3"),
		           request.getParameter("T1A4"),request.getParameter("T1A5"),request.getParameter("T1A6"),
		           request.getParameter("T2A1"),request.getParameter("T2A2"),request.getParameter("T2A3"),
		           request.getParameter("T2A4"),request.getParameter("T2A5"),request.getParameter("T2A6"),
		           request.getParameter("T3A1"),request.getParameter("T3A2"),request.getParameter("T3A3"),
		           request.getParameter("T3A4"),request.getParameter("T3A5"),request.getParameter("T3A6"),
		           request.getParameter("T4A1"),request.getParameter("T4A2"),request.getParameter("T4A3"),
		           request.getParameter("T4A4"),request.getParameter("T4A5"),request.getParameter("T4A6"),
		           request.getParameter("DT1A1"),request.getParameter("DT1A2"),request.getParameter("DT1A3"),
		           request.getParameter("DT1A4"),request.getParameter("DT1A5"),request.getParameter("DT1A6"),
		           request.getParameter("DT2A1"),request.getParameter("DT2A2"),request.getParameter("DT2A3"),
		           request.getParameter("DT2A4"),request.getParameter("DT2A5"),request.getParameter("DT2A6"),
		           request.getParameter("DT3A1"),request.getParameter("DT3A2"),request.getParameter("DT3A3"),
		           request.getParameter("DT3A4"),request.getParameter("DT3A5"),request.getParameter("DT3A6"),
		           request.getParameter("DT4A1"),request.getParameter("DT4A2"),request.getParameter("DT4A3"),
		           request.getParameter("DT4A4"),request.getParameter("DT4A5"),request.getParameter("DT4A6")) %>		
<hr>
<button onclick="goBack()">Go Back</button>
<hr>

<script>
function goBack() {
    window.history.back();
}
</script>
</body>
</html>

