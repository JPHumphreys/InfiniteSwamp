package com.qa.code;

import java.util.Scanner;

public class Game {
    boolean running;

    public Game(Boolean b){
        this.running = b;
    }

    public void setRunning(Boolean b){
        this.running = b;
    }
    public Boolean getRunning(){
        return this.running;
    }

    public void introduction(Player p){
        System.out.println("Hello " + p.getName() + ", welcome to the infinite swamp");
        System.out.println("You find yourself in a murky swamp...");
        System.out.println("You look down to see a compass in your hand");
        System.out.println("It correctly tells you where the treasure is");
    }

    public void getDisplayedInfo(Player p, Treasure t, Compass c){
        c.getDistanceToTreasure();
        p.getAvailableMovements();
    }

    public void gameLoop(Player p, Treasure t, Compass c, Scanner sc, Board b) {
        String direction;
        while(this.running){
            System.out.println("Please enter a direction. " + p.getAvailableMovements());
            direction = sc.next();

            switch(direction.toLowerCase()){
                case "north" :
                    System.out.println("Going north");
                    p.setY(p.getY() + 1);
                    if (p.getY() > b.getMaxY()){
                        p.setY(1);
                    }
                    break;
                case "east" :
                    System.out.println("Going east");
                    p.setX(p.getX() + 1);
                    if (p.getX() > b.getMaxX()){
                        p.setX(1);
                    }
                    break;
                case "south" :
                    System.out.println("Going south");
                    p.setY(p.getY() - 1);
                    if (p.getY() <= 0){
                        p.setY(b.maxY);
                    }
                    break;
                case "west" :
                    System.out.println("Going west");
                    p.setX(p.getX() - 1);
                    if (p.getX() <= 0){
                        p.setX(b.maxX);
                    }
                    break;
                default:
                    System.out.println("Invalid input, please choose from the available inputs");
                    p.getAvailableMovements();
            }
            System.out.println("Player x,y : " + p.getX() + "," + p.getY());
            c.setDistanceToTreasure(p, t);
            System.out.println("Distance to treasure: " + c.getDistanceToTreasure());
            if (c.getDistanceToTreasure() == 0){
                System.out.println("CONGRATULATIONS! You have found the treasure.");
                this.setRunning(false);
            }

        }
    }

}
