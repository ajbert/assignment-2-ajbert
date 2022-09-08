package edu.wctc;

public class DigSite extends Room implements Interactable {

    public DigSite() {super("Latrine Dig Site");}


    @Override
    public String getDescription() {
        return "This is the where they want the new latrine hole dug. Someone has already started digging, making your job a bit easier";
    }

    @Override
    public void setDown(Room down) {
        super.setDown(down);
    }

    @Override
    public String interact(Player player) {
        return "The dirt is fairly easy to dig especially compared to the manure you're use to shovelling back home. \n You go to shovel another load only for the dirt to give way revealing a small carved out room in the ground";
    }
}
