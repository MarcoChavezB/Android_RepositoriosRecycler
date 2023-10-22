package com.example.recyclerviewapp.Models;

public class githubUser {
    private String user;
    private String nameRepository;
    private String language;
    private int followers;

    public githubUser(String user, String nameRepository, String urlImage ,int followers){
        this.followers = followers;
        this.nameRepository = nameRepository;
        this.language = urlImage;
        this.user = user;
    }

    public String getUser(){return user;}

    public String getNameRepository(){return nameRepository;}

    public String getUrlImage(){return language;}

    public int getFollowers(){return followers;}
}
