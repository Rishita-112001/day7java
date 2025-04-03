//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
import java.util.*;

public class collectionapi {
    public static void main(String[] args){
        //COLLECTION DOESN'T HAVE INDEX HAVE DUPLICATES
        Collection nums = new ArrayList();
        nums.add(6);
        nums.add(77);
        System.out.println(nums);

        //have index values
        ArrayList<Integer> nums1 = new ArrayList(10);
        nums1.add(61);
        nums1.add(76);
        // even if the array size exceeds , it will still work

        for (int n: nums1){
            System.out.println(n);
        }
        System.out.println(nums1);

        List<Integer> nums2 = new ArrayList(10);
        nums2.add(22);
        nums2.add(33);
        nums2.add(11);
        System.out.println(nums2);

        //set interface // unique value
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Banana");
        // Duplicates are ignored
        System.out.println(set);

        Set<Integer> set1 = new TreeSet<>();
        set1.add(11);
        set1.add(12);
        set1.add(13);
        set1.add(14);

        System.out.println(set1);

        //Map no duplicates // Key Value Pair
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Riya");
        map.put(2,"Seema");
        map.put(3,"Shreya");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.keySet());
    }
}
