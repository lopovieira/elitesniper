package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;

/**
 * Created by cadet on 28/09/15.
 */
public class Barrel extends GameObject implements Drawable {

    public void drawObject(){

        pic = new Picture(getRandomX(), getRandomY(), "resources/barrel.png");
        pic.draw();

        System.out.println("Barrel with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    @Override
    public String getMessage(){
        return "A lovely Barrel.";
    }

}
