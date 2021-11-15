package lesson4;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args){
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        do{
            System.out.println("Password");
            String yourPass = scanner.nextLine();
            boolean checkPass = yourPass.equals(myPassword);
            if(checkPass){
                System.out.println("Login Success");
                return;
            }
            temp++;
            System.out.println("Login Failed try again");
        }while(temp < 3);
        System.out.println("Login Failed");
    }
}
