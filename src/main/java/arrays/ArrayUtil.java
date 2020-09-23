package arrays;

import java.util.*;

public class ArrayUtil {
    public static void f(int[] mass, int k) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = k;
        }
    }

    /**
     * 1.	fill
     * Дан массив целых чисел. Заполнить данный массив с клавиатуры. Scanner подать как аргумент метода
     *
     * @param mass
     * @param s
     */

    public static void fill(int[] mass, Scanner s) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = s.nextInt();
        }
    }

    /**
     * 2. fillRandom
     * Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
     * Указание:
     * Для генерации случайного числа в диапазоне от a до b реализовать отдельный метод getRandomNumber
     *
     * @param mass
     * @param a
     * @param b
     */
    public static void fillRandom(int[] mass, int a, int b) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = getRandomNumber(a, b);
        }
    }

    public static int getRandomNumber(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    /**
     * 3. toString
     * Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
     * Пример:
     * [10, 2, 6, 4]
     *
     * @param mass
     * @return
     */

    public static String toString(int[] mass) {
        String v = "[";
        for (int i = 0; i < mass.length; i++) {
            v += mass[i];
            if (i < mass.length - 1)
                v += ", ";
        }
        v += "]";
        return v;
    }

    /**
     * 4. evenIndexes
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами. В программе запрещено использовать
     * условную инструкцию для проверки четности индексов.
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static String evenIndexes(int[] mass) {
        String s = "[";
        for (int i = 0; i < mass.length; i += 2) {
            s += mass[i];
            if (i < (mass.length - 2))
                s += ", ";
        }
        s += "]";
        return s;
    }

    //ArrayList
    public static ArrayList<Integer> evenIndexes2(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i += 2) {
            list.add(mass[i]);
        }
        return list;
    }


    /**
     * 5. evenData
     * Дан массив целых чисел. Выведите все четные элементы массива.
     * Указание:
     * Для проверки четности элемента массива реализовать отдельный метод isEven, который будет проверять, является ли
     * переданный ей элемент четным.
     */

    public static String evenData(int[] mass) {
        String s = "[";
        boolean j = false;
        for (int value : mass) {
            if (isEven(value)) {
                if (j) {
                    s += ", ";
                }
                s += value;
                j = true;
            }
        }
        s += "]";
        return s;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    //ArrayList
    public static ArrayList<Integer> evenData2(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : mass) {
            if (isEven(value)) {
                list.add(mass[value]);
            }
        }
        return list;
    }

    /**
     * 6. countPositive
     * Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
     */
    public static int countPositive(int[] mass) {
        int positive = 0;
        for (int value : mass) {
            if (value > 0)
                positive++;
        }
        return positive;
    }

    /**
     * 7. greatPrev
     * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static String greatPrev(int[] mass) {
        String s = "[";
        boolean j = false;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                if (j)
                    s += ", ";
                s += mass[i];
                j = true;
            }
        }
        s += "]";
        return s;
    }

    public static ArrayList<Integer> greatPrev2(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                list.add(mass[i]);
            }
        }
        return list;
    }

    /**
     * 8. sameNeighbours
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа. Если соседних
     * элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько - выведите первую пару.
     * Указание:
     * -В этой задаче нужно реализовать алгоритм линейного поиска: найти такую первую пару элементов, удовлетворяющую
     * заданному условию. Алгоритм линейного поиска реализовать при помощи цикла while.
     * -Вернуть результат в виде массива
     */
//Не выводить ничего относится к методу? Если да, то как ничего не возвращать?
    public static int[] sameNeighbours(int[] mass) {
        int i = 0;
        while (!(i == mass.length - 1 || mass[i] > 0 && mass[i + 1] > 0 || mass[i] < 0 && mass[i + 1] < 0)) {
            i++;
        }
        if (i == mass.length - 1)
            return null;
        else
            return new int[]{mass[i], mass[i + 1]};
    }

    /**
     * 9. greaterNeighbours
     * Дан массив целых чисел. Определите, сколько в этом массиве элементов, которые больше двух своих соседей и выведите количество таких элементов.
     *
     * @param mass
     */

    public static int greaterNeighbours(int[] mass) {
        int k = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i] > mass[i - 1] && mass[i] > mass[i + 1])
                k++;
        }
        return k;
    }

    /**
     * 10. max
     * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */

    public static int max(int[] mass) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max)
                max = mass[i];
        }
        return max;
    }

    /**
     * 11. maxValues
     * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
     * Указание:
     * -Вернуть результат в виде массива
     * -Вернуть результат в виде массива используя ArrayList
     */

    public static int[] maxValues(int[] mass) {
        int max = max(mass);
        int ch = 0;
        for (int j = 0; j < mass.length; j++) {
            if (mass[j] == max)
                ch++;
        }
        int[] mass2 = new int[ch];
        for (int i = 0, y = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                mass2[y] = i;
                y++;
            }
        }
        return mass2;
    }

    public static ArrayList<Integer> maxValues2(int[] mass) {
        int max = max(mass);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 12. minPositive
     * Дан массив целых чисел. Выведите значение наименьшего из всех положительных элементов в массиве. Известно, что
     * в массиве есть хотя бы один положительный элемент.
     */

    public static int minPositive(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0 && mass[i] < min)
                min = mass[i];
        }
        return min;
    }

    /**
     * 13. minOdd
     * Дан массив целых чисел. Выведите значение наименьшего нечетного элемента массива, а если в массиве нет нечетных элементов см. способы реализации.
     * Указание:
     * Для проверки нечетности элемента использовать заранее написанную функцию из п.5
     * Решение оформить 2 способами:
     * -Вернуть значение 0 при отсутствии элементов, удовлетворяющих условию задачи
     * -Вернуть значение null, указав тип возвращаемого значения объектную оболочку типа int – Integer.
     */
    public static int minOdd(int[] mass) {
        int min = Integer.MAX_VALUE;
        boolean y = false;
        for (int i = 0; i < mass.length; i++) {
            if (!isEven(mass[i]) && mass[i] < min) {
                min = mass[i];
                y = true;
            }
        }
        if (!y)
            min = 0;
        return min;
    }

    public static Integer minOdd1(int[] mass) {
        Integer min = Integer.MAX_VALUE;
        boolean y = false;
        for (int i = 0; i < mass.length; i++) {
            if (!(isEven(mass[i])) && mass[i] < min) {
                min = mass[i];
                y = true;
            }
        }
        if (!y)
            min = null;
        return min;
    }

    /**
     * 14. nearest
     * Дан массив целых чисел и число x. Найдите в данном массиве элемент, ближайший к x(элемент с минимальной абсолютной разницей с х).
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить 3 способами:
     * -Вернуть последний элемент, удовлетворяющий условиям задачи
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя массивы
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
     * 14.1 nearest
     * Найдите в массиве два ближайших элемента (то есть два элемента с минимальной абсолютной разностью)
     * 14.2 testerClass
     * Протестировать данный метод на случайно сгенерированном массиве длиной 1000 элементов, при верности теста выводить sout в формате:
     * ---------test номер_теста is successful, при неверности выводить serr в формате: ---------test номер_теста is invalid.
     */

    public static int nearest(int[] mass, double x) {
        double min = Double.MAX_VALUE;
        int ch = 0;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) <= min) {
                min = Math.abs(mass[i] - x);
                ch = mass[i];
            }
        }
        return ch;
    }

    public static int[] nearest1(int[] mass, double x) {
        double min = Double.MAX_VALUE;
        int ch = 1;
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) <= min) {
                min = Math.abs(mass[i] - x);
                ch = 0;
            }
            if (Math.abs(mass[i] - x) == min) {
                ch++;
            }
        }
        int[] mass2 = new int[ch];
        for (int i = 0, y = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) == min) {
                mass2[y] = mass[i];
                y++;
            }
        }
        return mass2;
    }

    public static int[] nearest2(int[] mass) {
        int min = Integer.MAX_VALUE;
        int[] mass2 = new int[2];
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                int k = Math.abs(mass[i] - mass[j]);
                if (k < min) {
                    min = k;
                    mass2[0] = mass[i];
                    mass2[1] = mass[j];
                }
            }
        }
        return mass2;
    }

    //ArrayList можно и в один цикл
    public static ArrayList<Integer> nearestA(int[] mass, double x) {
        double min = Double.MAX_VALUE;
        int ch = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if ((Math.abs(mass[i] - x) < min))
                min = (Math.abs(mass[i] - x));
        }
        for (int i = 0; i < mass.length; i++) {
            if (Math.abs(mass[i] - x) == min) {
                list.add(mass[i]);
            }
        }
        return list;
    }

    /**
     * 15. indexInsertion
     * Дана невозрастающая последовательность целых чисел в виде массива и число x. Вывести номер этой последовательности,
     * куда можно было бы вставить данных элемент х, чтобы правило невозрастания сохранилось, учитывая, что элементы в
     * последовательности начинаются с 1. Если в последовательности уже есть элементы, равные х, то считается, что данный элемент вставляется после них.
     * Указание:
     * Решение оформить в виде алгоритма линейного поиска циклом while
     */
    public static int indexInsertion(int[] mass, int x) {
        int i = 0;
        while (i < mass.length) {
            if (x > mass[i])
                return i + 1;
            if (x == mass[i])
                return i + 1;
            i++;
        }
        return i;
    }

    /**
     * 16. countDifferent
     * Дан массив целых чисел, упорядоченный по неубыванию элементов в нем. Определите, сколько в нем различных элементов
     * (количество неравных друг другу элементов).
     */

    public static int countDifferent(int[] mass) {
        int y = mass.length;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1])
                y--;
        }
        return y;
    }

    /**
     * 17. reverse
     * Дан массив целых чисел. Переставьте элементы данного массива в обратном порядке. Метод должен производить разворот исходного массива, ничего не возвращая.
     */

    public static void reverse(int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int ch = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = ch;
        }
    }

    /**
     * 18. reverseNeighbours
     * Дан массив целых чисел. Переставьте соседние элементы массива. Если элементов нечетное число, то последний элемент остается на своем месте.
     */

    public static void reverseNeighbours(int[] mass) {
        for (int i = 0; i < mass.length - 1; i += 2) {
            int ch = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = ch;
        }
    }

    /**
     * 19. delete
     * Дан массив целых чисел и номер элемента в массиве k. Удалите из массива элемент с индексом k.
     * Решение оформить 2 способами:
     * -использовать вспомогательный массив для хранения элементов
     * -использовать ArrayList для выполнения операции удаления
     */

    public static int[] delete(int[] mass, int k) {
        int[] mass2 = new int[mass.length - 1];
        for (int i = 0, j = 0; i < mass.length - 1; i++, j++) {
            if (i >= k) {
                mass2[j] = mass[i + 1];
            } else
                mass2[j] = mass[i];
        }
        return mass2;
    }

    public static ArrayList<Integer> delete2(int[] mass, int k) {
        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (i != k)
                list.add(mass[i]);
        }
        return list;
    }

    /**
     * 20. insert
     * Дан массив целых чисел, число k и значение C. Необходимо вставить в массив на позицию с индексом k элемент, равный C
     * Решение оформить 2 способами:
     * -использовать вспомогательный массив для хранения элементов
     * -использовать ArrayList для выполнения операции вставки
     */

    public static int[] insert(int[] mass, int k, int C) {
        int[] mass2 = new int[mass.length + 1];
        for (int i = 0, j = 0; j < mass2.length; i++, j++) {
            if (j == k) {
                mass2[j] = C;
                j++;
            }
            mass2[j] = mass[i];
        }
        return mass2;
    }

    public static ArrayList<Integer> insert2(int[] mass, int k, int C) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; j <= mass.length; i++, j++) {
            if (j == k) {
                list.add(C);
                j++;
            }
            list.add(mass[i]);
        }
        return list;
    }

    /**
     * 21. shift
     * Дан массив целых чисел и параметр k. Если данный параметр истинный, то выполнить циклический сдвиг массива на одну
     * позицию вправо, если ложный, то влево. Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift(int[] mass, boolean k) {
        if (k) {
            int j = mass[mass.length - 1];
            for (int i = mass.length - 1; i > 0; i--) {
                mass[i] = mass[i - 1];
            }
            mass[0] = j;
        } else {
            int j = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                mass[i] = mass[i + 1];
            }
            mass[mass.length - 1] = j;
        }
    }

    /**
     * 22. shift
     * Дан массив целых чисел и число k. Выполнить циклический сдвиг массива на |k| позиций вправо, если k>0 или влево
     * , если k<0. Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift(int[] mass, int k) {
        int t = Math.abs(k);
        for (int i = 0; i < t; i++) {
            shift(mass, k > 0);
        }
    }

    /**
     * 23. countEqualPairs
     * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается, что любые два
     * элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
     */
    public static int countEqualPairs(int[] mass) {
        int ch = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    ch++;
                }
            }
        }
        return ch;
    }

    /**
     * 24. countDifferent
     * Дан массив целых чисел. Посчитайте, сколько в нем различных элементов, не изменяя самого массива.
     * Указание:
     * Необходимо считать те элементы, которые встретились нам впервые. Чтобы проверить, встретился ли нам элемент
     * A[i] впервые, необходимо проверить, встречается ли значение A[i] среди элементов с индексами, меньшими i. Выполнить задание алгоритмом  линейного поиска при помощи цикла while.
     */

    public static int countDifferent2(int[] mass) {
        int ch = 0;
        for (int i = 0; i < mass.length; i++) {
            boolean y = true;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    y = false;
                    break;
                }
            }
            if (y)
                ch++;
        }
        return ch;
    }

    public static int countDifferent1(int[] mass) {
        int ch = 0;
        for (int j = 0; j < mass.length; j++) {
            int uniq = 0;
            int i = 0;
            while (i <= j) {
                if (mass[i] == mass[j])
                    uniq++;
                i++;
            }
            if (uniq == 1)
                ch++;
        }
        return ch;
    }

    /**
     * 25. median
     * Дан массив целых чисел. Найти медиану массива: элемент, который стоял бы ровно посередине массива, если массив упорядочить.
     * При решении этой задачи нельзя модифицировать данный массив (в том числе и сортировать его), использовать вспомогательные массивы.
     * Указание:
     * -Если размер массива является четным, либо в массиве не все элементы являются различными, то вывести значение null.
     * -Для определения, все ли элементы массива являются различными использовать отдельный метод.
     */

    public static int median(int[] mass) {
        int med = 0;
        int q = 0;
        int e = 0;
        Integer k = null;
        if (!(countDifferent(mass) == mass.length && mass.length % 2 != 0)) {
            return k;
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] > mass[j] && mass[i] != mass[j])
                    q++;
                if (mass[i] < mass[j] && mass[i] != mass[j])
                    e++;
            }
            if (q == e)
                med = mass[i];
            else {
                q = 0;
                e = 0;
            }
        }
        return med;
    }

    /**
     * 26. unique
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
     * Решение оформить 2 способами:
     * -использовать вспомогательный массив для хранения элементов
     * -использовать ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static int[] unique(int[] mass) {
        int l = 0;
        for (int i = 0; i < mass.length; i++) {
            int ch = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    ch++;
                }
            }
            if (ch == 1)
                l++;
        }
        int[] mass2 = new int[l];
        int t = 0;
        for (int i = 0; i < mass.length; i++) {
            int ch = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    ch++;
                }
            }
            if (ch == 1) {
                mass2[t] = mass[i];
                t++;
            }
        }
        return mass2;
    }

    public static ArrayList<Integer> unique2(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            int ch = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    ch++;
                }
            }
            if (ch == 1) {
                list.add(mass[i]);
            }
        }
        return list;
    }

    /**
     * 27. frequent
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить 3 способами:
     * -Вернуть первый элемент, удовлетворяющий условиям задачи
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
     */

    public static int frequent(int[] mass) {
        int max = Integer.MIN_VALUE;
        int ch = 0;
        for (int i = 0; i < mass.length; i++) {
            int k = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    k++;
                }
            }
            if (k > max) {
                max = k;
                ch = mass[i];
            }
        }
        return ch;
    }

    public static int[] frequent2(int[] mass) {
        int max = Integer.MIN_VALUE;
        int ch = mass[0];
        int m = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            int k = 0;
            for (int j = i; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    k++;
                }
            }
            if (k > max) {
                max = k;
                ch = mass[i];
                m = 1;
                count = k;
            }
            if (k == max && mass[i] != ch) {
                m++;
                count = k;
                ch = mass[i];
            }
        }
        int[] mass2 = new int[m];
        for (int i = 0, u = 0; i < mass.length; i++) {
            int k = 0;
            for (int j = i; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    k++;
                }
            }
            if (count == k && mass[i] != ch) {
                mass2[u] = mass[i];
                ch = mass[i];
                u++;
            }
        }
        return mass2;
    }

    public static ArrayList<Integer> frequentA(int[] mass) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = i; j < mass.length; j++) {
                if (mass[i] == mass[j])
                    count++;
            }
            if (count > max)
                max = count;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            int k = 0;
            for (int j = i; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    k++;
                }
            }
            if (max == k) {
                list.add(mass[i]);
            }
        }
        return list;
    }

    /**
     * 28. kBonachi
     * Назовем последовательность чисел последовательностью k-боначчи, если каждый элемент этой последовательности является суммой k предыдущих
     * членов последовательности. В частности, последовательность 2-боначчи является последовательностью Фибоначчи.
     * Более формально, i−й элемент последовательности ki равен 1, если 0≤i≤k−1 и равен сумме k предыдущих членов последовательности ki−1+ki−2+...+ki−k при i≥k.
     * Даны два числа k и n (k≥2, n≥0). Вычислите n-й член последовательности k-боначчи kn.
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов
     * -использовать ArrayList для накопления элементов
     */
    public static Integer kBonachi(int k, int n) {
        if (!(k >= 2 && n >= 0))
            return null;
        if (n < k)
            return 1;
        int[] mass = new int[n + 1];
        for (int i = 0; i < k; i++) {
            mass[i] = 1;
        }
        for (int i = k; i < mass.length; i++) {
            for (int j = i - k; j < i; j++) {
                mass[i] += mass[j];
            }
        }
        return mass[n];
    }


    public static Integer kBonachi2(int k, int n) {
        if (!(k >= 2 && n >= 0))
            return null;
        if (n < k)
            return 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(1);
        }
        for (int i = k; i < n; i++) {
            int h = 0;
            for (int j = i - k; j < i; j++) {
                h += list.get(j);
            }
            list.add(h);
        }
        return list.get(n - 1);
    }

    /**
     * 29. search
     * Дан массив целых чисел и число key. Методом линейного поиска при помощи цикла for найти индекс вхождения числа key в массиве
     * 29.1 search
     * Модернизировать программу таким образом,  чтобы она вернула индексы всех вхождений числа key в массиве.
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов
     * -использовать ArrayList для накопления элементов
     */

    public static int searchlow(int[] mass, int key) {
        for (int i = 0; i < mass.length; i++) {
            if (key == mass[i])
                return i;
        }
        return -1;
    }

    public static int[] search(int[] mass, int key) {
        int kol = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                kol++;
            }
        }
        int[] mass2 = new int[kol];
        for (int i = 0, ch = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                mass2[ch] = i;
                ch++;
            }
        }
        return mass2;
    }

    public static Integer[] search2(int[] mass, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                list.add(i);
            }
        }
        Integer[] mass2 = new Integer[list.size()];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = list.get(i);
        }
        return mass2;
    }

    /**
     * 30. equals
     * Даны два массива целых чисел. Сравнить их на равенство.
     * Указание:
     * Под равенством двух массивов понимать их тождественное равенство, то есть два массива с одинаковыми длинами,
     * одинаковыми элементами, но разным порядком этих элементов считаются разными
     */

    public static boolean equals(int[] mass, int[] mass2) {
        if (mass.length != mass2.length)
            return false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != mass2[i])
                return false;
        }
        return true;
    }

    /**
     * 31. equalsIgnoreCase
     * Даны два массива целых чисел. Сравнить их на равенство по содержанию, то есть не учитывая порядок этих элементов.
     */

    //Неправильно, но красиво решенная задача:-)
   /* public static boolean equalsIgnoreCase(int[] mass, int[] mass2) {
        int nes = 0;
        if (mass.length != mass2.length)
            nes++;
        else {
            for (int i = 0; i < mass.length; i++) {
                int kol = 0;
                int kol2 = 0;
                for (int j = 0; j < mass.length; j++) {
                    if (mass[i] == mass[j])
                        kol++;
                }
                for (int k = 0; k < mass.length; k++) {
                    if (mass[i] == mass2[k])
                        kol2++;
                }
                if (kol != kol2)
                    nes++;
            }
        }
        return nes == 0;
    }*/

