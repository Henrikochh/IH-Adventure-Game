package ch.noseryoung.blj;

import ch.noseryoung.blj.items.Item;
import ch.noseryoung.blj.room.*;

import java.awt.*;
import java.util.ArrayList;

public class Map {

    Level level1;
    Level level2;
    Level level3;
    ArrayList<Level> Levels = new ArrayList<>();

    private Point endRoom1 = new Point(2,0);
    private Point endRoom2 = new Point(2,0);
    private Point endRoom3 = new Point(2,0);

    public ArrayList<Level> setupMap() {
        ArrayList<Room> rooms = new ArrayList<>();

        Wall wall = new Wall();
        BossRoom bossRoom = new BossRoom();

        StarterRoom starterRoom = new StarterRoom();
        Lagerhalle lagerhalle = new Lagerhalle();
        ControlCenter controlCenter = new ControlCenter();
        ResearchLab researchLab = new ResearchLab();

        starterRoom.setupRoom(controlCenter, researchLab, wall,wall);
        lagerhalle.setupRoom(wall, wall,researchLab, controlCenter);
        researchLab.setupRoom(lagerhalle,wall,wall, starterRoom);
        controlCenter.setupRoom(bossRoom,lagerhalle, starterRoom,wall);

        lagerhalle.setupRoom();

        starterRoom.setConnectedRooms(starterRoom.getConnectedRooms());
        lagerhalle.setConnectedRooms(lagerhalle.getConnectedRooms());
        researchLab.setConnectedRooms(researchLab.getConnectedRooms());
        controlCenter.setConnectedRooms(controlCenter.getConnectedRooms());

        rooms.add(starterRoom);
        rooms.add(researchLab);
        rooms.add(controlCenter);
        rooms.add(lagerhalle);

        level1 = new Level(rooms);

        level1.setRooms(rooms);

        level1.setupLevel();


        Levels.add(level1);


        return Levels;
    }

    public void enterLevel(int newLevel) {
        Level currentLevel = Levels.get(newLevel);
        String enterMessage = currentLevel.getEnterMessage();
        System.out.println(enterMessage);
    }


    public void playRoom(Room room) {
        String[] Dialogue = room.getDialogues();
        System.out.println(Dialogue[0]);
    }


}
