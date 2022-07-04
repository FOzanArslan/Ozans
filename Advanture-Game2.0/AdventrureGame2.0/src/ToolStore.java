import java.util.Scanner;

public class ToolStore extends NormalLoc{
    Scanner input = new Scanner(System.in);
    public ToolStore(Player player){
        super(player, "Store");
    }

    @Override
    boolean onLocation() {
        System.out.println("--------- Mağazaya Hoşgeldiniz ---------");
        boolean showMenu = true;
        while(showMenu) {
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("3 - Quit Store");
            System.out.print("Your choice : ");
            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Invalid Value. Try Again");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    BuyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Thanks for shopping.");
                    showMenu = false;
                    break;

            }
        }
        return true;
    }
    public void BuyWeapon(){
        System.out.println("Weapons");
        System.out.println();
        for(Weapon w : Weapon.weapons()){
            System.out.println(w.getName()
            +" Id -> "+ w.getId()
            +" Damage -> "+ w.getDamage()+
            " Price -> "+ w.getPrice());
        }
        System.out.print("Select a weapon. ");
        System.out.println("Enter 0 to exit : ");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length){
            System.out.print("Invalid Value. Try Again");
            selectWeapon = input.nextInt();
        }
        if(selectWeapon != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeapon);
            if(Weapon.getWeaponObjById(selectWeapon) !=null){
                if(selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("You dont have enough money ! ");
                }else{
                    System.out.println(selectedWeapon.getName() + " silahını" +
                            " satın aldınız !");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Kalan paranız : "+ this.getPlayer().getCoin());
                    System.out.println("Previous weapon : "+ this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("New weapon : "+ this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }

    }


    public void printArmor(){
        System.out.println("Armors ");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() +" - " + a.getName() + " Armor -> "+
                    a.getBlock() +
                    " Price -> "+ a.getPrice());
        }
    }

    public void buyArmor(){
        System.out.print("Please select an armor. ");
        System.out.println("Enter 0 to exit : ");
        int selectArmorId = input.nextInt();

        while (selectArmorId <0 || selectArmorId> Armor.armors().length){
            System.out.print("Invalid value. Try Again : ");
            selectArmorId = input.nextInt();
        }
        if (selectArmorId != 0 ){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);

            if (selectedArmor != null ){
                if(selectedArmor.getPrice()> this.getPlayer().getCoin()){
                    System.out.println("You dont have enough money. ");
                }else {
                    System.out.println("You bought "+ selectedArmor.getName() + " armor");
                    System.out.println("Previous armor : "+ this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    int balance = this.getPlayer().getCoin()-selectedArmor.getPrice();
                    System.out.println("New Armor : "+ this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().setCoin(balance);
                    System.out.println("Player money : " + this.getPlayer().getCoin());
                    this.getPlayer().playerStats();
                }
            }
        }

    }
}
