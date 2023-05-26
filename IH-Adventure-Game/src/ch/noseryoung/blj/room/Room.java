package ch.noseryoung.blj.room;

import ch.noseryoung.blj.items.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    private String name;
    ArrayList<Item> items = new ArrayList<>();
    int roomNum;
    String[] dialogues = new String[10];
    private HashMap<String, Room> connectedRooms = HashMap.newHashMap(4);

    public Room(String name, int roomNum, String[] dialogues){
        this.name = name;
        this.roomNum = roomNum;
        this.dialogues = dialogues;
    }
    public void setupRoom(){

    }

    public void setupRoom(Room north, Room east, Room south, Room west){

        connectedRooms.put("north", north);
        connectedRooms.put("east", east);
        connectedRooms.put("south", south);
        connectedRooms.put("west", west);
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


    public void setConnectedRooms(HashMap<String, Room> connectedRooms) {
        this.connectedRooms = connectedRooms;
    }

    public HashMap<String, Room> getConnectedRooms() {
        return connectedRooms;
    }
}
