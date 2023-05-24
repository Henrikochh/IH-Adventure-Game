package ch.noseryoung.blj;

import ch.noseryoung.blj.room.*;

import java.util.ArrayList;

public class Map {

    Level level1;
    Level level2;
    Level level3;
    ArrayList<Level> Levels = new ArrayList<>();

    public ArrayList<Level> setupMap() {

        level1 = new Level(2, 2);
        level2 = new Level(1, 1);
        level3 = new Level(2, 0);

        level1.setupLevel();
        level2.setupLevel();
        level3.setupLevel();

        Levels.add(level1);
        Levels.add(level2);
        Levels.add(level3);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new StarterRoom());
        rooms.add(new ControlCenter());
        rooms.add(new ResearchLab());
        rooms.add(new Lagerhalle());

        level1.setRooms(rooms);

        return Levels;
    }

    public void enterLevel(int newLevel) {
        Level currentLevel = Levels.get(newLevel);
        String enterMessage = currentLevel.getEnterMessage();
        System.out.println(enterMessage);
    }

    public int getRoomNum(Level currentlevel, int x, int y) {
        int[][] levelArray = currentlevel.getLevel();
        return levelArray[y][x];
    }

    public void playRoom(Level level, int currentRoom) {
        Room room = level.getRooms().get(currentRoom);
        String[] Dialogue = room.getDialogues();
        System.out.println(Dialogue[0]);
    }

    public String validateNewPos(int[] newPos, int level) {
        int x = newPos[0];
        int y = newPos[1];

        if (level == 0) {
            if (x == 2 && y == 0) {
                return "new level";
            }
            if (x == level1.getX() || y == level1.getY() || x < 0 || y < 0){
                return "no Room";
            }
        } else if (level == 1) {
            if (x == 0 && y == 2) {
                return "new level";
            }
            if (x > level2.getX() || y > level2.getY() || x < 0 || y < 0){
                return "no Room";
            }
        } else if (level == 2) {
            if (x == -1 && y == 0) {
                return "new level";
            }
            if (x > level3.getX() || y > level3.getY() || x < 0 || y < 0){
                return "no Room";
            }
        }
        return "allowed";

    }

}
