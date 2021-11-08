package lesson3;

import java.util.Scanner;

public class SwitchCase {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your day number: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect!!");
                break;
        }
    }
}
