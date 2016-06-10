package com.peerius.inheritance;

/**
 * Created by bzhou on 06/06/16.
 */
public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point move(int dx, int dy){
        return new Point(x+dx, y+dy);
    }

}
