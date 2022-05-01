import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;


    public Ring(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        Random rnd = new Random();
        int random = rnd.nextInt(3);
        if (random== 1){
        this.f1 = f1;
        this.f2 = f2;
        }
       else{
            this.f1 = f2;
            this.f2 = f1;
        }
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    public void run(){
        if(checkWeight()){

            do{
                System.out.println("============= YENİ ROUND ============");
                f2.fHealth = f1.hit(f2);
                if (isWin()) break;
                f1.fHealth = f2.hit(f1);
                if (isWin()) break;
                printScore();
            }
            while (f1.fHealth>0 && f2.fHealth>0);

        }
    }

    public boolean checkWeight() {
        return (f1.fWeight >= minWeight && f1.fWeight <= maxWeight) && (f2.fWeight >= minWeight
                && f2.fWeight <= maxWeight);
    }

    public boolean isWin(){
        if (f1.fHealth == 0){
            System.out.println("Maçı Kazanan : "+f2.fName);
            return true;
        }else if (f2.fHealth == 0){
            System.out.println("Maçı Kazanan : "+f1.fName);
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("------------------");
        System.out.println(f1.fName+ " Kalan Can \t:"+ f1.fHealth);
        System.out.println(f2.fName+ " Kalan Can \t:"+ f2.fHealth);
    }

}

