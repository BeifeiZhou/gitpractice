package com.peerius.inheritance;

/**
 * Created by bzhou on 06/06/16.
 */
public class ColorPoint extends Point {
    String color;
    public ColorPoint(int x, int y, String c) {
        super(x, y);
        this.color = c;
    }

    public Boolean compareWith(ColorPoint pt){
        return (pt.x == x) && (pt.y == y) && (pt.color == color);
    }

    @Override
    public ColorPoint move(int dx, int dy){
        return  new ColorPoint(x+dx, y+dy, color);
    }
}
