package edu.wctc;

import java.util.*;

public class Player {
    int score;
    ArrayList<String> inventory = new ArrayList<>();

    public String getInventory(){

        for (String item : inventory) System.out.println(item);
        return "";
    }

    public void addToInventory(String e){
        inventory.add(e);
    }

    public void addToScore(int points){

        score += points;
    }

    public int getScore() {
        return score;
    }

}

