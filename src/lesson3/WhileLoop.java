package lesson3;

public class WhileLoop {
    /*
    * 1.Syntax
    * 2. When
    * 3. Break keyword again
    * 4. MenuWithWhileLoop
    * */
    public static void main (String[] args){
        int count = 0;
        while(count <10){
            System.out.println(count);
            count++;
            if (count == 7){
                break;

            }
        }
        for(;;){
            count++;
            if(count == 7){
                break;
            }
        }
//        for(;count <10;){
//            System.out.println(count);
//            count++;
//        }

        System.out.println("Current value:" + count);
        System.out.println("Out of the while loop!");
    }
}
