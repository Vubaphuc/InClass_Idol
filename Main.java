import model.SongModel;
import model.TikTokModel;
import model.Tiktok;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // gọi tới class tiktokmodel
        TikTokModel tikTokModel = new TikTokModel();
        // in ra thông tin
        System.out.println(tikTokModel.inputTiktok().toString());

    }
}