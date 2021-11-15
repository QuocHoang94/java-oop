package lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    //    collections List Map Set
    public static void main(String[] args) {
        /*Declaration*/
//        List<> myArrList = Arrays.asList(1,2,3);
        List<Integer> myArrList = new ArrayList<>();
        /*
         * CRUD
         * CREATE
         * ADD READ
         * GET
         * UPDATE
         * DELETE
         * */
        myArrList.add(1); // Index: 0
        myArrList.add(2); // Index: 1

        /*Read - Get*/
        System.out.println(myArrList.get(0));
        /**/
        System.out.println(myArrList.size());
        //Add
        myArrList.add(2, 3);
        myArrList.set(myArrList.size() - 1, 10);
        //Delete
        myArrList.remove(myArrList.size() - 1);
    }
}
