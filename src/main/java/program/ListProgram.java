package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(200);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Integer[] mass = new Integer[5];
        list.addAll(Arrays.asList(mass));

        Integer[] res = list.toArray(new Integer[0]);

        ArrayList tt = new ArrayList();
        tt.add(1);
        tt.add("sdds");

        LinkedList<Integer> list1 = new LinkedList<>();

    }
}
