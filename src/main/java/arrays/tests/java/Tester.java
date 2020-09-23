package arrays.tests.java;

import arrays.ArrayUtil;

public class Tester {
    public static final int LENGTH = 10;
    public static final int X = 5;

    /**
     * 32.2 TesterClass
     * В класс Tester в пакете tests, определить в нем метод, который тестирует метод Протестировать методы sort
     * на случайно сгенерированных 1000 массивах, применяя метод isOrder для проверки, является ли массив упорядоченным
     * после выполнения сортировки, при верности теста выводить sout в формате: ---------test номер_теста is successful,
     * при неверности выводить serr в формате: ---------test номер_теста is invalid.
     */

    public static void isOrder() {
        for (int i = 0; i < 1000; i++) {
            int[] mass = new int[LENGTH];
            ArrayUtil.fillPrimeRandom(mass);
            ArrayUtil.Sort1(mass);
            if (ArrayUtil.isOrder(mass))
                System.out.println("---------test " + i + " is successful");
            else
                System.err.println("---------test " + i + " is invalid");
        }
    }

    public static void isOrder1() {
        for (int i = 0; i < 1000; i++) {
            int[] mass = new int[LENGTH];
            ArrayUtil.fillPrimeRandom(mass);
            ArrayUtil.Sort2(mass);
            if (ArrayUtil.isOrder(mass))
                System.out.println("---------test " + i + " is successful");
            else
                System.err.println("---------test " + i + " is invalid");
        }
    }

    public static void nearestTest() {
        int[][] mass3 = new int[][]{
                {10, 5, 10, 1},
                {1, 2, 20},
                {1, 2, 30},
                {1, 2, 40},
                {1, 2, 50},
                {1, 2, 60},
                {1, 2, 70},
                {1, 2, 80}
        };
        int[][] MassOtv = new int[][]{
                {10, 0},
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2},
                {1, 2}
        };
        for (int i = 0; i < mass3.length; i++) {
            boolean k = true;
            int[] Otvet = ArrayUtil.nearest2(mass3[i]);
            for (int j = 0; j < Otvet.length; j++) {
                if (Otvet[j] != MassOtv[i][j]) {
                    k = false;
                }
            }
            if (k)
                System.out.println("---------test " + i + "." + " is successful");
            else
                System.err.println("---------test " + i + "." + " is invalid");
        }
    }
}
