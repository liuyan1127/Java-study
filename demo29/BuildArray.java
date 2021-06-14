package data52;

import java.util.Arrays;
import java.util.Random;

public class BuildArray {
    public static int[] randomArray() {//随机数组
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] orderedArray() {//有序数组
        int[] array = randomArray();
        Arrays.sort(array);
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    public static int[] reverseArray() {//逆序数组
        int[] array = orderedArray();
        swap(array, 0, 9);
        swap(array, 1, 8);
        swap(array, 2, 7);
        swap(array, 3, 6);
        swap(array, 4, 5);
        return array;
    }

    public static int[] equalArray() {//相等数组
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 9;
        }
        return array;
    }
}
