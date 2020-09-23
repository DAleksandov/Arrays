package program;

import arrays.ArrayUtil;

import java.util.Arrays;

public class DeepProgram {
    public static void f(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 8;
        int ch = 1;
        int[][] mass = new int[m][n];
        int[] mass1 = new int[]{4, 8, 8, 1};
        int[] mass2 = {0, 4, 3, 3, 4, 4, 6, 2, 4, 8, 3, 1, 4, 5, 8, 1, 6, 3, 8, 4, 6, 2, 9, 4, 0, 5, 4, 5, 1, 8, 0};
        /**
         * debts
         */
        int[][] mass3 = new int[][]{
                {1, 2, 10},
                {1, 2, 20},
                {1, 2, 20}
        };
        System.out.println(Arrays.toString(ArrayUtil.debts(mass3, 2)));

        int[][] mass4 = new int[m][];
        for (int i = 0; i < mass4.length; i++) {
            mass4[i] = new int[3];
        }
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4[i].length; j++) {
                if (j == 0) {
                    mass4[i][j] = ch;
                    ch++;
                    mass4[i][j] = (int) ((Math.random() * 3) + 1);
                }
                if (j == 1)
                    mass4[i][j] = (int) ((Math.random() * 3) + 1);

                if (j == 2)
                    mass4[i][j] = (int) ((Math.random() + 1) * 100);
            }
        }
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4[i].length; j++) {
                System.out.print(mass4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        String s = Arrays.deepToString(mass4);
        System.out.println(s);
        System.out.println(ArrayUtil.countPassengersTime(mass4, 8));
        System.out.println(ArrayUtil.toString(ArrayUtil.temperatureMinimum(mass4)));
        /**
         * 41 setDiam
         */
        int[][] mass7 = new int[][]{
                {1, 1},
                {1, 0},
                {0, 0},
        };
        System.out.println(ArrayUtil.setDiam(mass7));
        /**
         * Для проверки треугольника паскаля
         */
        int N = 13;
        int[][] masss = ArrayUtil.pascalTriangle(N);
        for (int i = 0; i < masss.length; i++) {
            String space = "";
            for (int k = N - i; k > 0; k--) {
                space += " ";
            }
            System.out.print(space);
            for (int j = 0; j < masss[i].length; j++) {
                System.out.print(masss[i][j] + " ");
            }
            System.out.println();
        }
        /**
         * temperatureMinimum
         */
        int[][] mass5 = new int[][]{
                {1, 2, 10, 140},
                {-1, -2, 20, -120},
                {1, 2, -20, -1000}
        };
        System.out.println(Arrays.toString(ArrayUtil.temperatureMinimum(mass5)));
        int[] mass6 = new int[31];
        for (int i = 0; i < 31; i++) {
            mass6[i] = i;
        }
        System.out.println((ArrayUtil.minimumPrecipitation(mass2, 4)));
    }
}