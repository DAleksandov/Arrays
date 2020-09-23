package program;

import arrays.ArrayUtil;
import arrays.tests.java.Tester;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 массив");
        int[] mass = new int[scanner.nextInt()];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        int[] mass2 = new int[] {1, 0, 4, 1, 4, 4, 2, 2, 0, 2, 0, 4, 1, 3, 2, 4, 4, 2, 0, 3, 3, 0, 0, 1, 4, 2, 2, 4, 3, 3, 3};
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (Math.random() * 5);
        }
        System.out.println(ArrayUtil.toString(mass2));
        System.out.println(ArrayUtil.minimumPrecipitation(mass2, 1));
        /**
         * 2 массив
         */
        System.out.println("2 массив");
        int[] mass3 = new int[scanner.nextInt()];
        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = scanner.nextInt();
        }
        System.out.println((ArrayUtil.equalsIgnoreCase(mass3, mass3)));

        int h = scanner.nextInt();
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i] + " ");
        }
        System.out.println(Arrays.toString(mass3));
        System.out.println(mass3);
        ArrayUtil.f(mass3, scanner.nextInt());
        System.out.println(Arrays.toString(mass3));
        ArrayUtil.fill(mass3, scanner);
        ArrayUtil.fillRandom(mass3, -2, -2);
        if ((ArrayUtil.minOdd(mass3)) != 0)
            System.out.println("Не найдено ни одного значения");
        else
            System.out.println(ArrayUtil.minOdd(mass3));
        System.out.println(ArrayUtil.evenData(mass3));
        System.out.println(ArrayUtil.evenIndexes(mass3));
        System.out.println(ArrayUtil.countPositive(mass3));
        System.out.println(ArrayUtil.toString(ArrayUtil.sameNeighbours(mass3)));
        System.out.println(ArrayUtil.toString(ArrayUtil.maxValues(mass3)));
        ArrayUtil.minPositive(mass3);
        System.out.println(ArrayUtil.toString(mass3));
        System.out.println(ArrayUtil.minOdd(mass3));
        System.out.println(ArrayUtil.toString(mass3));
        System.out.println(ArrayUtil.countEqualPairs(mass3));
        System.out.println(ArrayUtil.countDifferent(mass3));

        System.out.println(ArrayUtil.toString(mass3));
        System.out.println(ArrayUtil.toString(ArrayUtil.insert(mass3, 4, 12)));
        System.out.println(ArrayUtil.median(mass3));
        System.out.println(ArrayUtil.toString(ArrayUtil.unique(mass3)));
        System.out.println((ArrayUtil.toString(ArrayUtil.fillPrimeRandom(mass3))));
        System.out.println(ArrayUtil.indexInsertion(mass3, -1));
        System.out.println(Arrays.deepToString(ArrayUtil.getPermutations(mass3)));
        System.out.println(ArrayUtil.isOrder(mass3));
        Tester.isOrder();
        ArrayUtil.Sort2(mass3);
        System.out.println(ArrayUtil.toString((mass3)));
        System.out.println(ArrayUtil.averagePoint(mass3));
        Integer res = ArrayUtil.median(mass3);
        System.out.println(ArrayUtil.averagePoint(mass3));
        System.out.println(ArrayUtil.toString(ArrayUtil.nearest2(mass3)));
        System.out.println(ArrayUtil.toString(ArrayUtil.search(mass3, 0)));
        for (int i = 0; i < ArrayUtil.getPermutations(mass3).length; i++) {
            for (int j = 0; j < ArrayUtil.getPermutations(mass3)[i].length; j++) {
                System.out.print(ArrayUtil.getPermutations(mass3)[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(ArrayUtil.pascalTriangle(5)));

        for (int i = 0; i < ArrayUtil.pascalTriangle(5).length; i++) {
            for (int j = 0; j < ArrayUtil.pascalTriangle(5)[i].length; j++) {
                System.out.print(ArrayUtil.pascalTriangle(5)[i][j] + " ");
            }
            System.out.println();
            System.out.println(ArrayUtil.rushHour(mass3, 3));


            String mass1[] = new String[]{"aa", "b", "a", "bb", "aa", "bb", "a", "BB", "aa"};
            System.out.println(Arrays.toString(mass1));
            System.out.println(ArrayUtil.group1(mass1));

            //System.out.println(ArrayUtil.toString(ArrayUtil.unique(mass)));
            /**
             * ArrayList
             */
            //4 System.out.println(ArrayUtil.evenIndexes2(mass));
            //5  System.out.println(ArrayUtil.evenData(mass));
            //7 System.out.println(ArrayUtil.greatPrev(mass));
            //11 System.out.println(ArrayUtil.maxValues2(mass));
            //14 System.out.println(ArrayUtil.nearestA(mass, 6));
            //19 System.out.println(ArrayUtil.delete2(mass, 4));
            //20 System.out.println(ArrayUtil.insert2(mass,5,10));
            //26  System.out.println(ArrayUtil.unique2(mass));
            // System.out.println(ArrayUtil.frequentA(mass));
            //28
            //System.out.println(ArrayUtil.kBonachi2(10));
            // System.out.println(ArrayUtil.kBonachi(100,0));
            //29
            // System.out.println(ArrayUtil.search2(mass, 4));
            //40
            // System.out.println(ArrayUtil.group1(mass));
            //averagePoint
            // System.out.println(ArrayUtil.averagePoint(mass));
            //System.out.println(Arrays.toString(ArrayUtil.equalItems(mass)));
            // System.out.println(ArrayUtil.toString(ArrayUtil.nearest2(mass)));
            //  Tester.nearestTest();

            System.out.println();
        }
    }
}


