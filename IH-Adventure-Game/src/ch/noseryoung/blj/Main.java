package ch.noseryoung.blj;

import ch.noseryoung.blj.room.StarterRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        InputHandler inputHandler = new InputHandler();

        ArrayList<Level> levels = map.setupMap();

        int playerPosX = 0;
        int playerPosY = 0;
        int currentLevel = 1;
        int currentRoom = 1;

        String playerCommand;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our Crawler game");


        do {
            System.out.println("Command: ");
            playerCommand = scan.nextLine();

            if (inputHandler.validateInput(playerCommand)){
                switch (playerCommand){
                    case "go north":
                        String validation = map.validateNewPos(new int[]{playerPosX, playerPosY}, currentLevel);
                        if (validation.equals("allowed")){
                            playerPosX = playerPosX + 1;
                            currentRoom = map.getRoomNum(levels.get(currentLevel), playerPosX, playerPosY);
                            map.playRoom(levels.get(currentLevel), currentRoom);
                        } else if (validation.equals("new level")) {
                            currentLevel += 1;
                            currentRoom += 1;
                            map.enterLevel(currentLevel);
                        } else if (validation.equals("no Room")) {
                            System.out.println("Sorry but you cant go through walls!");
                        }
                        break;
                }
            }else {

            };


        }while (true);

    }
}