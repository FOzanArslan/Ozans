import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
     ArrayUsage arrayUsage = new ArrayUsage(3);
     System.out.println(arrayUsage.Size());
     System.out.println(arrayUsage.getCapacity());
     arrayUsage.add(3);
     arrayUsage.add(4);
     arrayUsage.add(5);
     arrayUsage.add(6);
        System.out.println(arrayUsage.Size());
        System.out.println(arrayUsage.getCapacity());


    }
}
