package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.sniperelitepro.grid.Grid;

/**
 * Created by cadet on 28/09/15.
 */
public class SniperRiffle extends GameObject implements Drawable{

    int x = Grid.getWidth() / 2;
    int y = Grid.getHeight() / 2;

    Picture pic;

    public void moveSniperRiffle(int deltaX, int deltaY){
        pic.translate(deltaX, deltaY);

        System.out.println("Sniper X: " + pic.getX() + " , Y: " + pic.getY());
    }

    public void drawObject(){

        pic = new Picture(x, y, "resources/sniper.png");
        pic.draw();

        System.out.println("SniperRiffle with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    @Override
    public String getMessage(){
        return "A lovely Sniper";
    }

}
