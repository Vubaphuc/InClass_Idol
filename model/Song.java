package model;

public class Song {
    private String idSong;
    private String nameSong;
    private String singerSong;

    public Song() {
    }

    public Song(String idSong, String nameSong, String singerSong) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singerSong = singerSong;
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSingerSong() {
        return singerSong;
    }

    public void setSingerSong(String singerSong) {
        this.singerSong = singerSong;
    }


}
