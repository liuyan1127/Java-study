package data31;

public class MyPriorityQueueDemo {
    private Integer[] array;
    private int size;

    public MyPriorityQueueDemo() {
        array = new Integer[100];
        size = 0;
    }

    public Integer element() {
        if (size == 0) {
            throw new RuntimeException("空了");
        }
        return array[0];
    }

    public Integer remove() {
        if (size == 0) {
            throw new RuntimeException("空了");
        }
        int e = array[0];
        array[0] = array[size - 1];
        size--;
        adjustHeap(0);
        return e;
    }

    public void add(Integer e) {
        array[size] = e;
        size++;
        UpAdjust(size - 1);
    }

    private void UpAdjust(int index) {
        while (true) {
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

    private void adjustHeap(int index) {
        while (true) {
            int leftIndex = index * 2 + 1;
            if (leftIndex >= size) {
                return;
            }
            int rightIndex = leftIndex + 1;
            int minIndex = leftIndex;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }
            if (array[index] <= array[minIndex]) {
                return;
            }
            int t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }
    }
}
