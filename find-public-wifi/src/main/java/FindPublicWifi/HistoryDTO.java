package FindPublicWifi;

import java.time.LocalDateTime;

public class HistoryDTO {

    private int id;                     // id
    private String lat;                 // lat
    private String lnt;                 // lnt
    private LocalDateTime search_dttm;  // 검색일자

    public HistoryDTO() {
    }

    public HistoryDTO(int id, String lat, String lnt, LocalDateTime search_dttm) {
        this.id = id;
        this.lat = lat;
        this.lnt = lnt;
        this.search_dttm = search_dttm;
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

    public LocalDateTime getSearch_dttm() {
        return search_dttm;
    }

    public void setSearch_dttm(LocalDateTime search_dttm) {
        this.search_dttm = search_dttm;
    }
}
