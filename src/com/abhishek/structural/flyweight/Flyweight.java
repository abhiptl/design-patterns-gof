package com.abhishek.structural.flyweight;

/**
 * Created by AbhishekPatel on 9/20/2017.
 */
public class Flyweight {
    public static final int ROWS = 6, COLS = 10;
    public static void main( String[] args ) {
        FlyweightFactory theFactory = new FlyweightFactory( ROWS );
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++)
                theFactory.getFlyweight( i ).report( j );
            System.out.println();
        }
    }

}

class Gazillion2 {
    private int row;

    public Gazillion2(int row) {
        this.row = row;
    }

    public void report(int col) {
        System.out.print( " " + row + col );
    }
}

class FlyweightFactory {
    Gazillion2[] pool;

    public FlyweightFactory( int maxRows ) {
        pool = new Gazillion2[maxRows];
    }

    public Gazillion2 getFlyweight( int theRow ) {
        if (pool[theRow] == null)
            pool[theRow] = new Gazillion2( theRow );
        return pool[theRow];
    }
}
