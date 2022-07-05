import java.util.ArrayList;

public class ArrayUsage {
   ArrayList<Object> myArr;
   int arrayListCapacity;

    public ArrayUsage(){
        this.myArr = new ArrayList<Object>(10);
        this.arrayListCapacity = 10;
    }
    public ArrayUsage(int capacity){
        this.myArr = new ArrayList<Object>(capacity);
        this.arrayListCapacity = capacity;
    }
    public int Size(){
        return myArr.size();
    }
    public int getCapacity(){
        return this.arrayListCapacity;
    }
    public void add(Object data){
        if(this.myArr.size() == this.arrayListCapacity){
            myArr.ensureCapacity(arrayListCapacity*2);
            arrayListCapacity *= 2;
            System.out.println("New arraylist capacity : "+arrayListCapacity);
            this.myArr.add(data);
        }else {
            this.myArr.add(data);
        }

    }


}
