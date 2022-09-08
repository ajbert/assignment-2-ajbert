package edu.wctc;

public class BlockedPassage extends Room implements Exitable{

    public BlockedPassage(){super("Blocked Passage");}


    @Override
    public String getDescription() {

        return "This is long hallway that appears to have been caved in at the end. Day light and fresh air comes through the spaces between the debris";

    }

    @Override
    public String exit(Player player) {

        return "You manage to move enough rocks and debris to slid your body through, reaching the mouth of the cave";
    }
}

