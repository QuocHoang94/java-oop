package lesson5;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ArrayListLearning {
    public static  void main(String[] args){
        List<Integer> myArr = new ArrayList<>();

        myArr.add(1);
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        myArr.add(2);

        Set<Integer> set = new HashSet<>(myArr);
        List<Integer> newMyArr = new ArrayList<>(set);
        for(Integer integer : newMyArr){
            System.out.println(integer);
        }

        //Sort
        Collections.sort(myArr); // Ascending
        Collections.sort(myArr, Collections.reverseOrder()); // Descending

        //Sublist
        List<Integer> targetArrList = myArr.subList(0,2); // 2nd parameter EXCLUSIVE
        System.out.println("======");
        for(Integer integer : targetArrList){
            System.out.println(integer);
        }

//        myArr.removeAll(Arrays.asList(1));
//
//        for(Integer integer : myArr){
//            System.out.println(integer);
//        }
//        List<Integer> newArrList = new ArrayList<>();
//        for(Integer number: myArr ){
//            if(newArrList.isEmpty()){
//                newArrList.add(number);
//            }
//            if(!newArrList.contains(number)){
//                newArrList.add(number);
//            }
//        }
//
//        for(Integer integer : newArrList){
//            System.out.println(integer);
//        }
    }
}
