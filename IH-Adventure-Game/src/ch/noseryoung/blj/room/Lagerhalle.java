package ch.noseryoung.blj.room;

import ch.noseryoung.blj.Item;

import java.util.ArrayList;

public class Lagerhalle extends Room {
    Lagerhalle(){
        super("Lagerhalle", Item, 4, new String[]{"This is a storage Room. Go search for some items"});
    }
}
