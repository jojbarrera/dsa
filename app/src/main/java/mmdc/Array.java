package mmdc;

import java.util.Arrays;

public class Array {
    public void run() {
        int[] integerArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(integerArray).sum());

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.stream(doubleArray).sum());

        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        String str = new String(charArray);
        System.out.println(str);
    }
}
