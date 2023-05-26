package ch.noseryoung.blj.room;

import ch.noseryoung.blj.items.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class ControlCenter extends Room {
    private ArrayList<Item> items = new ArrayList<>();
    public ControlCenter(){
        super("ControlCenter",2, new String[]{"This is the Control Center. There is probably some stuff to do in here"});
    }

}
