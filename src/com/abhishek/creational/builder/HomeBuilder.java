package com.abhishek.creational.builder;

/**
 * Created by AbhishekPatel on 9/11/2017.
 */
public abstract class HomeBuilder {
    protected Home home;
    protected Floor floor;
    protected Wall wall;
    protected Roof roof;

    abstract protected Home createHome();
    abstract protected Floor createFloor();
    abstract protected Wall createWall();
    abstract protected Roof createRoof();

}

class WoodenHomeBuilder extends HomeBuilder {

    @Override
    public Home createHome() {
        home = new WoodenHome();
        return home;
    }

    @Override
    public Floor createFloor() {
        floor = new WoodenFloor();
        return floor;
    }

    @Override
    public Wall createWall() {
        wall = new WoodenWall();
        return wall;
    }

    @Override
    public Roof createRoof() {
        roof =  new WoodenRoof();
        return roof;
    }
}


class HomeContractor {
    public Home createHome(HomeBuilder builder) {
        Home home = builder.createHome();
        home.setFloor(builder.createFloor());
        home.setWall(builder.createWall());
        home.setRoof(builder.createRoof());

        home.printPresentation();
        home.getFloor().printRepresentation();
        home.getWall().printRepresentation();
        home.getRoof().printRepresentation();

        return home;
    }
}

abstract class Home {
    protected Floor floor;
    protected Wall wall;
    protected Roof roof;

    abstract void printPresentation();

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}

class WoodenHome extends Home {

    @Override
    void printPresentation() {
        System.out.println("Wooden Home creating");
    }
}

class BrickHome extends Home {
    @Override
    void printPresentation() {
        System.out.println("Brick Home creating");
    }
}

interface Floor {
    void printRepresentation();
}

class WoodenFloor implements Floor {
    @Override
    public void printRepresentation() {
        System.out.println("Wooden Floor");
    }
}

class BrickFloor implements Floor {
    @Override
    public void printRepresentation() {
        System.out.println("BrickFloor Floor");
    }

}


interface Wall {
    void printRepresentation();
}



class WoodenWall implements Wall {
    @Override
    public void printRepresentation() {
        System.out.println("Wooden Wall");
    }
}

class BrickWall implements Wall {
    @Override
    public void printRepresentation() {
        System.out.println("BrickFloor Wall");
    }

}


interface Roof{
    void printRepresentation();
}

class WoodenRoof implements Roof {
    @Override
    public void printRepresentation() {
        System.out.println("Wooden Roof");
    }
}

class BrickRoof implements Roof {
    @Override
    public void printRepresentation() {
        System.out.println("BrickFloor Roof");
    }

}
