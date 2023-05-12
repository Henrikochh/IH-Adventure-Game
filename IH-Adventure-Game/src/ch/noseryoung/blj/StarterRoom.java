package ch.noseryoung.blj;

import java.util.ArrayList;

public class StarterRoom implements Room {
    private String name = "Starter Room";
    ArrayList<Item> Items = new ArrayList<Item>();
    int roomNum = 1;
    String[] Dialogues = {"Youre in the Starter Room. Be careful when enter there might be Danger!"};

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public String[] getDialogues() {
        return Dialogues;
    }
}
