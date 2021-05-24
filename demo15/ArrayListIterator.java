package data5;

public class ArrayListIterator implements Iterator {
    // 对一个顺序表做迭代，关键是 控制下标
    private ArrayList list;
    private int index;

    ArrayListIterator(ArrayList list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public void remove() {

    }
}
