import java.util.Scanner;

public class River extends BattleLoc{
    @Override
    boolean onLocation() {
        return false;
    }

    @Override
    void combat() {
        // essentials
        Scanner input = new Scanner(System.in);
        Obstacle myObstacle = new Bear();
        int obsCount = myObstacle.obstacleNumber();
        myObstacle.obsHealth = myObstacle.obsHealth * obsCount;
        myObstacle.obsDamage = myObstacle.obsDamage * obsCount;
        //User want to play this section
        System.out.println("The sum of bears health : " + myObstacle.obsHealth);
        System.out.println("The sum of bears damage per round : " + myObstacle.obsDamage);
        System.out.println();
        System.out.println("Please enter 1 to get in combat or 2 to retreat : ");
        int userFChoice = input.nextInt();
        if (userFChoice == 1) {
            while (true) {
                //Round starts
                System.out.println("");
                System.out.println("New Round");
                System.out.println("Obstacle health : " + myObstacle.obsHealth);
                System.out.println("Player Health : " + Player.health);
                myObstacle.obsHealth -= Player.damage;
                System.out.println("Player hit. Obstacle health : " + myObstacle.obsHealth);
                Player.health -= myObstacle.obsDamage-Player.damageAbsorption;
                System.out.println("Obstacle hit. Player health : " + Player.health);

                // is finished or not
                if (Player.health <= 0) {
                    System.out.println("Game Over.");
                    System.exit(0);
                } else if (myObstacle.obsHealth <= 0) {
                    System.out.println();
                    System.out.println("You passed the River section.");
                    Player.money += myObstacle.obsMoney * obsCount;
                    Player.passRiver = true;
                    if(Player.passCave && Player.passForest && Player.passRiver){
                        System.out.println("================");
                        System.out.println("Congratulations. You win the game!!");
                        System.out.println("================");
                        System.exit(0);
                    }
                    location();
                }

                // User want to fight ?
                System.out.println("Please f to fight and r to run : ");
                String uChoice = input.next();
                if (uChoice.equals("r")) {
                    location();
                    break;
                }


            }
        } else if (userFChoice == 2) {
            location();
        }
    }

    @Override
    public void location() {
        // Taking value from user
        System.out.println("Please select location");
        Scanner sc = new Scanner(System.in);
        System.out.println("1- SafeHouse \n" +
                "2- Forest\n3- Cave\n4- River\n5-Store");
        while (true) {
            String uChoice = sc.next();
            // locations
            if (uChoice.equals("Safehouse") || uChoice.equals("safehouse")) {
                SafeHouse sh = new SafeHouse();
                sh.onLocation();
                break;
            } else if (uChoice.equals("Cave") || uChoice.equals("cave")) {
                combat();
                break;
            } else if (uChoice.equals("Forest") || uChoice.equals("forest")) {
                Forest fr = new Forest();
                fr.combat();
                break;
            } else if (uChoice.equals("River") || uChoice.equals("river")) {
                River rv = new River();
                rv.combat();
                break;
            } else if (uChoice.equals("Store") || uChoice.equals("store")) {
                Store str = new Store();
                str.onLocation();
                break;
            }else {
                System.out.println("Enter the locations correcly");
            }
        }
    }

    @Override
    void BattleLoc(Obstacle zombie) {
        zombie.obstacleNumber();
    }
}
