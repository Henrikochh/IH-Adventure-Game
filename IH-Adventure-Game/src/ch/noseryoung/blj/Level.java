package ch.noseryoung.blj;

import ch.noseryoung.blj.room.Room;

import java.util.ArrayList;

public class Level {

    private int[][] level;
    private int x;
    private int y;

    private ArrayList<Room> rooms = new ArrayList<>();

    String enterMessage = "You have no reached level 2, be carefully there might be even bigger Danger!";


    Level(int x, int y){
        level = new int[x][y];
        this.x = x;
        this.y = y;
    }

    public void setupLevel(){

        int counter = 1;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j <x; j++) {
                level[x][y] = counter;
                counter += 1;
            }
        }
    }

    public int[][] getLevel() {
        return level;
    }

    public void setLevel(int[][] level) {
        this.level = level;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
