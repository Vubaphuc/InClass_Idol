package model;

import java.util.ArrayList;

public class Idol {
    private String nameIdol;
    private String idIdol;
    private String emailIdol;
    private ArrayList<Follower> followers;
    private String group;

    public Idol() {
    }

    public Idol(String nameIdol, String idIdol, String emailIdol, ArrayList<Follower> followers, String group) {
        this.nameIdol = nameIdol;
        this.idIdol = idIdol;
        this.emailIdol = emailIdol;
        this.followers = followers;
        this.group = group;
    }

    public String getNameIdol() {
        return nameIdol;
    }

    public void setNameIdol(String nameIdol) {
        this.nameIdol = nameIdol;
    }

    public String getIdIdol() {
        return idIdol;
    }

    public void setIdIdol(String idIdol) {
        this.idIdol = idIdol;
    }

    public String getEmailIdol() {
        return emailIdol;
    }

    public void setEmailIdol(String emailIdol) {
        this.emailIdol = emailIdol;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "nameIdol='" + nameIdol + '\'' +
                ", idIdol='" + idIdol + '\'' +
                ", emailIdol='" + emailIdol + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
