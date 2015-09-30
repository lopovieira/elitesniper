package org.academiadecodigo.sniperelitepro.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.sniperelitepro.gameobjects.GameObject;

/**
 * Created by cadet on 28/09/15.
 */
public class Grid {

    public static int width;
    public static int height;

    public static void init(int width, int height){
        Grid.width = width;
        Grid.height = height;
    }

    public static void draw(GameObject[] gameObjects) {

        Rectangle grid = new Rectangle(0,0,width, height);
        grid.setColor(Color.LIGHT_GRAY);
        grid.fill();

        for(GameObject gameObject : gameObjects){
            gameObject.drawObject();
        }

    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
