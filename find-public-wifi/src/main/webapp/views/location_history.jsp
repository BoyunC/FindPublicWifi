<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
    <%@ include file="/views/include/header.jsp"%>
    <div class="container">
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>X좌표</th>
                <th>Y좌표</th>
                <th>조회일자</th>
                <th>비고</th>
            </tr>
            </thead>
            <tbody>
            <%
                out.write("<td colspan='17'> 기록이 없습니다. </td>");
            %>
            </tbody>
        </table>
    </div>
</body>
</html>
