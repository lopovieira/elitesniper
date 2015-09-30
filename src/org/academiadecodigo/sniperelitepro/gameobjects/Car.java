package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.sniperelitepro.grid.Grid;
import org.academiadecodigo.sniperelitepro.helpers.Helpers;

/**
 * Created by cadet on 28/09/15.
 */
public class Car extends GameObject implements Drawable {

    Picture pic = new Picture(getRandomX(), getRandomY(), "elitesniper/resources/car.png");
    int carSpeed = 5;
    Direction lastDirection = Direction.getRandomDirection();

    public void drawObject(){

        pic.draw();

        System.out.println("Car with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    public void moveCar() {

        Direction d = getDirection();


        // if getDirection - out of screen
        /*
        switch (random) {
            case 0:
                if(!isOutOfScreen()) {
                    pic.load("elitesniper/resources/sniper.png");
                    pic.translate(carSpeed, 0);
                }
                break;
            case 1:
                pic.load("elitesniper/resources/tree.png");
                pic.translate(-carSpeed, 0);
                break;
            case 2:
                pic.load("elitesniper/resources/barrel.png");
                pic.translate(0, carSpeed);
                break;
            case 3:
                pic.load("elitesniper/resources/car.png");
                pic.translate(0, -carSpeed);
                break;
            default:
                System.out.println("Invalid stupid position or wtv.");
                break;
        }
    }

    */
    }

    Direction getDirection(){

        Direction newDirection = lastDirection;

        int randNum = Helpers.generateRandomNumber(0,5);

        if (randNum >= 4){
            newDirection = Direction.getRandomDirection();

            /*if (lastDirection.isOpposite(newDirection)) {
                return getDirection();
            }*/

        }
        return newDirection;
    }


    @Override
    public String getMessage(){
        return "A lovely Car.";
    }
}
