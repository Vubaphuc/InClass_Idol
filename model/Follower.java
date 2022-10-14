package model;

public class Follower {
    private String nameFollower;
    private String idFollower;
    private String emailFollower;
    private int numberOfLike;

    public Follower() {
    }

    public Follower(String nameFollower, String idFollower, String emailFollower, int numberOfLike) {
        this.nameFollower = nameFollower;
        this.idFollower = idFollower;
        this.emailFollower = emailFollower;
        this.numberOfLike = numberOfLike;
    }

    public String getNameFollower() {
        return nameFollower;
    }

    public void setNameFollower(String nameFollower) {
        this.nameFollower = nameFollower;
    }

    public String getIdFollower() {
        return idFollower;
    }

    public void setIdFollower(String idFollower) {
        this.idFollower = idFollower;
    }

    public String getEmailFollower() {
        return emailFollower;
    }

    public void setEmailFollower(String emailFollower) {
        this.emailFollower = emailFollower;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "nameFollower='" + nameFollower + '\'' +
                ", idFollower='" + idFollower + '\'' +
                ", emailFollower='" + emailFollower + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
