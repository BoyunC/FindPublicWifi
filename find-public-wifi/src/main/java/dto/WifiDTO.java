package dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class WifiDTO {

    private String distance;            // 거리
    private String xSwifiMgrNo;      // 관리번호
    private String xSwifiWrdofc;      // 자치구
    private String xSwifiMainNm;     // 와이파이명
    private String xSwifiAdres1;      // 도로명주소
    private String xSwifiAdres2;      // 상세주소
    private String xSwifiInstlFloor; // 설치위치(층)
    private String xSwifiInstlTy;    // 설치유형
    private String xSwifiInstlMby;   // 설치기관
    private String xSwifiSvcSe;      // 서비스 유형
    private String xSwifiCmcwr;       // 망종류
    private String xSwifiCnstcYear;  // 설치년도
    private String xSwifiInoutDoor;  // 실내외구분
    private String xSwifiRemars3;     // wifi 접속환경
    private String lat;                 // x좌표
    private String lnt;                 // y좌표
    private LocalDateTime workDttm;    // 작업일자

    public WifiDTO(String distance, String xSwifiMgrNo, String xSwifiWrdofc, String xSwifiMainNm, String xSwifiAdres1, String xSwifiAdres2, String xSwifiInstlFloor, String xSwifiInstlTy, String xSwifiInstlMby, String xSwifiSvcSe, String xSwifiCmcwr, String xSwifiCnstcYear, String xSwifiInoutDoor, String xSwifiRemars3, String lat, String lnt, LocalDateTime workDttm) {
        this.distance = distance;
        this.xSwifiMgrNo = xSwifiMgrNo;
        this.xSwifiWrdofc = xSwifiWrdofc;
        this.xSwifiMainNm = xSwifiMainNm;
        this.xSwifiAdres1 = xSwifiAdres1;
        this.xSwifiAdres2 = xSwifiAdres2;
        this.xSwifiInstlFloor = xSwifiInstlFloor;
        this.xSwifiInstlTy = xSwifiInstlTy;
        this.xSwifiInstlMby = xSwifiInstlMby;
        this.xSwifiSvcSe = xSwifiSvcSe;
        this.xSwifiCmcwr = xSwifiCmcwr;
        this.xSwifiCnstcYear = xSwifiCnstcYear;
        this.xSwifiInoutDoor = xSwifiInoutDoor;
        this.xSwifiRemars3 = xSwifiRemars3;
        this.lat = lat;
        this.lnt = lnt;
        this.workDttm = workDttm;
    }

    public WifiDTO() {

    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getxSwifiMgrNo() {
        return xSwifiMgrNo;
    }

    public void setxSwifiMgrNo(String xSwifiMgrNo) {
        this.xSwifiMgrNo = xSwifiMgrNo;
    }

    public String getxSwifiWrdofc() {
        return xSwifiWrdofc;
    }

    public void setxSwifiWrdofc(String xSwifiWrdofc) {
        this.xSwifiWrdofc = xSwifiWrdofc;
    }

    public String getxSwifiMainNm() {
        return xSwifiMainNm;
    }

    public void setxSwifiMainNm(String xSwifiMainNm) {
        this.xSwifiMainNm = xSwifiMainNm;
    }

    public String getxSwifiAdres1() {
        return xSwifiAdres1;
    }

    public void setxSwifiAdres1(String xSwifiAdres1) {
        this.xSwifiAdres1 = xSwifiAdres1;
    }

    public String getxSwifiAdres2() {
        return xSwifiAdres2;
    }

    public void setxSwifiAdres2(String xSwifiAdres2) {
        this.xSwifiAdres2 = xSwifiAdres2;
    }

    public String getxSwifiInstlFloor() {
        return xSwifiInstlFloor;
    }

    public void setxSwifiInstlFloor(String xSwifiInstlFloor) {
        this.xSwifiInstlFloor = xSwifiInstlFloor;
    }

    public String getxSwifiInstlTy() {
        return xSwifiInstlTy;
    }

    public void setxSwifiInstlTy(String xSwifiInstlTy) {
        this.xSwifiInstlTy = xSwifiInstlTy;
    }

    public String getxSwifiInstlMby() {
        return xSwifiInstlMby;
    }

    public void setxSwifiInstlMby(String xSwifiInstlMby) {
        this.xSwifiInstlMby = xSwifiInstlMby;
    }

    public String getxSwifiSvcSe() {
        return xSwifiSvcSe;
    }

    public void setxSwifiSvcSe(String xSwifiSvcSe) {
        this.xSwifiSvcSe = xSwifiSvcSe;
    }

    public String getxSwifiCmcwr() {
        return xSwifiCmcwr;
    }

    public void setxSwifiCmcwr(String xSwifiCmcwr) {
        this.xSwifiCmcwr = xSwifiCmcwr;
    }

    public String getxSwifiCnstcYear() {
        return xSwifiCnstcYear;
    }

    public void setxSwifiCnstcYear(String xSwifiCnstcYear) {
        this.xSwifiCnstcYear = xSwifiCnstcYear;
    }

    public String getxSwifiInoutDoor() {
        return xSwifiInoutDoor;
    }

    public void setxSwifiInoutDoor(String xSwifiInoutDoor) {
        this.xSwifiInoutDoor = xSwifiInoutDoor;
    }

    public String getxSwifiRemars3() {
        return xSwifiRemars3;
    }

    public void setxSwifiRemars3(String xSwifiRemars3) {
        this.xSwifiRemars3 = xSwifiRemars3;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLnt() {
        return lnt;
    }

    public void setLnt(String lnt) {
        this.lnt = lnt;
    }

    public LocalDateTime getWorkDttm() {
        return workDttm;
    }

    public void setWorkDttm(LocalDateTime workDttm) {
        this.workDttm = workDttm;
    }
}
