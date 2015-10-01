package org.academiadecodigo.sniperelitepro.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Picture;
import org.academiadecodigo.sniperelitepro.Game;
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
    }

    public void drawObject(){

        pic = new Picture(x, y, "elitesniper/resources/sniper.png");
        pic.draw();

        System.out.println("SniperRiffle with position -  x: " + pic.getX() + " y: " + pic.getY());
    }

    public void shoot(GameObject[] gameObjects){

        for(GameObject gameObject : gameObjects){

            if(gameObject instanceof Car){

                int carX = ((Car) gameObject).getCarX();
                int carY = ((Car) gameObject).getCarY();

                System.out.println("Car instance on x: " + carX + " ,y: " + carY);


                // (pic.getX() - 10) < carX >= (pic.getX() + 10) && carY == pic.getY())
                if(carX >= pic.getX() - 10 && carX <= pic.getX() + 10 && carY >= pic.getY() - 10 && carY <= pic.getY()){
                    System.out.println("HIT, WOOOOOOOW!!!");
                }else {
                    System.out.println("Missing shot baby. NOOOOOOOBIE!!!");
                }

            }

        }

        System.out.println("Shooting at pos X: " + pic.getX() + " , Y: " + pic.getY());

    }


    @Override
    public String getMessage(){
        return "A lovely Sniper";
    }

}
