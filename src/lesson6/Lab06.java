package lesson6;

import java.util.*;

public class Lab06 {
    private static Map<String, String> classMembers = new HashMap<>();
    private static Map<String, String> currentClassMember = new HashMap<>();
    private static Map<String, String> remainingMembers = new HashMap<>();


    public static void main(String[] args) {
        classMembers.put("k5-001", "Orly Glasbey");
        classMembers.put("k5-002", "Sig Jeannel");
        classMembers.put("k5-003", "Shelden Greyes");
        classMembers.put("k5-004", "Megen Cody");
        classMembers.put("k5-005", "Clevey Thursfield");
        classMembers.put("k5-006", "Ruthi Baldini");
        classMembers.put("k5-007", "Annecorinne Morter");
        classMembers.put("k5-008", "Duky Hurring");
        classMembers.put("k5-009", "Briana Shemelt");
        classMembers.put("k5-011", "Lexis Mostin");
        classMembers.put("k5-012", "Weidar McCombe");

        currentClassMember = classMembers;

        absentStudent();
        pickRandomMember();
    }

    public static void absentStudent() {
        int countStudentAbsent = 0;
        Scanner keyAbsentStudent = new Scanner(System.in);
        do {
            System.out.println("Input Key Number absent student");
            String yourKey = keyAbsentStudent.nextLine();
            if (currentClassMember.containsKey(yourKey)) {
                currentClassMember.remove(yourKey);
                System.out.println("Student in Class : "+currentClassMember.size());
                System.out.println(currentClassMember);
            }

            System.out.println(currentClassMember);
            System.out.println(yourKey);
            countStudentAbsent++;
        } while (countStudentAbsent < 3);
    }

    public static void pickRandomMember(){
        //pick a member from currentClassMember
        Set<String> valueSet = currentClassMember.keySet();
        List<String> valueList = new ArrayList<>(valueSet);

        int size = valueList.size();
        int randomValue = new Random().nextInt(size);

        String getKey = valueList.get(randomValue);
        String getValue = currentClassMember.get(getKey);
        System.out.println(getKey + getValue);
//        Set<String> keySet = currentClassMember.keySet();
//        List<String> keyList = new ArrayList<>(keySet);
//
//        int size = keyList.size();
//        int ranIdx = new Random().nextInt(size);
//
//        String randomKey = keyList.get(ranIdx);
//        String randomValue = currentClassMember.get(randomKey);
//
//        System.out.println("key:" + randomKey +"||"+"value:" + randomValue);
    }
}
