package lession2;

public class Break {
    public static void main(String[] args){
        int [] myIntArr = {1 ,2,3,4,5};
        int targetIndex = -1;
        for(int index = 0; index < myIntArr.length; index++){
            System.out.println(myIntArr[index]);
            if(myIntArr[index] == 4) {
                targetIndex = index;
                break;
            }
        }

        if(targetIndex < 0){
            System.out.println("The number 4 is not in the given array");
        } else {
            System.out.println("The number 4 is at the index: "+ targetIndex);
        }

    }
}
