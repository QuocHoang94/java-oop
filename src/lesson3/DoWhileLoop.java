package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    /*
    * 1. Guessing number
    * 2. When
    * */
    public static void main(String[] args){
        int tryTimes = 0;
        final int MAX_TRY_TIME = 3;
        int[] myIntArr = {11,23,44,55,67,56,1,3,77,89,12};

        int randomIndex = new SecureRandom().nextInt(myIntArr.length); //Inclusive Exclusive
        int randomNumber = myIntArr[randomIndex];
        System.out.println("Randon Number " + randomNumber);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Your number: ");
            int userNumber = scanner.nextInt();
            if(userNumber == randomNumber){
                System.out.println("Hooray!");
                break;
            }
            tryTimes++; //trigger
        } while (tryTimes < MAX_TRY_TIME);

        System.out.println("See you next time!");
    }
}
