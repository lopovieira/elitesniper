package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;

/**
 * Created by cadet on 28/09/15.
 */
public class Tree extends GameObject implements Drawable {

    public void drawObject(){
        Picture pic = new Picture(getRandomX(), getRandomY(), "elitesniper/resources/tree.png");
        pic.draw();

        System.out.println("Tree with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    @Override
    public String getMessage(){
        return "A lovely Tree.";
    }

}
