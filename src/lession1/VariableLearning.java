package lession1;

public class VariableLearning {
    public static void main(String[] args) {

//        Variable declaretion
        int myIntNum = 1;
        float myFloatNum = 1F;
        double myDoubleNum = 1.0;
        char c = 'a'; /*Single qoute*/
        boolean amIfalse = true;

        int num1 = 1;
        int num2 = 2;
        boolean isNum1LessThanNum2 = num1 < num2;
        boolean isNum1BiggerNum2 = num1 > num2;

        System.out.println("=======INT=======");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("=======BYTE=======");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("=======SHORT=======");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
}
