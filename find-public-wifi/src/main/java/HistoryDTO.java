public class HistoryDTO {

    private int id;             // id
    private String lat;         // lat
    private String lnt;         // lnt
    private String search_dttm; // 검색일자

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
    public String getSearch_dttm() {
        return search_dttm;
    }
    public void setSearch_dttm(String search_dttm) {
        this.search_dttm = search_dttm;
    }
}
