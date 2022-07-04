public class Weapon{
    private String name;
    private int damage;
    private int price;
    private int id;

    public Weapon(String name, int damage, int price, int id) {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.id = id;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponlist = new Weapon[3];
        weaponlist[0] = new Weapon("Pistol",2,10,1);
        weaponlist[1] = new Weapon("Sword",3,35,2);
        weaponlist[2] = new Weapon("Pistol",7,45,3);
        return weaponlist;
    }

    public static Weapon getWeaponObjById(int id){
        for (Weapon w : Weapon.weapons()){
            if (w.getId() == id){
                return w;
            }

        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
