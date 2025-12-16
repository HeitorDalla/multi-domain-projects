import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(3);
        nums.add(8);
        nums.add(10);

        // Formas de iterar sobre um conjunto de valores

        // For tradicional
        // for (Integer integer : nums) {
        //     System.out.println(integer);
        // }

        // Iterator
        Iterator<Integer> values = nums.iterator();

        // while (values.hasNext()) {
        //     if (values.next().equals(4)) {
        //         values.remove();
        //     }
        // }

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}