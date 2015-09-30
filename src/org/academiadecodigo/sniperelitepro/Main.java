package org.academiadecodigo.sniperelitepro;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Game g = new Game(800, 600, 200);
        g.init();   // Method to insert the game objects in the scenario
        g.start();

    }
}
