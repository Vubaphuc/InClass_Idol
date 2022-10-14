package model;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolModel {
    public Idol inputIdol(){
        // gọi tới class Idol
        Idol idol = new Idol();
        //Gọi tới ClassFollowerModel+
        FollowerModel followerModel = new FollowerModel();
        //hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        // nhập các thông tin của Idol
        System.out.println("Nhập tên Idol: ");
        String nameIdol = sc.nextLine();
        System.out.println("Nhập mã số Idol: ");
        String idIdol = sc.nextLine();
        System.out.println("Nhập email Idol: ");
        String emailIdol = sc.nextLine();
        System.out.println("Nhập Group: ");
        String groupIdol = sc.nextLine();
        System.out.println("Fan hâm hộ đầu tiền: ");
        Follower follower = followerModel.inputFllower();
        System.out.println("Fan hâm mộ thứ 2: ");
        Follower follower1 = followerModel.inputFllower();
        // set dữ liệu vào bộ nhớ
        idol.setNameIdol(nameIdol);
        idol.setIdIdol(idIdol);
        idol.setEmailIdol(emailIdol);
        idol.setGroup(groupIdol);
        // list người hâm mộ
        // set dữ liệu cho array list Follower
        ArrayList<Follower>followers = new ArrayList<>();
        followers.add(follower);
        followers.add(follower1);
        // set dữ liệu array list follower vào hàm idol
        idol.setFollowers(followers);
        return idol;
    }
}
