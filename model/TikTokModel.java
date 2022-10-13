package model;

public class TikTokModel {
    public Tiktok inputTiktok(){
        Tiktok tiktok = new Tiktok();
        SongModel songModel = new SongModel();
        IdolModel idolModel = new IdolModel();
        System.out.println("Nhập Idol đầu tiên: ");
        Idol idol = idolModel.inputIdol();
        System.out.println("Nhập Idol thứ 2: ");
        Idol idol1 = idolModel.inputIdol();
        System.out.println("Nhập bài hát đầu tiên: ");
        Song song = songModel.inputSong();
        System.out.println("Nhập bài hát thứ 2: ");
        Song song1 = songModel.inputSong();
        return  tiktok;
    }
}
