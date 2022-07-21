<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>
    <div class="container">
        <div class="input">
            <ul>
                <li>
                    <span>LAT: </span>
                    <input type="text" placeholder="0.0" required>
                </li>
                <li>
                    <span>LNT: </span>
                    <input type="text" placeholder="0.0" required>
                </li>
                <li>
                    <button><span> 내 위치 가져오기 </span></button>
                </li>
                <li>
                    <button><span> 근처 WIFI 정보 보기 </span></button>
                </li>
            </ul>
        </div>

        <table>
            <thead>
            <tr>
                <th>거리(Km)</th>
                <th>관리번호</th>
                <th>자치구</th>
                <th>와이파이명</th>
                <th>도로명주소</th>

                <th>상세주소</th>
                <th>설치위치(층)</th>
                <th>설치유형</th>
                <th>설치기관</th>
                <th>서비스구분</th>

                <th>망종류</th>
                <th>설치년도</th>
                <th>실내외구분</th>
                <th>WIFI 접속환경</th>
                <th>X좌표</th>

                <th>Y좌표</th>
                <th>작업일자</th>
            </tr>
            </thead>
            <tbody>
            <%
                out.write("<td colspan='17'> 위치 정보를 입력하신 후에 조회해 주세요. </td>");
            %>
            </tbody>
        </table>
    </div>
</body>
</html>
