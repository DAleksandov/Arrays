
package program;

import arrays.ArrayUtil;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysProgram {
    public static void main(String[] args) {
        Integer[] mass = {5,2,3,4,5};
        ArrayUtil.Sort1(mass, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(mass));


    }
}

