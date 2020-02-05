package com.qa.code;

abstract class Tile {
    int x;
    int y;

    abstract int getX();
    abstract void setX(int x);
    abstract int getY();
    abstract void setY(int y);
}
