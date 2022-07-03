public abstract class BattleLoc extends Location{
    abstract boolean onLocation();
    public abstract void location();
    abstract void combat();
    Obstacle obstacle;
    abstract void BattleLoc(Obstacle o);
}
