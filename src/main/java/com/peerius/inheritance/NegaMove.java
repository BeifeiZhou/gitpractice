package com.peerius.inheritance;

/**
 * Created by bzhou on 06/06/16.
 */
public class NegaMove implements MoveMethod {
    public Point move(Point point, int dx, int dy) {
        return new Point(point.x - dy, point.y - dy);
    }
}
