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
        int random = Helpers.generateRandomNumber(0, Direction.values().length);
        return Direction.values()[random];
    }

}
