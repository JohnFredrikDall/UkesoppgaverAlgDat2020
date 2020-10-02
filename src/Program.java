import java.util.Arrays;
import java.util.Iterator;

public class Program {
    public static void main(String[]args) {
    Integer [] a = {1,2,3,4,5,6,7,8,9};
        Iterator<Integer> i = Arrays.stream(a).iterator();

        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
    }
}
