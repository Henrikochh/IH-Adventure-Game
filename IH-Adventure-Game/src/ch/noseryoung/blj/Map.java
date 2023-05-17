package ch.noseryoung.blj;

import ch.noseryoung.blj.room.Lagerhalle;
import ch.noseryoung.blj.room.Room;
import ch.noseryoung.blj.room.StarterRoom;

import java.util.ArrayList;

public class Map {

    Level level1;
    Level level2;
    Level level3;
    ArrayList<Level> Levels = new ArrayList<>();
    public void setupMap(){

        level1 = new Level(1,1);
        level2 = new Level(1,1);
        level3 = new Level(2,0);

        level1.setupLevel();
        level2.setupLevel();
        level3.setupLevel();

        Levels.add(level1);
        Levels.add(level2);
        Levels.add(level3);

        ArrayList<Room> rooms = new ArrayList(new StarterRoom(),new Lagerhalle);

    }
    public void enterLevel(int newLevel){
        Level currentLevel = Levels.get(newLevel);
        String enterMessage = currentLevel.getEnterMessage();

        System.out.println(enterMessage);
    }
    public String validateNewPos(int[] newPos, int level){
        int x = newPos[0];
        int y = newPos[1];

        try {
            if (level == 1){
                if (x == 1 && y == 0){
                    return "new level";
                }
                int tets = level1.getLevel()[newPos[1]][newPos[2]];
            } else if (level == 2) {
                if (x == 0 && y == 1){
                    return "new level";
                }
                int test = level1.getLevel()[newPos[1]][newPos[2]];
            } else if (level == 3) {
                if (x == 0 && y == 0){
                    return "new level";
                }
                int test = level1.getLevel()[newPos[1]][newPos[2]];
            }
            return "allowed";
        }catch (ArrayIndexOutOfBoundsException e){
            return "no Room";
        }
    }

}