//Попробовал написать быструю программу.
    //Выглядит нагруженно, но работает 1 1 2/
    public static boolean equalsIgnoreCase(int[] mass, int[] mass2) {
        for (int i = 0; i < mass.length; i++) {
            boolean y = false;
            for (int j = 0; j < mass2.length; j++) {
                if (mass[i] == mass2[j]) {
                    y = true;
                    break;
                }
            }
            if (!y)
                return false;
        }
        for (int i = 0; i < mass2.length; i++) {
            boolean y = false;
            for (int j = 0; j < mass.length; j++) {
                if (mass2[i] == mass[j]) {
                    y = true;
                    break;
                }
            }
            if (!y)
                return false;
        }
        return true;
    }

    /**
     * 32. copyOf
     * Дан массив, сделать его копию
     * Указание:
     * Метод должен принимать на вход 2 параметра: исходный массив, который надо скопировать и длину нового массива.
     * Если длина исходного массива больше длины нового массива, то копируется только часть исходного массива, если длина
     * исходного массива меньше длины нового массива, то в новый массив исходный массив копируется полностью, а оставшаяся
     * незаполненная часть записывается нулями, если же размер нового массива совпадает с размером исходного, то в новый массив копируется полностью исходный.
     */

    public static int[] copyOf(int[] mass, int c) {
        int[] mass2 = new int[c];
        for (int i = 0; i < mass.length && i < c; i++) {
            mass2[i] = mass[i];
        }
        return mass2;
    }

    /**
     * 32. copyOfRange
     * Дан массив и два целых числа b и e, сделать копию исходного массива начиная с индекса а и заканчивая b
     * Указание:
     * Метод должен принимать на вход 3 параметра: исходный массив, который надо скопировать и границы копирования.
     * Если длина исходного массива меньше числа a, то вернуть null. Если длина исходного массива меньше  числа b, то
     * в новый массив исходный массив копируется полностью, а оставшаяся незаполненная часть записывается нулями.
     */

    public static int[] copyOfRange(int[] mass, int b, int a) {
        if (mass.length < a)
            return null;
        int y;
        if (a < b) {
            y = a;
            a = b;
            b = y;
        }
        int[] mass2 = new int[a - b + 1];
        for (int i = b, c = 0; i <= a; i++, c++) {
            mass2[c] = mass[i];
        }
        return mass2;
    }

    /**
     * 32. Sort
     * Дан массив целых чисел. Выполнить сортировку массива пузырьком и сортировкой отбором (линейная сортировка).
     */

    public static void Sort1(Integer[] mass, Comparator<Integer> comparatop) {
        for (int i = 0; i < mass.length; i++) {
            int obmen;
            for (int j = 0; j < mass.length - 1; j++) {
                if (comparatop.compare(mass[i], mass[j]) < 0) {
                    obmen = mass[i];
                    mass[i] = mass[j];
                    mass[j] = obmen;
                }
            }
        }
    }

    public static void Sort1(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int obmen;
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[i] < mass[j]) {
                    obmen = mass[i];
                    mass[i] = mass[j];
                    mass[j] = obmen;
                }
            }
        }
    }

    public static void Sort2(int[] mass) {
        int obmen;
        for (int i = 0; i < mass.length; i++) {
            int min = Integer.MAX_VALUE;
            int y = 0;
            for (int j = i; j < mass.length; j++) {
                if (mass[j] < min) {
                    min = mass[j];
                    y = j;
                }
            }
            obmen = mass[i];
            mass[i] = min;
            mass[y] = obmen;
        }
    }

    /**
     * 32.1 isOrder
     * Дан массив целых чисел. Выполнить сортировку массива пузырьком и сортировкой отбором (линейная сортировка).
     */
    public static boolean isOrder(int[] mass) {
        int y = 0;
        int u = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] >= mass[i + 1])
                y++;
            if (mass[i] <= mass[i + 1])
                u++;
        }
        return y == mass.length - 1 || u == mass.length - 1;
    }

    /**
     * 33. fillPrimeRandom
     * Дан массив. Заполнить исходный массив целыми случайными простыми числами
     * Указание:
     * Для проверки простоты числа написать отдельный метод isPrime
     */

    public static int[] fillPrimeRandom(int[] mass) {
        for (int i = 0; i < mass.length; ) {
            int a = (getRandomNumber(1, 1000));
            if (isPrime(a)) {
                mass[i] = a;
                i++;
            }
        }
        return mass;
    }

    public static boolean isPrime(int a) {
        int n = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                n++;
        }
        return n == 2;
    }

    /**
     * 34. getPermutations
     * Дан массив целых чисел. Сгенерировать все возможные перестановки данного массива
     * Указание:
     * -Число перестановок длины n равно n!
     * -Вернуть все перестановки массива в виде таблицы(двумерного массива)
     */
    public static int[][] getPermutations(int[] mass) {
        if (ArrayUtil.countDifferent(mass) == mass.length) {
            int n = 1;
            int obmen = 0;
            int h = 0;
            for (int i = 1; i <= mass.length; i++) {
                n *= i;
            }
            int[][] mass2 = new int[n][mass.length];
            for (int i = 0, j = 0; j <= n - 1; j++, i++) {
                for (int k = 0; k < mass.length; k++) {
                    mass2[h][k] = mass[k];
                }
                if (i + 1 >= mass.length) {
                    i = 0;
                }
                obmen = mass[i];
                mass[i] = mass[i + 1];
                mass[i + 1] = obmen;
                h++;
            }
            return mass2;
        } else
            return null;
    }

    /**
     * 35. averagePoint
     * Вводится следующая система вычисления среднего балла работоспособности разработчиков в компании «Сбербанк-Технологии»:
     * вычисляется среднее арифметическое всех баллов, поставленных тимлидом за определенный период времени, и ставится ближайшая целая оценка,
     * <p>
     * не превосходящая среднего арифметического.
     * <p>
     * При этом если у разработчика есть «двойка», а следующий за ней балл – выше «двойки», то двойка считается отработанной, и при вычислении среднего арифметического не учитывается.
     * Вводится N натуральных чисел в диапазоне от 2 до 5 через пробел – баллы разработчика за определённый период времени.
     * Вычислить натуральное число (от 2 до 5) – его средний балл за текущий период.
     */
    public static Integer averagePoint(int[] mass) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < 2 || mass[i] > 5)
                return null;
            if (mass[i] != 2 || (mass[i] == 2 && mass[i + 1] == 2)) {
                count++;
                sum += mass[i];
            }
        }
        count++;
        sum += mass[mass.length - 1];
        return sum / count;
    }

    /**
     * 36. countPassengersTime
     * Для изучения пассажиропотока в метро было записано время входа и время выхода в метро каждого пассажира.
     * На основании этих данных определите, сколько пассажиров было в метро в некоторый заданный момент времени T.
     * Программа получает на вход двумерный массив данных P из N строк – числа пассажиров за текущий день и двух столбцов,
     * а так же время T. В первом столбце массива определяется время входа P(i, 1) и во втором – время выхода P(i, 2)
     * каждого пассажира, где P(i,1)≤P(i,2). Время задается в минутах от начала работы метрополитена.
     * Вычислите одно значение: количество пассажиров в момент времени T. Если какой-то пассажир в момент T входит или выходит, то его тоже необходимо посчитать.
     */

    public static int countPassengersTime(int[][] mass, int T) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int k = mass[i][0]; k <= mass[i][1]; k++) {
                if (k == T)
                    count++;
            }
        }
        return count;
    }

    /**
     * 37. towards
     * Дан массив вещественных чисел. Сформировать его строковое представление в формате JSON следующем порядке: первое число, последнее, второе, предпоследнее и так далее все числа (см. пример).
     * Пример:
     * Входные данные:  1 2 3 4 5
     * Выходные данные:  [1, 5, 2, 4, 3]
     */
    public static String towards(int[] mass) {
        String a = "[";
        boolean q = true;
        for (int i = 0; i < mass.length / 2; i++) {
            a += mass[i];
            a += ", " + mass[mass.length - i - 1];
            if (i == mass.length / 2 - 1)
                q = false;
            if (q)
                a += ", ";
        }
        if (mass.length % 2 != 0)
            a += ", " + mass[mass.length / 2] + "]";
        else
            a += "]";
        return a;
    }

    /**
     * 38. rushHour
     * Дан массив целых чисел – количество пассажиров в метро за каждый час его работы и число k – продолжительность
     * часа пик. Определить K подряд идущих часов работы метрополитена с максимальным суммарным числом пассажиров и вычислить суммарное число пассажиров за эти часы.
     */
    public static int rushHour(int[] mass, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= mass.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += mass[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * 39. equalItems
     * Дан массив. Найдите элементы, равные друг другу.
     * <p>
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов()
     * -использовать ArrayList для накопления элементов
     */
    public static Integer[] equalItems(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length - 1; j++) {
                if (mass[i] == mass[j] && !list.contains(mass[i])) {
                    list.add(mass[i]);
                }
            }
        }
        Integer[] mass2 = new Integer[list.size()];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = list.get(i);
        }
        return mass2;
    }

    /**
     * 40. group
     * Дан массив строковых данных. Сформировать на основании данного массива новый массив, элементами которого будут новые
     * строки, скрепленные между собой по принципу их равности. То есть необходимо реализовать алгоритм группировки строк по их равенству.
     * Пример:
     * Входные данные: [“aa”, “b”, “a”, “bb”, “aa”, “bb”]
     * Выходные данные: [“aa aa”, “b”, “a”, “bb bb”]
     * Указание:
     * Для сравнения строк использовать механизм str1.equals(str2). Оператор == для строк использовать нельзя
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов
     * -использовать ArrayList для накопления элементов
     */

    public static String[] group(String[] mass) {
        int ch = mass.length;
        for (int i = 0; i < mass.length; i++) {
            boolean l = true;
            for (int j = 0; j < i; j++) {
                if (mass[i].equals(mass[j]))
                    l = false;
            }
            for (int j = i; j < mass.length - 1; j++) {
                if (mass[i].equals(mass[j + 1]) && l)
                    ch--;
            }
        }
        String[] mass2 = new String[ch];
        int n = 0;
        ch = 0;
        for (int i = 0; i < mass.length; i++) {
            boolean l = true;
            for (int j = 0; j < i; j++) {
                if (mass[i].equals(mass[j]))
                    l = false;
            }
            if (l) {
                mass2[n] = mass[i];
                for (int j = i; j < mass.length - 1; j++) {
                    if (mass[i].equals(mass[j + 1]) && l) {
                        mass2[n] += " " + mass[j + 1];
                        ch++;
                    }
                }
                n++;
                ch = 0;
            }
        }
        return mass2;
    }


    public static String[] group1(String[] mass) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            String s = mass[i];
            if (!list1.contains(mass[i])) {
                for (int j = i + 1; j < mass.length - 1; j++) {
                    if (mass[i].equals(mass[j + 1]) && (!list1.contains(mass[i]))) {
                        s += " " + mass[j + 1];
                    }
                }
                list1.add(mass[i]);
                list.add(s);
            }
        }
        String[] mass2 = new String[list.size()];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = list.get(i);
        }
        return mass2;
    }

    /**
     * 41. setDiam
     * На плоскости даны N точек, заданных своими координатами. Найти две наиболее удаленные точки и вычислить расстояние между ними.
     * Программа получает на вход двумерный массив T целых чисел из N строк – количества точек. В первом столбце T(i, 1) записана координата по оси х, во втором столбце T(i, 2) – координата y.
     * Вычислить одно действительное число — наибольшее расстояние между двумя из данных точек.
     */
    public static double setDiam(int[][] mass) {
        double max = Integer.MIN_VALUE;
        double S = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 1; j < mass.length; j++) {
                S = Math.sqrt(Math.pow(mass[j][0] - mass[i][0], 2) + Math.pow(mass[j][1] - mass[i][1], 2));
            }
            if (S >= max)
                max = S;
        }
        return max;
    }

    /**
     * 42. debts
     * В одном карточном клубе состоит N джентльменов. Иногда азарт некоторых из них берет верх над благоразумием, и
     * кто-то проигрывает больше денег, чем у него есть с собой. В этом случае проигравший обычно берет в долг у кого-то из
     * посетителей клуба, чтобы расплатиться с партнерами по игре. Чтобы начать новый год “с чистого листа”, джентльмены решили
     * собраться в клубе и оплатить все долговые расписки, которые накопились у них друг к другу. Однако выяснилось, что иногда одни
     * и те же джентльмены в разные дни выступали как в роли должников, так и в роли кредиторов. Поскольку истинные джентльмены считают
     * мелочный подсчет денег ниже своего достоинства, то расчетами придется заняться уполномоченному программисту.
     * Написать программу, которая по заданным распискам вычислит, сколько всего должен каждый джентльмен выплатить другим (или получить с других).
     * На вход методу подается двумерный массив D состоящий из K строк — количество долговых расписок и 3 столбцов, число N —
     * количество джентльменов. D(i, 1) - номер джентльмена взявшего в долг; D(i, 2) - номер джентльмена давшего деньги; D(i, 3) - сумма.
     * Вычислить массив balance из N чисел — суммы, которые должны получить соответствующие джентльмены. balance(i)
     * положительное число, если этот джентльмен должен получить деньги от других, отрицательное — если он должен отдать деньги другим.
     */
