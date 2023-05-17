package ch.noseryoung.blj.room;

import ch.noseryoung.blj.Item;

import java.util.ArrayList;

public class Room {
    private String name;
    ArrayList<Item> items = new ArrayList<>();
    int roomNum;
    String[] dialogues = new String[10];

    public Room(String name, ArrayList<Item> items, int roomNum, String[] dialogues){
        this.name = name;
        this.items = items;
        this.roomNum = roomNum;
        this.dialogues = dialogues;
    }
}
