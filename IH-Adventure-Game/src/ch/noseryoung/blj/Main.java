package ch.noseryoung.blj;

import ch.noseryoung.blj.items.Food;
import ch.noseryoung.blj.items.Item;
import ch.noseryoung.blj.room.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        InputHandler inputHandler = new InputHandler();
        Player player = new Player();
        ArrayList<Level> levels = map.setupMap();


        System.out.println("Welcome to our Crawler game");
        player.setCurrentRoom(map.level1.getRooms().get(0));
        map.playRoom(map.level1.getRooms().get(0));

        inputHandler.getInput(player, map);


    }
}