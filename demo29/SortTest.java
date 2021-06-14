package data52;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] array = BuildArray.randomArray();
        int[] array1=BuildArray.orderedArray();
        int[] array2=BuildArray.reverseArray();
        int[] array3=BuildArray.equalArray();
        System.out.println(Arrays.toString(array));
        MergerSort.mergerSort(array);
        //QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("===========");
        System.out.println(Arrays.toString(array1));
        MergerSort.mergerSort(array1);
        //QuickSort.quickSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("===========");
        System.out.println(Arrays.toString(array2));
        MergerSort.mergerSort(array2);
        //QuickSort.quickSort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("===========");
        System.out.println(Arrays.toString(array3));
        MergerSort.mergerSort(array3);
        //QuickSort.quickSort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
