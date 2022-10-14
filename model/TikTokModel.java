package model;

import javax.swing.*;
import java.util.ArrayList;

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
        // set dữ liệu vào hàm array list song
        ArrayList<Song>songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        // set dữ liệu array list song vào tiktok
        tiktok.setSongs(songs);
        //set giữ liệu vào hàm array list idol
        ArrayList<Idol>idols = new ArrayList<>();
        idols.add(idol);
        idols.add(idol1);
        // set dữ liệu array list idol vào tiktok
        tiktok.setIdols(idols);
        // trả dữ liệu về
        return  tiktok;
    }
}
