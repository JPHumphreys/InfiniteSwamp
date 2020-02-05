package com.qa.code;

public class Board {
    int maxX;
    int maxY;
    public Board(int x, int y){
        this.maxX = x;
        this.maxY = y;
    }
    public int getMaxX(){
        return this.maxX;
    }
    public int getMaxY(){
        return this.maxY;
    }
}
