package com.qa.code;

public class Player extends Tile {
    int x;
    int y;
    String name;
    String availableMovements;

    public Player(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
        this.availableMovements = "You can travel either : North, East, South or West";
    }


    public String getAvailableMovements() {
        return availableMovements;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void offTheEdge(Board b, Player p){
        if (p.getX() > b.maxX) {

        }
    }
    @Override
    int getX() {
        return this.x;
    }
    @Override
    void setX(int x) {
        this.x = x;
    }
    @Override
    int getY() {
        return this.y;
    }
    @Override
    void setY(int y) {
        this.y = y;
    }
}
