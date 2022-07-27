<%@ page import="FindPublicWifi.HistoryDTO" %>
<%@ page import="FindPublicWifi.HistoryService" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<%@ include file="/views/include/header.jsp" %>
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
            HistoryService historyService = new HistoryService();
            List<HistoryDTO> historyList = historyService.getSearchHistoryList();

            if (historyList != null) {
                for (HistoryDTO historyDTO : historyList) {
                    out.write("<tr>");
                    out.write("<td>" + historyDTO.getId() + "</td>");
                    out.write("<td>" + historyDTO.getLat() + "</td>");
                    out.write("<td>" + historyDTO.getLnt() + "</td>");
                    out.write("<td>" + historyDTO.getSearch_dttm() + "</td>");
                    out.write("<td> <button id=\"delete_history_btn\"><span> 삭제 </span></button> </td>");
                    out.write("</tr>");
                }

            } else {
                out.write("<td colspan='17'> 위치 정보를 조회하신 이력이 없습니다다. </td>");
           }

        %>
        </tbody>
    </table>
</div>
</body>
</html>
