package edu.wctc;

public abstract class Room {
    private String name;
    private Room north, south, east, west, up, down;

   public abstract String getDescription();

    public Room(String name) {
        this.name = name;
    }

    public Room getAdjoiningRoom(char dir) {
        switch (dir) {
            case 'n':
                return  north;
            case 's':
                return south;
            case 'e':
                return east;
            case 'w':
                return west;
            case 'u':
                return up;
            case 'd':
                return down;
            default:
                return null;

        }
    }

    public String getExits() {
        String exits = "The exits are: ";
        if (north != null)
            exits += "North ";
        if (south != null)
            exits += "South ";
        if (east != null)
            exits += "East ";
        if (west != null)
            exits += "West ";
        if (up != null)
            exits += "Up ";
        if (down != null)
            exits += "down ";

        return exits;
    }

    public String getName() {
        return name;
    }

    public Boolean isValidDirection(char dir){
        return getAdjoiningRoom(dir) != null;

    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}
