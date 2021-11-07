package lession2;

import java.util.Scanner;

public class SingleIfElse {
     public static void main(String[] args){
          boolean isHeOnTime = true;

          Scanner scanner = new Scanner(System.in);
          System.out.println("Age:");
          int userAge = scanner.nextInt();

          if(userAge <18) {
               System.out.println("KHONGBAN!1");
          }else if(userAge <= 55) {
               System.out.println("UNLIMITED");
          }else{
               System.out.println("OK");
          }
//          if(isHeOnTime) {
//               System.out.println("Let's talk");
//          } else {
//               System.out.println("Write a letter!");
//          }
     }
}
