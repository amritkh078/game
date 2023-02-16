package com.Simplegame;
public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        
    }
}