package data51;

import java.util.Arrays;
import java.util.Random;

public class SortData {
    //1.直接插入排序
    public static void insertSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int val=array[i+1];
            int j=0;
            for(j=i;j>=0;j--){
                if(val<array[j]){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=val;
        }
    }
    //2.冒泡排序
    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    //3.选择排序
    public static void selectSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int maxIndex=0;
            for(int j=1;j<array.length-i;j++){
                if(array[j]>array[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(array,maxIndex,array.length-i-1);
        }
    }
    //4.堆排序
    public static void heapSort(int[] array){
        createHeap(array,array.length);
        for(int i=0;i<array.length-1;i++){
            swap(array,0,array.length-i-1);
            adjustHeap(array,array.length-i-1,0);
        }
    }
    private static void adjustHeap(int[] array, int size, int index) {
        while (2 * index + 1 < size) {
            int maxIndex = 2 * index + 1;
            if (maxIndex + 1 < size && array[maxIndex + 1] > array[maxIndex]) {
                maxIndex++;
            }
            if (array[index] >= array[maxIndex]) {
                break;
            }
            swap(array, index, maxIndex);
            index = maxIndex;
        }
    }
    private static void createHeap(int[] array, int size) {
        int lastIndex=size-1;
        int lastIndexParent=(lastIndex-1)/2;
        for(int i=lastIndexParent;i>=0;i--){
            adjustHeap(array,size,i);
        }
    }
    //5.希尔排序（分组插排）
    public static void shellSort(int[] array){
        int gap=array.length/2;
        while(true){
            insertGapSort(array,gap);
            if(gap==1){
                break;
            }
            gap=gap/2;
        }
    }
   private static void insertGapSort(int[] array,int gap){
        for(int i=gap;i<array.length;i++){
            int val=array[i];
            int j=0;
            for(j=i-gap;j>=0;j=j-gap){
                if(val<array[j]){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=val;
        }
    }

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

    public static void main(String[] args) {
        int[] a1 = randomArray();
        System.out.println(Arrays.toString(a1));
        //insertSort(a1);
        //bubbleSort(a1);
        //selectSort(a1);
        //heapSort(a1);
        shellSort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println("==============");
        int[] a2=orderedArray();
        System.out.println(Arrays.toString(a2));
        //insertSort(a2);
        //bubbleSort(a2);
        //selectSort(a2);
        //heapSort(a2);
        shellSort(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println("==============");
        int[] a3=reverseArray();
        System.out.println(Arrays.toString(a3));
        //insertSort(a3);
        //bubbleSort(a3);
        //selectSort(a3);
        //heapSort(a3);
        shellSort(a3);
        System.out.println(Arrays.toString(a3));
        System.out.println("==============");
        int[] a4=equalArray();
        System.out.println(Arrays.toString(a4));
        //insertSort(a4);
        //bubbleSort(a4);
        //selectSort(a4);
        //heapSort(a4);
        shellSort(a4);
        System.out.println(Arrays.toString(a4));
    }
}
