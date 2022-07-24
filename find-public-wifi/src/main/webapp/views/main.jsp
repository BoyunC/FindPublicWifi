<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
    <script>
        let $lat = null;
        let $lnt = null;

        window.onload = () => {
            $lat = document.getElementById("lat");
            $lnt = document.getElementById("lnt");
        }

        const getCurrentPosition = () => {

            if ('geolocation' in navigator) {
                navigator.geolocation.getCurrentPosition(function (pos) {
                    $lat.value = pos.coords.latitude;
                    $lnt.value = pos.coords.longitude;
                })
            } else {
                alert("위치 정보를 확인할 수 없으니 직접 입력해주시기 바랍니다.")
            }
        }
    </script>

    <div class="container">
        <%
            String lat = request.getParameter("lat") == null ? "0.0" : request.getParameter("lat");
            String lnt = request.getParameter("lnt") == null ? "0.0" : request.getParameter("lnt");
        %>
        <div class="input">
            <ul>
                <li>
                    <span>LAT: </span>
                    <input type="text" id="lat" value="<%=lat%>">
                </li>
                <li>
                    <span>LNT: </span>
                    <input type="text" id="lnt" value="<%=lnt%>">
                </li>
                <li>
                    <button onclick="getCurrentPosition()"><span> 내 위치 가져오기 </span></button>
                </li>
                <li>
                    <button onclick=""><span> 근처 WIFI 정보 보기 </span></button>
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
