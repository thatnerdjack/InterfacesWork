package com.github.thatnerdjack.interfaceswork;

/**
 * Created by block7 on 12/1/14.
 */
public class Bar extends OurInteger implements Comparable<Bar> {

    public Bar(int n) {
        super(n);
    }

    public int compareTo(Bar o) {
        boolean meEven = ((myInteger.intValue() % 2) == 0);
        boolean theyEven = ((o.myInteger.intValue() % 2) == 0);

        if (!meEven && theyEven) {
            return -1;
        } else if (meEven && !theyEven) {
            return 1;
        } else {
            return (myInteger.intValue() - o.myInteger.intValue());
        }
    }

}
