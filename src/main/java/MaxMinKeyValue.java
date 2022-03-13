import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxMinKeyValue {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,34);
        map.put(5,17);
        map.put(2,44);
        map.put(4,34);
        map.put(3,88);
        int maxValueInMap=(Collections.max(map.values()));
        int minValueInMap=(Collections.min(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("The Maximum value of the key is "+entry.getKey());
            }
            if (entry.getValue() == minValueInMap) {
                System.out.println("The Minimum value of the key is "+entry.getKey());
            }
        }
    }
}
