package com.peerius.inheritance;

/**
 * Created by bzhou on 06/06/16.
 */
public class PosiMove implements MoveMethod {
    public Point move(Point point, int dx, int dy) {
        return new Point(point.x + dy, point.y + dy);
    }

    public String hello()
    {
        return "This is a test";
    }
}
