package ch.noseryoung.blj;

import ch.noseryoung.blj.room.Room;

import java.awt.*;
import java.util.ArrayList;

public class Level {

    private ArrayList<Room> rooms = new ArrayList<>();

    String enterMessage = "You have no reached level 2, be carefully there might be even bigger Danger!";


    Level(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public void setupLevel(){

    }



    public String getEnterMessage() {
        return enterMessage;
    }

    public void setEnterMessage(String enterMessage) {
        this.enterMessage = enterMessage;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
