package com.draft_task1_3_10;

public class Apple {

    public int posX;
    public int posY;

    public  Apple(int x, int y) {

        posX = x;
        posX = y;
    }

    public void setRandomPosition() {
        posX = Math.abs((int) (Math.random()*Draft_Task1_3_10_4.WIDTH-1));
        posY = Math.abs((int) (Math.random()*Draft_Task1_3_10_4.HEIGHT-1));
    }
}
