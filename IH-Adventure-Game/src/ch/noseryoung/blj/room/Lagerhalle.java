package ch.noseryoung.blj.room;

import ch.noseryoung.blj.items.Item;
import ch.noseryoung.blj.items.Key;

import java.util.ArrayList;
import java.util.HashMap;

public class Lagerhalle extends Room {
    private ArrayList<Item> items = new ArrayList<>();
    public Lagerhalle(){
        super("Lagerhalle",4, new String[]{"This is a storage Room. Go search for some items"});
    }
    @Override
    public void setupRoom(){
        Key securityCard = new Key(1, "Security Card lvl 1");
        items.add(securityCard);

    }
    @Override
    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
