package org.academiadecodigo.sniperelitepro;

import org.academiadecodigo.sniperelitepro.gameobjects.*;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class Game {

    Grid grid;
    int delay;

    GameObject[] gameObjects;

    public Game(int width, int height, int delay){

        grid.init(width, height);
        this.delay = delay;

    }

    public void init(){

        generateGameObjects();

        grid.draw(gameObjects);

    }

    public void start() throws InterruptedException{

        while (true){

            Thread.sleep(delay);

            for(GameObject gameObject : gameObjects){
                if(gameObject instanceof Car){
                    ((Car) gameObject).moveCar();
                }
            }

        }
    }


    GameObject[] generateGameObjects(){

        gameObjects = new GameObject[5];

        gameObjects[0] = new SniperRiffle();

        for(int i=1; i < gameObjects.length; i++){

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
