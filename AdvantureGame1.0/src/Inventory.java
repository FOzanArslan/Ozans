public class Inventory {
    public boolean water;
    public boolean food;
    public boolean  firewood;
    public String weaponName;
    public String armorName;
    public int weaponDamage;
    public int armorDefence;

    Inventory(String weaponName, int weaponDamage, String armorName, int armorDefence){
        this.armorName = armorName;
        this.armorDefence = armorDefence;
        this.weaponDamage = weaponDamage;
        this.weaponName = weaponName;
    }

}
