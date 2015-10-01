package org.academiadecodigo.sniperelitepro;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.sniperelitepro.gameobjects.*;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class Game implements KeyboardHandler {

    Grid grid;
    int delay;

    GameObject[] gameObjects = new GameObject[5];

    public Game(int width, int height, int delay) {

        grid.init(width, height);
        this.delay = delay;

    }

    public void init() throws InterruptedException {

        generateGameObjects();

        grid.draw(gameObjects);

        Keyboard k = new Keyboard(this);
        KeyboardEvent[] events = new KeyboardEvent[5];

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KeyboardEvent.KEY_UP);
        events[1].setKey(KeyboardEvent.KEY_DOWN);
        events[2].setKey(KeyboardEvent.KEY_LEFT);
        events[3].setKey(KeyboardEvent.KEY_RIGHT);
        events[4].setKey(KeyboardEvent.KEY_SPACE);

        for (KeyboardEvent event : events) {
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(event);
        }

    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(delay);

            for (GameObject gameObject : gameObjects) {
                if (gameObject instanceof Car) {
                    ((Car) gameObject).moveCar();
                }
            }

        }
    }


    GameObject[] generateGameObjects() throws InterruptedException {

        gameObjects[0] = new SniperRiffle();

        for (int i = 1; i < gameObjects.length; i++) {

            int randomNum = Helpers.generateRandomNumber(0, 2);

            switch (randomNum) {
                case 0:
                    gameObjects[i] = new Car();
                    break;
                case 1:
                    gameObjects[i] = new Barrel();
                    break;
                case 2:
                    gameObjects[i] = new Tree();
                    break;
                default:
                    System.out.println("Invalid game object.");
            }
        }
        return gameObjects;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                ((SniperRiffle) gameObjects[0]).shoot(gameObjects);
                //System.out.println("SPACE PRESSED.");
                break;
            case KeyboardEvent.KEY_UP:
                ((SniperRiffle) gameObjects[0]).moveSniperRiffle(0, -5);
                //System.out.println("UP PRESSED.");
                break;
            case KeyboardEvent.KEY_DOWN:
                ((SniperRiffle) gameObjects[0]).moveSniperRiffle(0, 5);
                //System.out.println("DOWN PRESSED.");
                break;
            case KeyboardEvent.KEY_LEFT:
                ((SniperRiffle) gameObjects[0]).moveSniperRiffle(-5, 0);
                //System.out.println("LEFT PRESSED.");
                break;
            case KeyboardEvent.KEY_RIGHT:
                ((SniperRiffle) gameObjects[0]).moveSniperRiffle(5, 0);
                //System.out.println("RIGHT PRESSED.");
                break;
            default:
                System.out.println("Undefined key.");
        }
        //System.out.println("x pos: " + pic.getX() + " and y pos: " + pic.getY());
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
