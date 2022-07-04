public class Safehouse extends NormalLoc{
    public Safehouse(Player player){
        super(player, "Safehouse");
    }

    @Override
    boolean onLocation() {
        System.out.println("Güvenli Evdesiniz ! ");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Canınız yenilendi");
        return true;
    }
}
