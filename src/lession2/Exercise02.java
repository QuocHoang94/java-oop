package lession2;

import java.text.DecimalFormat;

public class Exercise02 {
    public static void main(String[] args){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int[] myIntArray={2,3,9,6,100,12,8,30};
        double avergeValue = 0;
        double sumValue = 0;
        for(int i=0; i< myIntArray.length;i++){
            sumValue += myIntArray[i];
            avergeValue = sumValue / myIntArray.length;
        }
        System.out.println("The average value from the array  =  "+ decimalFormat.format(avergeValue));
    }
}
