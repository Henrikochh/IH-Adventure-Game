package ch.noseryoung.blj.room;

import ch.noseryoung.blj.Item;

import java.util.ArrayList;

public class StarterRoom extends Room {

    public StarterRoom(String name, ArrayList<Item> items, int roomNum, String[] dialogues){
        super("Starter Room", items, 1, new String[]{"This is the starter Room here is nothing special "});

    }

}
