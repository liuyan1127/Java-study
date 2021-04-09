package stu9;
//顺序表学习
public class TestDemo9 {

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,11);
        myArrayList.add(1,22);
        myArrayList.add(2,33);
        myArrayList.add(3,44);
        myArrayList.add(4,55);
        myArrayList.add(5,66);
        myArrayList.display();
        myArrayList.remove(11);
        myArrayList.display();
        myArrayList.remove(33);
        myArrayList.display();
        myArrayList.remove(66);
        myArrayList.display();
    }
}
