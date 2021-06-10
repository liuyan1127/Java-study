package data22;
//实现一个先进先出的单向循环对列
public class ArrayDeque {
    private final int[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;
    // 循环队列的数组容量是 k
    public ArrayDeque(int k) {
        array = new int[k];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }
    // 把 value 插入循环队列尾部
    // 成功返回 true
    // 失败（容量满了）返回 false
    public boolean enQueue(int value) {
        if (size == array.length) {
            return false;
        }
        array[rearIndex] = value;
        size++;
        rearIndex++;
        if (rearIndex == array.length) {
            rearIndex = 0;
        }
        return true;
    }
    // 从循环队列队首删除一个元素
    // 成功返回 true
    // 失败（队列空的）返回 false
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        size--;
        frontIndex++;
        if (frontIndex == array.length) {
            frontIndex = 0;
        }
        return true;
    }

    // 返回队首元素
    // 如果队列空的，返回 -1
    public int Front() {
        if (size == 0) {
            return -1;
        }
        return array[frontIndex];
    }

    // 返回队尾元素
    // 如果队列空的，返回 -1
    public int Rear() {
        if (size == 0) {
            return -1;
        }
        int index = rearIndex - 1;
        if (index == -1) {
            index = array.length - 1;
        }
        return array[index];
    }
    // 队列是不是满了
    public boolean isFull() {
        return size == array.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
