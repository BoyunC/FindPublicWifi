package dto;

import java.time.LocalDateTime;

public class HistoryDTO {

    private int id;                     // id
    private String lat;                 // lat
    private String lnt;                 // lnt
    private LocalDateTime searchDttm;   // 검색일자

    public HistoryDTO() {
    }

    public HistoryDTO(int id, String lat, String lnt, LocalDateTime searchDttm) {
        this.id = id;
        this.lat = lat;
        this.lnt = lnt;
        this.searchDttm = searchDttm;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getSearchDttm() {
        return searchDttm;
    }

    public void setSearchDttm(LocalDateTime searchDttm) {
        this.searchDttm = searchDttm;
    }
}
