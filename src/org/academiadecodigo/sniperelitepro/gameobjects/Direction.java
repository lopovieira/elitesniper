package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by lopovieira on 29/09/15.
 */
public enum Direction {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static Direction getRandomDirection() {
        int random = Helpers.generateRandomNumber(0, Direction.values().length - 1);
        return Direction.values()[random];
    }

    boolean isOpposite(Direction lastDir, Direction newDir){
        switch (newDir){
            case UP: if(lastDir == Direction.DOWN) return true;
                break;
            case DOWN: if(lastDir == Direction.UP) return true;
                break;
            case LEFT: if(lastDir == Direction.LEFT) return true;
                break;
            case RIGHT: if(lastDir == Direction.LEFT) return true;
                break;
            default: System.out.println("Hello.");
        }
        return false;
    }


}
