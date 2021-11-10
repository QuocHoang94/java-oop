package lession2;

import java.util.Scanner;

public class Exercise01 {
    public static  void main(String[] args){
        int[] myIntArr = {9000,99,100,2,46,99,77,66,33};
        int Max = 0;
        int Min = myIntArr[0];
        for (int i =0;i<myIntArr.length;i++){
            if(myIntArr[i] > Max){
                Max = myIntArr[i];
            }
            if(myIntArr[i] < Min){
                Min = myIntArr[i];
            }
        }
        System.out.println("Max = "+ Max);
        System.out.println("Min = " + Min);

    }
}
