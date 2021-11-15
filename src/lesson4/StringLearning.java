package lesson4;

public class StringLearning {
    public static void main(String[] args){
        String s1 = "Cat"; // String pool
        String s2 = "Cat"; // String pool
        System.out.println((s1 == s2));

        String s3 = new String("Cat");
        String s4 = new String("Cat");
        System.out.println("result " + " " +(s3 == s4));
        System.out.println(s1.equals(s3));
        /*lower cases, upper cases, number*/
        String myPassword = "123Password";
        char[] myCharacter = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;

        for(char character : myCharacter){
            if(Character.isDigit(character))
                totalDigits++;
            if(Character.isLowerCase(character))
                totalDigits++;
            if(Character.isUpperCase(character))
                totalDigits++;
        }

        if(totalLowerCases > 0 && totalLowerCases > 0 && totalUpperCases > 0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password is not matched the pattern");
        }

        /*Replacement*/
        String badWordsContainer = " bad ,very bad , sth else... ";
        String filteredStr = badWordsContainer.trim().replace("bad", "***");
        System.out.println(filteredStr);

        /*Sub-str, index, split, indexOf ...*/
        String myUrl = "https://sdetpro.com";
        String[] myUrlSplitResult = myUrl.split("");
        String[] myUrlParts = myUrl.split("://");
        for(String s: myUrlParts){
            System.out.println(s);
        }

        System.out.println(myUrl.indexOf("a"));
        System.out.println((myUrl.substring(8,19)));
        System.out.println(myUrl.substring(myUrl.indexOf("sdetpro"),myUrl.indexOf(".")));

        /*Regex - Regular Expression*/
        /*
        * item price: 999 vnd
        * tax: 99vnd
        * total: 1098 vnd
        * */

        String totalPriceStr = "1098 vnd";
        String totalPriceNumStr = totalPriceStr.replaceAll("[^0-9]","");
        int totalPriceNum = Integer.parseInt(totalPriceNumStr);
        System.out.println(totalPriceNum + 1);
    }
}
