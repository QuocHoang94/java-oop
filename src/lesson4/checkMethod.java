package lesson4;

public class checkMethod {
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('o'));
        String myString = " 123Hello ";
        char[] myWorld = myString.toCharArray();

        String abc = myString.replace("123","999");
        System.out.println(abc);

        int totalDigits =0;
        for(char character: myWorld){
            if(Character.isDigit(character))
                totalDigits++;
        }
    }

}
