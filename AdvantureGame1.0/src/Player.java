public class Player {
public static int damage;
public static int damageAbsorption;
public int charId;
public static int health;
public static int money;
public static String name;
public static boolean passForest = false;
public static boolean passRiver = false;
public static boolean passCave = false;
public static Inventory inventory;

public void selectChar(String name){
    this.name = name;
    if(name.equals("Samurai")){
        this.charId = 1;
        this.damage = 5;
        this.health = 21;
        this.money = 15;
        this.damageAbsorption = 0;
    } else if (name.equals("Bowman")){
        this.charId = 2;
        this.damage = 7;
        this.health = 18;
        this.money = 20;
        this.damageAbsorption = 0;
    } else if (name.equals("Knight")) {
        this.charId = 3;
        this.damage = 8;
        this.health = 24;
        this.money = 5;
        this.damageAbsorption = 0;
    }

}
}
