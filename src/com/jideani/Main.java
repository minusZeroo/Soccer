package com.jideani;

public class Main {

    public static void main(String[] args) {

        Player Mason = new Player();
        Mason.setName("Mason");
        Mason.setCurrentClub("Chelsea");

        System.out.println("His current club is: " + Mason.getCurrentClub());
    }
}
