package data52;

public class QuickSort {
    public static void quickSort(int[] array) {
        quickSortInternal(array, 0, array.length - 1);
    }

    // 区间是 [lowIndex, highIndex]
    private static void quickSortInternal(int[] array, int lowIndex, int highIndex) {
        int size = highIndex - lowIndex + 1;
        if (size <= 1) {
            return;
        }
        // 选择其中一个数（选最左边的） —— array[lowIndex]
        // 执行 partition，小的放左，大的放右
        int keyIndex = partition(array, lowIndex, highIndex);
        // 分别对左右区间进行相同的处理 —— 递归方法
        quickSortInternal(array, lowIndex, keyIndex - 1);
        quickSortInternal(array, keyIndex + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        // 选择合适的方法
        //return partition1(array, lowIndex, highIndex);
        //return partition2(array, lowIndex, highIndex);
        return partition3(array, lowIndex, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
    }

    //1.第一种前后partition
    private static int partition1(int[] array, int lowIndex, int highIndex) {
        int separateIndex = lowIndex + 1;
        for (int i = lowIndex + 1; i <= highIndex; i++) {
            if (array[i] < array[lowIndex]) {
                swap(array, i, separateIndex);
                separateIndex++;
            }
        }
        swap(array, lowIndex, separateIndex - 1);
        return separateIndex - 1;
    }

    //2.第二种填充式
    private static int partition2(int[] array, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = array[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }
        array[leftIndex] = key;
        return leftIndex;
    }

    //3.第三种partitionHover
    private static int partition3(int[] array, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        // 选择的数是最左边的一个
        int key = array[lowIndex];
        // 选择了最左边，从右边先走
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            swap(array, leftIndex, rightIndex);
        }
        swap(array, lowIndex, leftIndex);
        return leftIndex;
    }
}
