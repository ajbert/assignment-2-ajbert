package edu.wctc;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

import static java.lang.Thread.sleep;

public class Main {



    public static void main(String[] args) throws InterruptedException {



        Maze maze = new Maze();
       Scanner input = new Scanner(System.in);
        //flavor text,  user inputs aren't stored as the keep master doesn't really care what you say
        System.out.println("You have been conscripted into the Imperial Army! After a several day journey you have reached a small keep on the " +
                "borderlands of the frontier. \n Despite its small size the keep is buzzing with activity, a far cry from the farming hamlet you grew up in. " +
                "\n You've barely had time to take your things to your barracks, when you are summoned to receive you duty assignment.");
        Thread.sleep(3000);
        System.out.println("You stand before a wizened old man, you recognize as the master of the keep. Hw looks you over before he begins to speak.");
        Thread.sleep(3000);
        System.out.println("What is your name, conscript?");
        input.nextLine();
        Thread.sleep(2000);
        System.out.println("Yes, of course it is, and what do you hope to be in our glorious army?");
        input.nextLine();
        Thread.sleep(2000);
        System.out.println("How interesting, I've never heard that before.");
        Thread.sleep(2000);
        System.out.println("Well I have a task especially for you that will help you towards your goals");
        Thread.sleep(2000);
        System.out.println("We have need of a new latrine, and you have the look of someone handy with a shovel \n \n \n ");


        System.out.println("The hot sun is shining down as you begin to dig the hole. You're clearly disappointed that you're stuck digging a hole, \n" +
                "but at least it beats shoveling manure like you'd be doing at home.  ");
         Thread.sleep(1000);
        System.out.println("Dig");
        Thread.sleep(1000);
        System.out.println("Dig");
        Thread.sleep(1000);
        System.out.println("Dig");
        Thread.sleep(1000);
        System.out.println("After several hours of digging, your mind wanders to escape the boredom, and you don't notice when your shovel breaks through the ceiling of cave!" +
                "\n You fall through the hole landing on the hard cave floor!");



       do {
           System.out.println(maze.currentRoom.getName());
           System.out.println(maze.currentRoom.getDescription());
           System.out.println(maze.currentRoom.getExits());

           System.out.print(">>");
           char dir = input.next().charAt(0);

           switch (dir) {
               case 'n':
                   maze.move('n');
                   break;
               case 's':
                   maze.move('s');
                   break;
               case 'e':
                   maze.move('e');
                   break;
               case 'w':
                   maze.move('w');
                   break;
               case 'u':
                   maze.move('u');
                   break;
               case 'd':
                   maze.move('d');
                   break;
               case 'l':
                   System.out.println(maze.lootCurrentRoom());
                   break;
               case 'i':
                   System.out.println(maze.interactWithCurrentRoom());
                   break;
               case 'v':
                  System.out.println( maze.getPlayerInventory());
                   break;
               case 'x':

                   System.out.println(maze.exitCurrentRoom());
                   if (maze.currentRoom instanceof Exitable) {
                       maze.isFinished = true;
                   }
                   break;

               default: System.out.println("Try again!");

           }

       } while (!maze.isFinished);

       System.out.println("Your Score: " + maze.player.getScore());
    }
}
