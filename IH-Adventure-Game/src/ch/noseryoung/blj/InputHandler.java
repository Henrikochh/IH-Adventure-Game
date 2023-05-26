package ch.noseryoung.blj;

import ch.noseryoung.blj.items.Item;
import ch.noseryoung.blj.items.Key;
import ch.noseryoung.blj.room.BossRoom;
import ch.noseryoung.blj.room.Room;
import ch.noseryoung.blj.room.Wall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputHandler {
    public boolean getInput(Player player, Map map) {

        Scanner scan = new Scanner(System.in);
        String playerCommand;
        String empty = "";
        FigthingSystem figthingSystem = new FigthingSystem();

        Wall wall = new Wall();

        do {
            Room currentRoom = player.getCurrentRoom();
            System.out.print("Command: ");
            playerCommand = scan.nextLine();

            String[] splittedCommand = playerCommand.split(" ");
            ArrayList<String> splittedCommandList = new ArrayList<>(Arrays.asList(splittedCommand));

            for (int i = 0; i < splittedCommand.length; i++) {
                splittedCommand[i] = splittedCommand[i].replaceAll(" ", "");
            }
            if (splittedCommandList.contains(empty)) {
                for (String command : splittedCommandList) {
                    if (command.equals("")) {
                        splittedCommandList.remove(command);
                    }
                }
            }

            switch (splittedCommandList.get(0)) {
                case "go":
                    Room newRoom = currentRoom.getConnectedRooms().get(splittedCommandList.get(1));
                    if (newRoom != null) {
                        if (newRoom.getName().equals("Wall")){
                            System.out.println("Sorry but you can't go through here there is a wall!");
                        } else if (newRoom.getName().equals("BossRoom")) {
                            Boolean foundCard = false;
                            for (Item item: player.getInventory()) {
                                if (item.getName().equals("Security Card lvl 1")){
                                    map.playRoom(newRoom);
                                    foundCard = true;
                                }
                            }
                            if (!foundCard){
                                System.out.println("Sorry but you are missing a key for the Security Door");
                            }

                        } else {
                            map.playRoom(newRoom);
                            player.setCurrentRoom(newRoom);
                        }
                    } else {
                        System.out.println("Invalid Command!-");
                    }
                    break;
                case "grab":
                    if (splittedCommandList.get(1).equals("items")) {
                        ArrayList<Item> items = currentRoom.getItems();
                        player.getInventory().addAll(items);
                        System.out.println("Items added to you inventory:");
                        for (Item item : items) {
                            System.out.println("- " + item.getName());
                        }
                        items.clear();
                    }
                    break;
                default:
                    System.out.println("Invalid Command!");

                    break;
            }


        } while (true);

    }
}
