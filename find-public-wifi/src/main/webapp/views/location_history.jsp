<%@ page import="dto.HistoryDTO" %>
<%@ page import="service.HistoryService" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>위치 히스토리 목록</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<%@ include file="/views/include/header.jsp" %>
<div class="container">
    <%
        int id = request.getParameter("id") == null ? -1 : Integer.parseInt(request.getParameter("id"));
        System.out.println("id = " + id);

        if (id != -1) {
            HistoryService.deleteSearchHistory(id);
        }

    %>
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

            int cnt = historyList.size();

            if (historyList != null) {
                for (HistoryDTO historyDTO : historyList) {
                    out.write("<tr>");
                    out.write("<td>" + cnt-- + "</td>");
                    out.write("<td>" + historyDTO.getLat() + "</td>");
                    out.write("<td>" + historyDTO.getLnt() + "</td>");
                    out.write("<td>" + historyDTO.getSearchDttm() + "</td>");
                    out.write("<td>  <button id=" + historyDTO.getId() + " onclick=\"deleteHistoryBtn(this)\" ><span> 삭제 </span></button> </td>");
                    out.write("</tr>");
                }

            } else {
                out.write("<td colspan='17'> 위치 정보를 조회하신 이력이 없습니다다. </td>");
           }

        %>
        </tbody>
    </table>
</div>
<script>
    const deleteHistoryBtn = (e) => {
        let id = e.id;

        if (id !== "") {
            window.location.assign("http://localhost:8080/views/location_history.jsp?id=" + e.id);
        } else {
            alert ("아이디 정보 없음")
        }
    }
</script>
</body>
</html>
