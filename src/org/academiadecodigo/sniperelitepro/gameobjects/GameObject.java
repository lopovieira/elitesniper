package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class GameObject implements Drawable {

    Picture pic;

    int randomX = Helpers.generateRandomNumber(0, Grid.getHeight() - 10);
    int randomY = Helpers.generateRandomNumber(0, Grid.getHeight() - 10);

    public int getRandomX() {

        while(randomX % 5 != 0){
            randomX = Helpers.generateRandomNumber(0, Grid.getWidth() - 10);
        }
        return randomX;
    }

    public int getRandomY() {

        while(randomY % 5 != 0){
            randomY = Helpers.generateRandomNumber(0, Grid.getWidth() - 10);
        }
        return randomY;
    }

    public void drawObject() {
    }

    public String getMessage(){
        return null;
    }

}
