package ch.noseryoung.blj.room;

import ch.noseryoung.blj.Item;

import java.util.ArrayList;

public class Room {
    private String name;
    ArrayList<Item> items = new ArrayList<>();
    int roomNum;
    String[] dialogues = new String[10];

    public Room(String name, int roomNum, String[] dialogues){
        this.name = name;
        this.roomNum = roomNum;
        this.dialogues = dialogues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String[] getDialogues() {
        return dialogues;
    }

    public void setDialogues(String[] dialogues) {
        this.dialogues = dialogues;
    }
}
