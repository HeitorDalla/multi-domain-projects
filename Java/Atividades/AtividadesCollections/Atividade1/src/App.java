import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Collection<Integer> nums = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        // nums.add(1);
        // nums.add(2);

        // nums2.add(4);
        nums2.add(3);
        if (nums2.contains(3)) {
            System.out.println(" E falso");
        } else {
            System.out.println("E verdadeiro");
        }
        System.out.println(nums2);
        
        // for (Integer num : nums) {
        //     System.out.println(num);
        // }

        // nums2.get(0);
        // System.out.println(nums2);
    }
}