package edu.wctc;

public class Kitchen extends Room implements Interactable, Lootable {

    public Kitchen(){super("Kitchen");}
    Boolean koboldsAlive = true;

    @Override
    public String getDescription() {

        if (koboldsAlive)
        return "This room appears to be a kitchen area with a fire pit, and various pots, pans and cutlery littering the floors and tables. \n " +
                "Out of the corner of your eye you see three smallish humanoids that look like hairless dogs with lizard like tails." +
                "\n You instinctively know these are Kobolds, an evil race of cave dwellers.";
        else
            return "This room appears to be a kitchen area with a fire pit, and various pots, pans and cutlery littering the floors and tables. \n " +
                    "The bodies of three kobolds lie on the floor";
    }

    @Override
    public String interact(Player player) {
        koboldsAlive = false;
        player.addToScore(-50);
        return "The kobolds are stunned by your presence allowing you the advantage. \n" +
                "Using your shovel as a weapon you're able to dispatch all three kobolds in quick succession. \n" +
                "You tell yourself they'd have attacked you if they could have.  but it doesn't make their doglike yelps any less haunting";

    }

    @Override
    public String loot(Player player) {
        player.addToInventory("pickaxe");
        player.addToScore(10);
        if (koboldsAlive != true)
            return "You search the bodies, finding little of value. However, you take a pickaxe near the door on the east side of the room";
        else
            return "You grab a pickaxe that was laying against the wall";

    }
}