//как лучше контролировать количество джентльменов - в методе или в программе?
    public static int[] debts(int[][] mass, int N) {
        int[] mass2 = new int[N];
        for (int i = 1; i <= N; i++) {
            int balance = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[j][0] == i)
                    balance -= mass[j][2];
                if (mass[j][1] == i)
                    balance += mass[j][2];
            }
            mass2[i - 1] = balance;
        }
        return mass2;
    }

    /**
     * 43. pascalTriangle
     * По данному числу N сформировать первые N+1 строку треугольника Паскаля.
     */
    public static int[][] pascalTriangle(int N) {
        int[][] mass = new int[N + 1][];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new int[i + 1];
        }
        int n = 4;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (j == 0) {
                    mass[i][j] = 1;
                    mass[i][mass[i].length - 1] = 1;
                }
                if (j == 1) {
                    mass[i][j] = i;
                    mass[i][mass[i].length - 2] = i;
                }
                if (j == 2) {
                    mass[i][j] = i * (i - 1) / 2;
                    if (mass[i].length >= 5)
                        mass[i][mass[i].length - 3] = i * (i - 1) / 2;
                }
                if ((j == 3) && mass[i].length > 6) {
                    mass[i][j] = (n * (n + 1) * (n + 2)) / 6;
                    if (mass[i].length > 7) {
                        mass[i][mass[i].length - 4] = (n * (n + 1) * (n + 2)) / 6;
                    }
                    n++;
                }
                if ((j >= 4 && j < mass[i].length - 4) && mass[i].length >= 9) {
                    mass[i][j] = HZ(i, j);
                }
            }
        }
        return mass;
    }

    public static int HZ(int i, int j) {
        int k = ((Factorial(i)) / (Factorial(j) * Factorial((i - j))));
        return k;
    }

    public static int Factorial(double F) {
        int f = 1;
        for (int i = 1; i <= F; i++) {
            f *= i;
        }
        return f;
    }

    /**
     * 44. temperatureMinimum
     * Метеорологи ведут многолетние наблюдения за тем, в каком году была минимальная температура в данный день года. Например, абсолютный минимум температуры в Москве 8 марта был -32 градуса (1890).
     * В течение k лет метеорологи вели наблюдения за n днями года. Для каждого из этих n дней укажите минимальную температуру, которая была в этот день за k лет наблюдений.
     * Данные подаются в виде двумерного массива из k строк и n столбцов. Далее идет k строк, i-я строка содержит n чисел: значения температур для n дней наблюдений i-го года.
     * Программа должна сформировать массив из n чисел: минимальное значение температуры для каждого из дней наблюдений.
     */
    public static int[] temperatureMinimum(int[][] mass) {
        if (mass == null || mass[0] == null)
            return null;
        int[] mass2 = new int[mass[0].length];
        for (int i = 0; i < mass[0].length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < mass.length; j++) {
                if (mass[j][i] <= min)
                    min = mass[j][i];
            }
            mass2[i] = min;
        }
        return mass2;
    }

    /**
     * 45. minimumPrecipitation
     * Даны результаты метеорологических наблюдений: количество осадков в каждый из 31 дня марта. Метеорологи хотят
     * определить, какая из недель марта была наименее дождливой. Неделя — это семь дней с понедельника до воскресенья, то есть в марте может быть три или четыре полные недели.
     * Программа получает на вход массив из 31 целого неотрицательное число через пробел: количество осадков для каждого
     * из дней и число k от 1 до 7: день недели, на который приходится 1 марта (1 означает понедельник, 2  вторник и так далее).
     * Программа должна определить неделю с наименьшим суммарным числом осадков и вывести суммарное число остатков на этой неделе.
     */
    public static Integer minimumPrecipitation(int[] mass, int T) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        if (T < 1 || T > 7 || mass.length != 31)
            return null;
        //Перевод в из системы 1-7 в систему 0-6
        if (T > 1)
            T = (7 - T) + 1;
        else
            T = 0;
        for (int i = T, j = 1; i < mass.length; i++, j++) {
            sum += mass[i];
            if (j == 7) {
                j = 0;
                if (sum <= min)
                    min = sum;
                sum = 0;
            }
        }
        return min;
    }
}



