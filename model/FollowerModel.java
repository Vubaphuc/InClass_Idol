package model;

import java.util.Scanner;

public class FollowerModel {
    public Follower inputFllower(){
        // Gọi tới class Follower-
        Follower follower = new Follower();
        // hàm người dùng nhập
        Scanner sc = new Scanner(System.in);
        // nhập thông tin Fan hâm mộ
        System.out.println("Nhập tên người hâm mộ: ");
        String nameFollower = sc.nextLine();
        System.out.println("Nhập mã số người hâm mộ: ");
        String idFollower = sc.nextLine();
        System.out.println("Nhập email người hâm mộ: ");
        String emailFollower = sc.nextLine();
        System.out.println("Số lượng người thích: ");
        int numberOfLike = sc.nextInt();
        sc.nextLine();
        // set dữ liệu vào bộ nhớ
        follower.setNameFollower(nameFollower);
        follower.setIdFollower(idFollower);
        follower.setEmailFollower(emailFollower);
        follower.setNumberOfLike(numberOfLike);
        return follower;
    }
}
