package com.jideani;

public class Main {

    public static void main(String[] args) {

        //which competition does he play
        Player Mason = new Player();
        Mason.setName("Mason");
        Mason.setRating("89");
        Mason.setCurrentClub("Chelsea");

        System.out.println("His current club is: " + Mason.getCurrentClub());
    }
}
