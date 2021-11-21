package lesson6;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RandomClassMember {
    private static Map<String, String> classMembers = new HashMap<>();
    private static Map<String, String> remainingMembers = new HashMap<>();
    private static Map<String, String> randomMembers = new HashMap<>();

    public static void main(String[] args) {
        classMembers.put("k5-001", "Tuan Pham-Le");
        classMembers.put("k5-002", "Pham Thuy Bich Huyen");
        classMembers.put("k5-003", "Nguyen Thi Yen");
        classMembers.put("k5-004", "D.Ai Le");
        classMembers.put("k5-005", "Nhu Le");
        classMembers.put("k5-006", "D.T.Quyen");
        classMembers.put("k5-007", "N.T.Van Anh");
        classMembers.put("k5-008", "Tran Dang Bao");
        classMembers.put("k5-009", "Mi Nguyen");
        classMembers.put("k5-010", "Thanh Nguyen");
        classMembers.put("k5-011", "Vo Hong Phuong");
        classMembers.put("k5-012", "Tran Quoc Hoang");


//        currentClassMembers = classMembers;

        updateMissingMembers("k5-010");
        // Assign remaining members
        resetRemainingMember();

        for(int i =0 ; i< 1 ; i++){
            pickRandomMember();
        }
    }

    public static void updateMissingMembers(String studentKey) {
        if (classMembers.containsKey(studentKey)) {
            classMembers.remove(studentKey);
            System.out.println(classMembers);
        } else {
            System.out.println("No student with this id" + studentKey);
        }
    }

    public static void pickRandomMember() {
        if (remainingMembers.isEmpty()) {
            resetRemainingMember();
            resetRandomMembers();
        }
        //pick a member from current class members

        Set<String> allStudentKeys = remainingMembers.keySet();
        Object [] allStudentKeyArr = allStudentKeys.toArray();

        int remainingMemberNum = allStudentKeyArr.length;
        int randomStudentKeyIndex = new SecureRandom().nextInt(remainingMemberNum);

        String randomStudentKey  =(String) allStudentKeyArr[randomStudentKeyIndex];
        String randomMemberName = remainingMembers.get(randomStudentKey);
        System.out.printf("%s | %s \n", randomStudentKey , randomMemberName);

        //Update remaining list and random list

        remainingMembers.remove(randomStudentKey);
        randomMembers.put(randomStudentKey, randomMemberName);

    }


    private static void resetRandomMembers() {
        randomMembers = new HashMap<>();
//        for(String studentKey: randomMembers.keySet()){
//            remainingMembers.put(studentKey, classMembers.get(studentKey));
//        }
    }

    public static void resetRemainingMember() {
        for (String studentKey : classMembers.keySet()) {
            remainingMembers.put(studentKey, classMembers.get(studentKey));
        }
    }
}
