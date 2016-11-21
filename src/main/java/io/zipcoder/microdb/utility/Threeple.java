package io.zipcoder.microdb.utility;


public class Threeple<A, B, C> extends Twople<A, B> {

    public final C third;

    public Threeple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
}
