<%@ page import="dto.WifiDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="service.WifiService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>홈</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

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
                    <button id="current_position_btn"><span> 내 위치 가져오기 </span></button>
                </li>
                <li>
                    <button id="get_nearest_wifi_btn"><span> 근처 WIFI 정보 보기 </span></button>
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

                    if(!lat.equals("0.0") && !lnt.equals("0.0")) {
                        WifiService wifiService = new WifiService();
                        List<WifiDTO> wifiList = wifiService.getNearestWifiList(lat, lnt);

                        if (wifiList != null) {
                            for (WifiDTO wifiDTO : wifiList) {
                                out.write("<tr>");
                                out.write("<td>" + wifiDTO.getDistance() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiMgrNo() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiWrdofc() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiMainNm() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiAdres1() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiAdres2() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiInstlFloor() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiInstlTy() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiInstlMby() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiSvcSe() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiCmcwr() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiCnstcYear() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiInoutDoor() + "</td>");
                                out.write("<td>" + wifiDTO.getxSwifiRemars3() + "</td>");
                                out.write("<td>" + wifiDTO.getLat() + "</td>");
                                out.write("<td>" + wifiDTO.getLnt() + "</td>");
                                out.write("<td>" + wifiDTO.getWorkDttm() + "</td>");
                                out.write("</tr>");
                            }
                        }
                    } else {
                        out.write("<td colspan='17'> 위치 정보를 입력하신 후에 조회해 주세요. </td>");
                    }

                %>
            </tbody>
        </table>
    </div>

    <script>
        let getCurrentPositionBtn = document.getElementById("current_position_btn");
        let getNearestWifiBtn = document.getElementById("get_nearest_wifi_btn");
        let $lat = null;
        let $lnt = null;

        window.onload = () => {
            $lat = document.getElementById("lat");
            $lnt = document.getElementById("lnt");
        }

        getCurrentPositionBtn.addEventListener("click", function (){

            if ('geolocation' in navigator) {
                navigator.geolocation.getCurrentPosition(function (pos) {
                    $lat.value = pos.coords.latitude;
                    $lnt.value = pos.coords.longitude;
                })
            } else {
                alert("위치 정보를 확인할 수 없으니 직접 입력해주시기 바랍니다.")
            }
        });

        getNearestWifiBtn.addEventListener("click", function () {
            let lat_value = $lat.value;
            let lnt_value = $lnt.value;

            if(lat_value !== "" || lnt_value !== "") {
                window.location.assign("http://localhost:8080?lat=" + lat_value + "&lnt=" + lnt_value);
            } else {
                alert ("위치 정보를 입력하신 후에 조회해 주세요.")
            }
        });
    </script>
</body>
</html>
