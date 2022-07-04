import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    private int damage;
    private int health;
    private int coin;
    private String name;
    private String charName;
    private Inventory inventory;
    private boolean isPassForest;
    private boolean isPassCave;
    private boolean isPassRiver;
    private boolean isPassMine;
    private int originalHealth;

    public boolean isPassMine() {
        return isPassMine;
    }

    public void setPassMine(boolean passMine) {
        isPassMine = passMine;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public boolean isPassForest() {
        return isPassForest;
    }

    public void setPassForest(boolean passForest) {
        isPassForest = passForest;
    }

    public boolean isPassCave() {
        return isPassCave;
    }

    public void setPassCave(boolean passCave) {
        isPassCave = passCave;
    }

    public boolean isPassRiver() {
        return isPassRiver;
    }

    public void setPassRiver(boolean passRiver) {
        isPassRiver = passRiver;
    }

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
        this.isPassForest = false;
        this.isPassCave = false;
        this.isPassRiver = false;
        this.isPassMine = false;
    }
    public void playerStats(){
        System.out.println("Character : "+this.name+
                "\tDamage : "+ this.getDamage()+
                "\tWeapon : "+ this.getInventory().getWeapon().getName()+
                "\tHealth : "+this.health+
                "\tArmor : "+this.getInventory().getArmor().getName()+
                "\tBlock: "+this.getInventory().getArmor().getBlock()+
                "\tMoney : "+this.coin);
    }
    public void selectChar(){
        GameCharacter[] charList = {new Samurai(),new Archer(), new Knight()};
        System.out.println("----------------------");
        for(GameCharacter gameChar : charList){
            System.out.println("Id : "+ gameChar.getId() +"\tCharacter : "+ gameChar.getName()+ "\t Damage : "+gameChar.getDamage()+ "\t" +
                    " Health :"+ gameChar.getHealth() +"\t Money :"+ gameChar.getMoney());
        }
        System.out.println("----------------------");
        System.out.print("Please enter a character : ");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1 :
            initPlayer(new Samurai());
            break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

    }

    public void initPlayer(GameCharacter gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setCoin(gameChar.getMoney());
        this.setName(gameChar.getName());
        this.setOriginalHealth(gameChar.getHealth());
    }




    public int getDamage() {
        return damage;
    }
    public int getTotalDamage(){
        return damage + this.inventory.getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}

