import java.util.Random;

public class Obstacle {
    int obsId;
    int obsDamage;
    int obsHealth;
    int obsMoney;
    Obstacle(int obsId,int obsDamage,int obsHealth,int obsMoney){
        this.obsId = obsId;
        this.obsDamage = obsDamage;
        this.obsHealth = obsHealth;
        this.obsMoney = obsMoney;
    }
    int obstacleNumber(){
        Random rn = new Random();
        int numberObs = rn.nextInt(3) + 1;
        return numberObs;
    }
}
