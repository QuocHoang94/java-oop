package lesson4;

public class Exercise01 {
    public static void main(String[] args){
        String inputTime = "2hrs and 5 minutes";
        String[] myHours = inputTime.split("hrs");
        int numberHours = Integer.parseInt(myHours[0]);
        String[] hours = inputTime.split("hrs and");
        String getMinutes = hours[1].split("minutes")[0].replace(" ","");
        int numberMinutes = Integer.parseInt(getMinutes);
        System.out.println((numberHours*60) + numberMinutes);
    }
}
