package model;

import java.util.Scanner;

public class SongModel {
    public Song inputSong(){
        // gọi tới class Song
        Song song = new Song();
        // hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        // nhập thông tin bài hát
        System.out.println("Nhập mã bài hát: ");
        String idSong = sc.nextLine();
        System.out.println("Nhập tên bài hát: ");
        String nameSong =sc.nextLine();
        System.out.println("Nhập tên tách giả: ");
        String singer = sc.nextLine();
        // set dữ liệu vào bộ nhớ
        song.setIdSong(idSong);
        song.setNameSong(nameSong);
        song.setSingerSong(singer);
        return song;
    }

}
