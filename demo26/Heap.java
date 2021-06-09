package data31;

public class Heap {
    public static void adjustHeap(int[] array,int size,int index) {
        //向下调整
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex > size) {
                return;
            }
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }
            if (array[minIndex] >= array[index]) {
                return;
            }
            int t = array[minIndex];
            array[minIndex] = array[index];
            array[index] = t;

            index = minIndex;
        }
    }

    public static void createHeap(int[] array,int size){//建堆
        int lastIndex=size-1;
        int lastIndexParent=(lastIndex-1)/2;
        for(int i=lastIndexParent;i>=0;i--){
            adjustHeap(array,size,i);
        }
    }

    public static void UpAdjust(int[] array,int size,int index){//向上调整
        while(true) {
            if (index == 0) {
                break;
            }
            int parentIndex = (index - 1) / 2;
            if (array[parentIndex] <= array[index]) {
                break;
            }
            int t = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = t;

            index = parentIndex;
        }
    }
}
