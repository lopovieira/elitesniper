package org.academiadecodigo.sniperelitepro.grid;

import org.academiadecodigo.simplegraphics.graphics.Picture;
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

    public static void draw(GameObject[] gameObjects){

        for(GameObject gameObject : gameObjects){
            Picture p = new Picture();
        }

    }


    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
