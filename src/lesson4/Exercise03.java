package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        String myStr = "12345n678";
//        String myValue = myStr.replaceAll("[a-zA-Z]+","");
//        String myResolve = myValue.replace(" ", "");
//        System.out.println("Extract digit character from that String: "+ myResolve);
        char[] myNewStr = myStr.toCharArray();
        List<Character> myArrList = new ArrayList<>();
        for (int i = 0; i < myNewStr.length; i++) {
            if (Character.isDigit(myNewStr[i])) {
                myArrList.add(myNewStr[i]);
            }
        }
//        Using List.toString() method
        System.out.println(3*myArrList.size()-1);
        String string = myArrList.toString()
                .substring(1, 3*myArrList.size()-1)
                .replaceAll(", ", "");
        System.out.println("Resolve : " + string);
    }
}
