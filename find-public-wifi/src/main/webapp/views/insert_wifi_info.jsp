<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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

    <div class="container">
        <div class="pop-up">
            <div class="Text">
                <% if (result > 0) { %>
                    <h1> <%=result %>건의 데이터를 성공적으로 저장했습니다.</h1>
                    <a href="http://localhost:8080">메인 화면으로 돌아가기</a>
                <%} else {%>
                    데이터 저장 실패
                <%} %>
            </div>
        </div>
    </div>
</body>
</html>
