package data5;


import java.util.Arrays;

public class ArrayList implements List {
    private int[] array;
    private int size;

    public ArrayList(){

        array=new int[10];

        size=0;
    }
    public ArrayList(List other){//复制
        array = new int[other.size()];
        for (int i = 0; i < other.size(); i++) {
            array[i] = other.get(i);
        }
        size = other.size();
    }

    public void ensureCapacity(int capacity) {//扩容
        if (this.array.length >= capacity) {
            return;
        }
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
    @Override
    public boolean add(Integer e) {
        if (array.length == size) {
            ensureCapacity(array.length * 2);
        }
        array[size++]=e;
        return false;
    }

    @Override
    public void add(int index, Integer e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }
        if (array.length == size) {
            ensureCapacity(array.length * 2);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        /*for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }*/
        array[index] = e;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }
        int e=array[index];
        for(int i=index+1;i<=size-1;i++){
            array[i-1]=array[i];
        }
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {
        for(int i=0;i<size;i++){
            if(array[i]==e){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }
        Integer old=array[index];
        array[index]=e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        Arrays.fill(array,-1);
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e)!=-1;
    }

    @Override
    public int indexOf(Integer e) {
        for(int i=0;i<size;i++){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for(int i=size-1;i>=0;i--){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sbt = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sbt.append(array[i]);
            if (i != size - 1) {
                sbt.append(", ");
            }
        }
        sbt.append("]");
        return sbt.toString();
    }
    @Override
    public Iterator iterator() {
        // 返回一个 Iterator 接口的实现类的对象
        return new ArrayListIterator(this);
    }
}
