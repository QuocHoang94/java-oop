package lession2;

import java.util.Arrays;

public class Exercise03 {
    private static void sortArray(int[] arr)
    {
        int temp = arr[0];
        for (int i=0; i< arr.length -1;i++){
            for(int j= i +1 ; j < arr.length ;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp ;
                }
            }
        }
    }

    private static void showOff(int[] arr)
    {
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args){
        int[] myIntArr = {9, 3, 6, 4, 1, 9, 8, 2, 3};
        sortArray(myIntArr);
        showOff(myIntArr);
    }
}
