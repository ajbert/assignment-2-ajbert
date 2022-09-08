package edu.wctc;

public class StoreRoom extends Room implements Interactable, Lootable{

    public StoreRoom(){super("Store Room");}
    Boolean haveRing = false;

    @Override
    public String getDescription() {
        if (!haveRing)
        return "This is a store room with various barrels, boxes, and jars.  \n " +
                "Gleaming unnaturally in the dimly lit room is a ring on the finger of a child-sized skeleton with enormous feet";
        else
            return "This is a store room with various barrels, boxes, and jars.  \n " +
        "In the corner lies a child-sized skeleton with enormous feet";
    }

    @Override
    public void setSouth(Room south) {
        super.setSouth(south);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(30);
        player.addToInventory("Ring of Visibility");
        haveRing = true;
        return "You remove the ring from the finger of the skeleton. It feels warmer that it should be, having been in this cool dank room. \n You look through the other containers in the room and found in the room but find nothing valuable";
    }

    @Override
    public String interact(Player player) {
        player.addToScore(20);
        return "You examine the ring and you swear it's just the right size for your finger. You can hear a faint whisper in a language you don't understand coming from the ring";
    }
}
