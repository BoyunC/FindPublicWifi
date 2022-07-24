<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="FindPublicWifi.APIService" %>
<html>
<head>
    <title>와이파이 API로부터 데이터 받아오기</title>
</head>
<body>
    <%
        APIService apiService = new APIService();
        int result = APIService.getPublicWifiJson();
    %>

    <div class="out">
            <% if (result > 0) { %>
                <div style="text-align: center;">
                    <h1><%=result %>건의 데이터를 성공적으로 저장했습니다.</h1>
                    <a href="http://localhost:8080">홈으로 돌아가기</a>
                </div>
            <%} else {%>
                <h1 style="text-align: center"> 데이터 저장 실패 </h1>
            <%} %>
    </div>

</body>
</html>
