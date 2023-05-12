package ch.noseryoung.blj;

public class Map {
    private int[][] level1 = new int[1][1];
    private int[][] level2 = new int[1][1];
    private int[][] level3 = new int[2][0];

    public void setupMap(){

        int counter = 0;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                counter++;
                level1[i][j] = counter;
                System.out.println(counter);
            }
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                counter++;
                level2[i][j] = counter;
                System.out.println(counter);
            }
        }
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 3; j++) {
                counter++;
                level3[i][j] = counter;
                System.out.println(counter);
            }
        }
    }
    public String validateNewPos(int[] newPos, int level){
        int x = newPos[0];
        int y = newPos[1];

        try {
            if (level == 1){
                if (x == 1 && y == 0){
                    return "new level";
                }
                int x = level1[newPos[1]][newPos[2]];
            } else if (level == 2) {
                if (x == 0 && y == 1){
                    return "new level";
                }
                int x = level1[newPos[1]][newPos[2]];
            } else if (level == 3) {
                if (x == 0 && y == 0){
                    return "new level";
                }
                int x = level1[newPos[1]][newPos[2]];
            }
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            return ;
        }
    }

    public int[][] getLevel1() {
        return level1;
    }

    public int[][] getLevel2() {
        return level2;
    }

    public int[][] getLevel3() {
        return level3;
    }
}
