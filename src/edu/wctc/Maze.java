package edu.wctc;

public class Maze {
     Room currentRoom;
     Player player = new Player();
     Boolean isFinished = false;

     public Maze(){
          Closet closet = new Closet();
          Hallway hallway = new Hallway();
          StoreRoom storeRoom = new StoreRoom();
          BedRoom bedRoom = new BedRoom();
          Kitchen kitchen = new Kitchen();
          BlockedPassage blockedPassage = new BlockedPassage();

          player.addToInventory("Shovel");

          currentRoom = closet;

          closet.setEast(hallway);
          hallway.setWest(closet);
          hallway.setNorth(storeRoom);
          hallway.setSouth(bedRoom);
          hallway.setEast(kitchen);
          storeRoom.setSouth(hallway);
          bedRoom.setNorth(hallway);
          kitchen.setWest(hallway);
          kitchen.setEast(blockedPassage);
          blockedPassage.setWest(kitchen);

     }

     public String exitCurrentRoom(){
          if (currentRoom instanceof Exitable)
               return (((Exitable) currentRoom).exit(player));
          else
               return "Room is not an exit";
     }

     public String interactWithCurrentRoom(){
          if (currentRoom instanceof Interactable)
               return (((Interactable)currentRoom).interact(player));
          else
               return "There's nothing to interact with here";
     }

     public String lootCurrentRoom(){
          if (currentRoom instanceof Lootable)
               return (((Lootable)currentRoom).loot(player));
          else
               return "There's nothing of value to loot here";
     }

     public Boolean move(char dir){
          if (currentRoom.isValidDirection(dir)){
               switch (dir) {
                    case 'n':
                         currentRoom = currentRoom.getAdjoiningRoom('n');
                         break;
                    case 's':
                         currentRoom = currentRoom.getAdjoiningRoom('s');
                         break;
                    case 'e':
                         currentRoom = currentRoom.getAdjoiningRoom('e');
                         break;
                    case 'w':
                         currentRoom = currentRoom.getAdjoiningRoom('w');
                         break;
                    case 'u':
                         currentRoom = currentRoom.getAdjoiningRoom('u');
                         break;
                    case 'd':
                         currentRoom = currentRoom.getAdjoiningRoom('d');
                         break;
               }
                    return true;
          }
          else return false;

     }

     public String getCurrentRoomDescription(){
          return currentRoom.getDescription();
     }

     public String getCurrentRoomExits(){
          return currentRoom.getExits();
     }

     public Boolean isFinished(){
          return isFinished;
     }

     public int getPlayerScore(){
          return player.getScore();
     }
     public String getPlayerInventory(){
          return player.getInventory();
     }
}

