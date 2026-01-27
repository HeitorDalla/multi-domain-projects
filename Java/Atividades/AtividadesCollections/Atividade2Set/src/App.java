import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(3);
        nums.add(8);
        nums.add(3);

        for (int num : nums) {
            System.out.println(num);
        }

        Set<Integer> numerosOrdenados = new TreeSet<>();
        numerosOrdenados.add(4);
        numerosOrdenados.add(7);
        numerosOrdenados.add(1);
        numerosOrdenados.add(0);

        for (Integer integer : numerosOrdenados) {
            System.out.println(integer);
        }        
    }
}