package stu9;
//顺序表学习
import java.util.Arrays;

//动态顺序表的各个接口
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList(){
        this.elem=new int[5];
    }
    //1.打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    // 2.在pos位置新增元素
    public void add(int pos,int data){
        if(pos<0||pos>this.usedSize){
            System.out.println("该位置不合法！");
            return;
        }
        if(this.usedSize==this.elem.length){//扩容
            this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    // 3.判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    // 4.查找某个元素对应的下标
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    // 5.获取pos位置的元素
    public int getPos(int pos){
        if(pos<0||pos>=this.usedSize){
            System.out.println("该位置不合法！");
            return -1;
        }
        return this.elem[pos];
    }
    //6.给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize){
            System.out.println("该位置不合法！");
            return ;
        }
        this.elem[pos]=value;
    }
    // 7.删除第一次出现的key
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有该数字");
            return;
        }
        for(int i=index;i<this.usedSize-1;i++){
               this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 8.获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    // 9.清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}
