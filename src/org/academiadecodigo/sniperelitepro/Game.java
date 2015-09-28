package org.academiadecodigo.sniperelitepro;

import org.academiadecodigo.sniperelitepro.gameobjects.Barrel;
import org.academiadecodigo.sniperelitepro.gameobjects.Car;
import org.academiadecodigo.sniperelitepro.gameobjects.GameObject;
import org.academiadecodigo.sniperelitepro.gameobjects.Tree;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class Game {

    // Game grid
    Grid grid;

    // Animation delay
    int delay;

    GameObject[] gameObjects;

    // Create the game grid
    // Method init to create the game objects in the field
    // Method start to start the game anim.


    public Game(int width, int height, int delay){

        Grid.init(width, height);
        this.delay = delay;

    }

    public void init(){

        Grid.draw(gameObjects);

    }

    public void start(){

        generateGameObjects();


    }

    GameObject[] generateGameObjects(){

        for(int i=0; i < gameObjects.length; i++){

            int randomNum = Helpers.generateRandomNumber(0,2);

            switch (randomNum){
                case 0: gameObjects[i] = new Car();
                    break;
                case 1: gameObjects[i] = new Barrel();
                    break;
                case 2: gameObjects[i] = new Tree();
                    break;
                default: System.out.println("Invalid game object.");
            }
        }
        return gameObjects;
    }

}
