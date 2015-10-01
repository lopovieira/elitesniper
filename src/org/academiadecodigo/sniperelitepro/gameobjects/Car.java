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

    int carX = pic.getX();
    int carY = pic.getY();

    // boolean isCrashed;

    public int getCarX() {
        return carX;
    }

    public int getCarY() {
        return carY;
    }

    public void drawObject() {

        pic.draw();
        //System.out.println("Car with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    public void moveCar() {

        Direction d = getDirection();
        //System.out.println(d);

        switch (d) {
            case UP:
                if(pic.getY() - carSpeed <= 0) {
                    moveCar();
                } else {
                    pic.load("elitesniper/resources/car-up.png");
                    pic.translate(0, -carSpeed);
                }
                break;
            case DOWN:
                if(pic.getY() + carSpeed >= Grid.getHeight() - 15){
                    moveCar();
                }else{
                    pic.load("elitesniper/resources/car-down.png");
                    pic.translate(0, carSpeed);
                }
                break;
            case LEFT:
                if(pic.getX() - carSpeed <= 0){
                    moveCar();
                }else{
                    pic.load("elitesniper/resources/car-left.png");
                    pic.translate(-carSpeed, 0);
                }
                break;
            case RIGHT:
                if(pic.getX() + carSpeed >= Grid.getWidth() - 15){
                    moveCar();
                }else{
                    pic.load("elitesniper/resources/car-right.png");
                    pic.translate(carSpeed, 0);
                }
                break;
            default:
                System.out.println("Invalid stupid position or wtv.");
                break;
        }
       // System.out.println("Car pos, X: "+pic.getX() + " , Y: "+pic.getY());
    }

    /*
    public void moveInDirection(Direction dir) {

        int dx, dy;
        // update delta coordinates depending on dir

        // test if possible to move

        moveInDirection(getDirection());

    }*/

    Direction getDirection() {
        Direction newDirection = lastDirection;
        int randNum = Helpers.generateRandomNumber(0, 5);

        if (randNum >= 4) {
            newDirection = Direction.getRandomDirection();

            if (lastDirection.isOpposite(lastDirection, newDirection) || newDirection == lastDirection) {
                return getDirection();
            } else {
                lastDirection = newDirection;
            }
        }
        return newDirection;
    }

    @Override
    public String getMessage() {
        return "A lovely Car.";
    }
}
