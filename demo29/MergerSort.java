package data52;

public class MergerSort {
    public static void mergerSort(int[] array) {
        mergerSortInternal(array, 0, array.length);
    }
    // array[lowIndex, highIndex)
    private static void mergerSortInternal(int[] array, int lowIndex, int highIndex) {
        int size = highIndex - lowIndex;
        if (size <= 1) {
            return;
        }
        int middleIndex = (lowIndex + highIndex) / 2;
        // 左区间：[lowIndex, middleIndex)
        // 右区间：[middleIndex, highIndex)
        mergerSortInternal(array, lowIndex, middleIndex);
        mergerSortInternal(array, middleIndex, highIndex);
        // 左右两个区间都有序了
        mergerOrderly(array, lowIndex, middleIndex, highIndex);
    }

    private static void mergerOrderly(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int size = highIndex - lowIndex;
        int[] extraArray = new int[size];//新的一个数组

        int leftIndex = lowIndex;
        int rightIndex = middleIndex;
        int extraIndex = 0;

        while (leftIndex < middleIndex && rightIndex < highIndex) {
            if (array[leftIndex] <= array[rightIndex]) {
                extraArray[extraIndex] = array[leftIndex];
                extraIndex++;
                leftIndex++;
            } else {
                extraArray[extraIndex] = array[rightIndex];
                extraIndex++;
                rightIndex++;
            }
        }
        if (leftIndex < middleIndex) {
            while (leftIndex < middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        } else {
            while (rightIndex < highIndex) {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }
        // 新数组 [0, size)
        for (int i = 0; i < size; i++) {
            array[i + lowIndex] = extraArray[i];
        }
    }
}
