public abstract class NormalLoc extends Location{
    public NormalLoc(Player a, String name){
        super(a, name);
    }
    @Override
    boolean onLocation(){
        return false;
    }
}
