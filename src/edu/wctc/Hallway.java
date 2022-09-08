package edu.wctc;

public class Hallway extends Room {

public Hallway() {super("Hallway");}

    @Override
    public String getDescription() {
        return "This clearly is a hallway of sorts with rooms in all four directions";
    }

    @Override
    public void setNorth(Room north) {
        super.setNorth(north);
    }

    @Override
    public void setSouth(Room south) {
        super.setSouth(south);
    }

    @Override
    public void setEast(Room east) {
        super.setEast(east);
    }

    @Override
    public void setWest(Room west) {
        super.setWest(west);
    }
}
