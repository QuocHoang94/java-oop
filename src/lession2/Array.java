package lession2;

public class Array {
    public static  void main(String[] args){
        int [] myIntArr = {1,2,3,4,5};
        int [] myEmptyIntArr = new int[5];

        /*Read element value*/
        int myFirstNumber = myIntArr[0];
        System.out.println(myFirstNumber);
        /*Update element value*/
//        myIntArr[3] = 1;
        System.out.println(myIntArr[3]);

        /*Traditional for*/
//        int myArrLength = myIntArr.length;
//        for(int elementIndex = 0;elementIndex < myArrLength;elementIndex++){
//            System.out.println(myIntArr[elementIndex]);
//        }
//        for(int i = 0; i < myIntArr.length ; i++) {
//            System.out.println(myIntArr[i]);
//        }
        /*Enhanced for*/
//        for(int elementValue: myIntArr){
//            System.out.println(elementValue);
//        }

        /*Even numbers array*/
        int myArrLength = myIntArr.length;
        for(int elementIndex = 0;elementIndex < myArrLength;elementIndex++){
            System.out.println(myIntArr[elementIndex]*2);
        }


    }
}
