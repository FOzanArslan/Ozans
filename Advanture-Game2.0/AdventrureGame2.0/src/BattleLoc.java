import java.util.Random;
import java.util.Scanner;

public class BattleLoc extends Location{
    private Obstacle obstacle;
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    private String award;
    private int maxObstacle;

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public BattleLoc(Player player, String name, Obstacle obstacle , String award, int maxObstacle) {

        super(player, name);
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
        this.award = award;
    }
    public void obstacleStats(int i){
        System.out.println(i + ". " + this.getObstacle().getName());
        System.out.println("---------------------");
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Award : " + this.getObstacle().getAward());
    }
    @Override
    boolean onLocation() {
        int obsNumber = this.randomObsracleNumber();
        System.out.println("You are here : "+ this.getName());
        System.out.println("Warning here "+obsNumber +" " + obstacle.getName()+" lives");
        System.out.println("<F>ight or <R>un");
        String selectCase = input.next();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("F")){
            //fight
            if (combat(obsNumber)){
                System.out.println(this.getName()+" killed all enemies.");

                if (this.getName().equals("River")){
                    this.getPlayer().setPassRiver(true);
                    System.out.println("river : " + this.getPlayer().isPassRiver());}

                if (this.getName().equals("forest")){
                    this.getPlayer().setPassForest(true);
                    System.out.println("forest : " + this.getPlayer().isPassForest());}

                if (this.getName().equals("cave")){
                    this.getPlayer().setPassCave(true);
                    System.out.println("cave : " + this.getPlayer().isPassCave());}
                if (this.getName().equals("Mine")){
                    this.getPlayer().setPassMine(true);
                    System.out.println("Mine : " + this.getPlayer().isPassMine());}

                return true;

            }
        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println(" You died");
            return false;
        }
        return true;
    }
    public void afterHit(){
        System.out.println("Your health : " + this.getPlayer().getHealth());
        System.out.println("Obstacle health : " + this.getObstacle().getHealth());
        System.out.println("----------------");
    }
    public boolean combat(int obsNumber){
        for(int i = 1; i<=obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            this.getPlayer().playerStats();
            obstacleStats(i);
            int randomHit = r.nextInt(2);
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth() > 0){
                if (randomHit == 0){
                    System.out.print("Fight Or Run : ");
                    String selectCombat = input.next().toUpperCase();
                    if(selectCombat.equals("F")){
                        System.out.println("You hit monster. ");
                        obstacle.setHealth(this.obstacle.getHealth() -
                                this.getPlayer().getTotalDamage());
                        afterHit();
                        if(this.getObstacle().getHealth()>0){
                            if (this.obstacle.getName().equals("Snake")){
                                System.out.println();
                                System.out.println("Monster hits you.");
                                Random rn = new Random();
                                int obsSnakeDmg = rn.nextInt(3)+1;
                                int obstacleDamage = this.getObstacle().getDamage()-
                                        this.getPlayer().getInventory().getArmor().getBlock();
                                obstacleDamage -= obsSnakeDmg;

                                if(obstacleDamage<0){
                                    obstacleDamage = 0;
                                }
                                this.getPlayer().setHealth((getPlayer().getHealth())-obstacleDamage);
                                afterHit();
                            }else {
                                System.out.println();
                                System.out.println("Monster hits you.");
                                int obstacleDamage = this.getObstacle().getDamage() -
                                        this.getPlayer().getInventory().getArmor().getBlock();
                                if (obstacleDamage < 0) {
                                    obstacleDamage = 0;
                                }
                                this.getPlayer().setHealth((getPlayer().getHealth()) - obstacleDamage);
                                afterHit();
                            }
                        }
                    }
                        else {
                            return false;
                        }
                }else {
                    System.out.print("Fight Or Run : ");
                    String selectCombat = input.next().toUpperCase();
                    if (selectCombat.equals("F")) {
                        if (this.obstacle.getName().equals("Snake")){
                            System.out.println();
                            System.out.println("Monster hits you.");
                            Random rn = new Random();
                            int obsSnakeDmg = rn.nextInt(3)+1;
                            int obstacleDamage = this.getObstacle().getDamage()-
                                    this.getPlayer().getInventory().getArmor().getBlock();
                            obstacleDamage -= obsSnakeDmg;

                            if(obstacleDamage<0){
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth((getPlayer().getHealth())-obstacleDamage);
                            afterHit();
                        }else {
                            System.out.println();
                            System.out.println("Monster hits you.");
                            int obstacleDamage = this.getObstacle().getDamage() -
                                    this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth((getPlayer().getHealth()) - obstacleDamage);
                            afterHit();
                        }
                        System.out.println("You hit monster.");
                        obstacle.setHealth(this.obstacle.getHealth() -
                                this.getPlayer().getTotalDamage());
                        afterHit();
                    }
                    else {
                        return false;
                    }

                }
            }
            if (this.getObstacle().getHealth()< this.getPlayer().getHealth() && !(this.getName().equals("Mine"))){
                System.out.println("Düşmanı Yendiniz ! ");
                System.out.println(this.getObstacle().getAward() + " para Kazandınız");
                this.getPlayer().setCoin(this.getPlayer().getCoin()+ this.getObstacle().getAward());
                System.out.println("Güncel Para : " + this.getPlayer().getCoin());


            } else if (this.getObstacle().getHealth()< this.getPlayer().getHealth() && this.getName().equals("Mine")) {
                System.out.println("Düşmanı Yendiniz ! ");
                Random random = new Random();
                int playerLuck = random.nextInt(100)+1;
                if (playerLuck > 55){
                    System.out.println("You won nothing from this enemy.");
                }
                else if (playerLuck<=55 && playerLuck>30){
                    if (playerLuck>50){
                        System.out.println("1 coin earned");
                        this.getPlayer().setCoin(this.getPlayer().getCoin()+1);
                    }else if (playerLuck<=50 && playerLuck>20){
                        System.out.println("5 coin earned");
                        this.getPlayer().setCoin(this.getPlayer().getCoin()+5);
                    } else if (playerLuck<20){
                        System.out.println("10 coin earned");
                        this.getPlayer().setCoin(this.getPlayer().getCoin()+1);
                    }
                    System.out.println("Güncel Para : " + this.getPlayer().getCoin());
                }
                else if (playerLuck<=30 && playerLuck>15){
                    Armor selectedArmor1 = Armor.getArmorObjById(1);
                    Armor selectedArmor2 = Armor.getArmorObjById(2);
                    Armor selectedArmor3 = Armor.getArmorObjById(3);
                    if (playerLuck>50){
                        System.out.println("light armor founded");
                        this.getPlayer().getInventory().setArmor(selectedArmor1);
                    }else if (playerLuck<=50 && playerLuck>20){
                        System.out.println("Medium armor founded");
                        this.getPlayer().getInventory().setArmor(selectedArmor2);
                    } else if (playerLuck<20){
                        System.out.println("Heavy armor founded");
                        this.getPlayer().getInventory().setArmor(selectedArmor3);
                    }
                } else if (playerLuck<=15) {
                    Weapon selectedWeapon1 = Weapon.getWeaponObjById(1);
                    Weapon selectedWeapon2 = Weapon.getWeaponObjById(2);
                    Weapon selectedWeapon3 = Weapon.getWeaponObjById(3);
                    if (playerLuck>50){
                        System.out.println("pistol founded");
                        this.getPlayer().getInventory().setWeapon(selectedWeapon1);
                    }else if (playerLuck<=50 && playerLuck>20){
                        System.out.println("Sword armor founded");
                        this.getPlayer().getInventory().setWeapon(selectedWeapon2);
                    } else if (playerLuck<20){
                        System.out.println("Rifle armor founded");
                        this.getPlayer().getInventory().setWeapon(selectedWeapon3);
                    }
                }


            } else {
                return false;
            }
        }
        return true;
    }
    public int randomObsracleNumber(){

        return  r.nextInt(this.getMaxObstacle())+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

}
