package io.zipcoder.microdb.utility;

//import java.util.ArrayList; //probably don't need but it's in the code atm

public class Twople<A, B> {

    public final A first;
    public final B second;

    public Twople(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", first, second);
    }
}


