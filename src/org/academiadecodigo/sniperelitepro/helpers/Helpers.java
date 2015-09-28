package org.academiadecodigo.sniperelitepro.helpers;

import java.util.Random;

/**
 * Created by cadet on 28/09/15.
 */
public class Helpers {

    public static int generateRandomNumber(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;

        //System.out.println("The random number is: " + randomNum);
        return randomNum;
    }

}
