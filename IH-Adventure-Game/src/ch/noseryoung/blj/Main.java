package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StarterRoom starterRoom = new StarterRoom();
        Map map = new Map();
        InputHandler inputHandler = new InputHandler();

        map.setupMap();

        int[][] level1 = map.getLevel1();
        int[][] level2 = map.getLevel2();
        int[][] level3 = map.getLevel3();

        int playerPosX = 0;
        int playerPosY = 0;

        int currentLevel = 1;

        String playerCommand;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our Crawler game");

        do {
            System.out.println("Command: ");
            playerCommand = scan.nextLine();



            if (inputHandler.validateInput(playerCommand)){
                switch (playerCommand){
                    case "go north":
                        String validation = map.validateNewPos(new int[]{playerPosX + 1, playerPosY}, currentLevel)
                        if (){
                            playerPosX = playerPosX + 1;

                        }
                        break;
                }
            }else {

            };


        }while (true);

    }
}