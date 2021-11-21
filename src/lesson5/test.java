package lesson5;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer,String> newHashMap = new HashMap<>() ;
        newHashMap.put(113, "Police");
        newHashMap.put(114, "Fire Dept");
        newHashMap.put(115, "Hospital");
        newHashMap.put(115, "Key");
        newHashMap.put(116, "Others");
        newHashMap.put(117, "Others");

        Iterator<Map.Entry<Integer,String>> myArr = newHashMap.entrySet().iterator();
        while(myArr.hasNext()){
            Map.Entry<Integer,String> values = myArr.next();
            String myChar = values.getValue();
            if(myChar.equals("Others")){
                myArr.remove();
            }
        }
        for(Integer key : newHashMap.keySet()){
            System.out.println(newHashMap.get(key));
        }
//        LinkedList<String> animal = new LinkedList<String>();
//        animal.add("fox");
//        animal.add("cat");
//        animal.add("dog");
//
//        Iterator<String> it = animal.iterator();
//
//        while(it.hasNext()){
//            String value = it.next();
//            System.out.println(value);
//        }
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//
//
//        Set<String> keys = map.keySet();
//        System.out.println("Length = " + map.size());
//        System.out.println("Keys  =" + keys);

//        Map<String , Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//        System.out.println(entrySet.size());
//
//        for(Map.Entry<String,Integer> entry : entrySet){
//            System.out.println("Key = "+ entry.getKey());
//            System.out.println("Value = "+ entry.getValue());
//
//        }

//        Map<String,Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//
//        Collection<Integer> values = map.values();
//        for(Integer value : values){
//            System.out.println("Take value = " + value);
//        }


    }

}
