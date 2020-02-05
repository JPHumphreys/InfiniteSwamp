package com.qa.code;

public class Compass {

    float distanceToTreasure;

    public Compass(){
    }

    public float getDistanceToTreasure(){

        return this.distanceToTreasure;
    }
    public void setDistanceToTreasure(Player p, Treasure t){
        int yDistance;
        int xDistance;
        if (p.getX() > t.getX()) {
            xDistance = p.getX() - t.getX();
        }else{
            xDistance = t.getX() - p.getX();
        }
        // Because of powers, don't care about negative numbers
        if (p.getY() > t.getY()) {
            yDistance = p.getY() - t.getY();
        }else{
            yDistance = t.getY() - p.getY();
        }

        float sum = (float) Math.pow(xDistance, 2) + (float) Math.pow(yDistance, 2);
        this.distanceToTreasure = (float) Math.sqrt(sum);
    }

}
