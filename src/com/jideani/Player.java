package com.jideani;

public class Player {
    private int id;
    private String name;
    private String username;
    private String position;
    private String currentClub;
    private String rating;

    public void playerRating(String rating){
        this.rating = rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
