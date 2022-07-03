import java.util.Scanner;

public class Store extends Location{

    boolean onLocation(){
        System.out.println("Your current Money : "+ Player.money);
        System.out.println("What do you want to buy? " +
                "\n 1-Pistol ->(25coin - +2 damage)\n 2-Sword ->(35coin)\n 3-Rifle ->(45coin)\n 4-Light Armor -> (15coin - 1 Damage absorption)" +
                "\n 5-Medium Armor ->(25 coin - 3 damage absorption)\n 6-Heavy Armor ->(40 coin - 5 damage absorption)");
        while(true){
            Scanner input = new Scanner(System.in);
            int uBuy = input.nextInt();
            switch (uBuy){
                case 1:
                    if(Player.money > 25){ Player.damage += 2;
                    Player.money -= 25;}
                    else System.out.println("You dont have enough money");
                    location();
                case 2:
                    if(Player.money > 35){ Player.damage += 3;
                        Player.money -= 35;}
                    else System.out.println("You dont have enough money");
                    location();
                case 3:
                    if(Player.money > 45) { Player.damage += 7;
                        Player.money -= 45;}
                    else System.out.println("You dont have enough money");
                    location();
                case 4:
                    if(Player.money > 15)  { Player.damageAbsorption += 1;
                        Player.money -= 15;}
                    else System.out.println("You dont have enough money");
                    location();
                case 5:
                    if(Player.money > 25) { Player.damageAbsorption += 3;
                        Player.money -= 25;}
                    else System.out.println("You dont have enough money");
                    location();
                case 6:
                    if(Player.money > 40) { Player.damageAbsorption += 5;
                        Player.money -= 40;}
                    else System.out.println("You dont have enough money");
                    location();
                default: location();

            }
            return true;
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
                Cave cv = new Cave();
                cv.combat();
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
}
