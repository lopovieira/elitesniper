package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class GameObject implements Drawable {

    Picture pic;

    int randomX = Helpers.generateRandomNumber(0, Grid.getWidth());
    int randomY = Helpers.generateRandomNumber(0, Grid.getHeight());

    public int getRandomX() {
        return randomX;
    }

    public int getRandomY() {
        return randomY;
    }

    public void drawObject() {
    }

    public String getMessage(){
        return null;
    }


}
