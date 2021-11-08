package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class MenuWithWhileLoop {
    /*
    * 1. checkEvenOddNumbers
    * 2. guessingNumberGame
    * */
    public static void main(String[] args){
        /*
        * 1. check : Event, Odd Numbers
        * 2. guessingNumber*/

        boolean isContinuing = true;
        int failedAtemp = 0;
        while (isContinuing){

            if(failedAtemp == 3 ){
                System.out.println("Execeed try times!");
                break;
            }
            System.out.println("Awesome Program");
            System.out.println("1. check: Even, Odd Numbers");
            System.out.println("2. guessingNumber");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Your option: ");
            int userOptionNum = scanner.nextInt();

            if(userOptionNum == 1){
                checkEvenOddNumbers();
            } else if(userOptionNum == 2){
                guessingNumber();
            } else if(userOptionNum == 0){
                isContinuing = false;
            } else {
                failedAtemp++;
                System.out.println("Wrong optional!");
            }

        }

        System.out.println("Hello");
    }

    private static void checkEvenOddNumbers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your number: ");
            int inputNumber = scanner.nextInt();

            if(inputNumber%2 == 0){
                System.out.println(inputNumber+ "la so chan!");
            }else {
                System.out.println(inputNumber+ "la so le");
            }
    }

    private static void guessingNumber() {
        int tryTimes = 0;
        final int MAX_TRY_TIME = 3;
        int[] myIntArr = {0,1,2,3,4,5,6,7,8,9};

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
