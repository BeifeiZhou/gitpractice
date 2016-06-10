package com.peerius.inheritance;

import sun.awt.AWTAccessor;
import sun.text.resources.CollationData;

/**
 * Created by bzhou on 06/06/16.
 */
public class Runner {
    public static void main( String[] args )
    {
        ColorPoint colorpoint = new ColorPoint(3, 5, "red");
        ColorPoint newCP = colorpoint.move(6, 7);
        System.out.println(newCP.x);
        System.out.println(newCP.y);
        System.out.println(newCP.color);


        Point point = new Point(3, 5);
        MoveMethod mmp = new PosiMove();
        MoveMethod mmn = new NegaMove();

        System.out.println(mmp.getClass());
        System.out.println(mmn.getClass());
        

        System.out.println(mmp instanceof PosiMove);
        System.out.println(mmp instanceof NegaMove);
        System.out.println(mmp instanceof MoveMethod);

        System.out.println(mmp.move(point, 2, 3).x);
        System.out.println(mmn.move(point, 2, 3).x);
;    }
}
