package lesson5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> newHashMap = new HashMap<>();
        newHashMap.put(113, "Police");
        newHashMap.put(114, "Fire Dept");
        newHashMap.put(115, "Hospital");
        newHashMap.put(115, "Key");
        newHashMap.put(null, "Hospital");
        newHashMap.put(116, "Others");
        newHashMap.put(117, "Others");

        Iterator<Entry<Integer,String>> emergencyListIterator = newHashMap.entrySet().iterator();
        while(emergencyListIterator.hasNext()){
            Entry<Integer,String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if(entryValue.equals("Others")){
                emergencyListIterator.remove();
            }
        }

        for (Integer key : newHashMap.keySet()) {
            System.out.println(newHashMap.get(key));
        }
        // CRUD
//        System.out.println(newHashMap.get(113));
        //UPDATE
//        newHashMap.replace(null, "Null");
        //REMOVE
//        newHashMap.replace(null, "119");
//        System.out.println(newHashMap.get(null));

//        Set<Integer> keySet = newHashMap.keySet();
//        for(Integer key : keySet){
//            System.out.println(newHashMap.get(key));
//        }
//        for (Integer key : newHashMap.keySet()) {
//            if(newHashMap.get(key).equals("Others")){
//                newHashMap.remove(key);
//            }
//        }
//        System.out.println(newHashMap);
    }
}
