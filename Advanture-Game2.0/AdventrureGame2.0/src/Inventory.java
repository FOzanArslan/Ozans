public class Inventory {

    private Weapon weapon;
    private Armor armor;

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Inventory() {
        this.weapon = new Weapon("Punch", 0,0,-1);
        this.armor = new Armor(-1, 0,0,"Shirt");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
