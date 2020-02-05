package com.qa.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name, adventurer : ");
        String name = sc.next();
        int boardX;
        int boardY;
        while(true) {
            System.out.println("Please enter max x size of board : ");
            boardX = sc.nextInt();
            System.out.println("Please enter max y size of board : ");
            boardY = sc.nextInt();
            if ((boardX >= 2) && (boardY >= 2)){
                break;
            } else {
                System.out.println("Board size must be of minimum 2x2");
            }
        }
        Board b = new Board(boardX, boardY);

        double r = Math.random(); // random value between 0 and 1
        int randX = (int) (r * 1000) % b.getMaxX();
        r = Math.random();
        int randY = (int) (r * 1000) % b.getMaxY();

        Player p1 = new Player(randX, randY, name);
        while(true) {
            r = Math.random(); // random value between 0 and 1
            randX = (int) (r * 1000) % b.getMaxX();
            r = Math.random();
            randY = (int) (r * 1000) % b.getMaxY();
            if ((p1.getX() != randX) && p1.getY() != randY){
                break;
            }
        }
        Treasure t = new Treasure(randX, randY);

        Compass c = new Compass();
        c.setDistanceToTreasure(p1, t);
        System.out.println("Distance to treasure: " + c.getDistanceToTreasure());
        Game g = new Game(true);
        g.introduction(p1);
        g.gameLoop(p1, t, c, sc, b);
        sc.close();
    }
}
