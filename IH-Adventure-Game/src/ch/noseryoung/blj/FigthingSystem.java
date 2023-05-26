package ch.noseryoung.blj;

import java.util.Scanner;

public class FigthingSystem {
    public void fightBoss1(Player player){
        Scanner scan = new Scanner(System.in);
        String playerCommand;

        do {
            System.out.println("Fight: ");
            playerCommand = scan.nextLine();

            if (playerCommand.equals("use sword")){
                    System.out.println("Yeahhhh you have beaten the boss!!");
            }
        }while (true);
    }
}
