package data6;




public interface List extends Iterable {
    boolean add(Integer e);
    void add(int index, Integer e);

    //下标
    Integer remove(int index);
    //第一个元素
    boolean remove(Integer e);

    Integer get(int index);
    Integer set(int index, Integer e);

    int size();
    void clear();
    boolean isEmpty();

    boolean contains(Integer e);
    int indexOf(Integer e);
    int  lastIndexOf(Integer e);
}
