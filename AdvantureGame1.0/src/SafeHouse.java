import java.util.Scanner;

public class SafeHouse extends NormalLoc {
    boolean onLocation() {
        System.out.println("You came back to the safeHouse");
        if (Player.name.equals("Samurai")) {
            Player.health = 21;
            System.out.println("Your health is fulled.");
            System.out.println("Current character Damage : "+ Player.damage);
            System.out.println("Current character health : " + Player.health);
            System.out.println("Current character damage absorption : "+ Player.damageAbsorption);
            location();
        } else if (Player.name.equals("Knight")) {
            Player.health = 24;
            System.out.println("Your health is fulled.");
            System.out.println("Current character Damage : "+ Player.damage);
            System.out.println("Current character health : " + Player.health);
            System.out.println("Current character damage absorption : "+ Player.damageAbsorption);
            location();
        }else if (Player.name.equals("Bowman")) {
            Player.health = 18;
            System.out.println("Your health is fulled.");
            System.out.println("Current character Damage : "+ Player.damage);
            System.out.println("Current character health : " + Player.health);
            System.out.println("Current character damage absorption : "+ Player.damageAbsorption);
            location();
        }

        return true;
    }
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
                onLocation();
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