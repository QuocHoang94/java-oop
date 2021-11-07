package lession2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        boolean isHeOnTime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int inputNum = scanner.nextInt();
        String notificationStr = "";

        /*Ternary Operatior*/
        notificationStr = inputNum == 3 ? "You input the value":"Take off";

    }
}
