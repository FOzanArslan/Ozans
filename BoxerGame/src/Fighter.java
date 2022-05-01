public class Fighter {
    String fName;
    int fDamage;
    int fHealth;
    int fWeight;
    double fdodge;

    public Fighter(String fName ,int fDamage ,int fHealth ,int fWeight,double fdodge){
        this.fName = fName;
        this.fDamage = fDamage;
        this.fHealth = fHealth;
        this.fWeight = fWeight;
        this.fdodge = fdodge;
    }
     public int hit(Fighter foe){
         System.out.println("---------------------------");
         System.out.println(this.fName +" => "+ foe.fName+" "+ this.fDamage+ " hasar vurdu." );
         if(foe.dodge()){
             System.out.println(foe.fName+ " gelen hasarı savurdu.");
             return foe.fHealth;
         }if (foe.fHealth -this.fDamage<0){
             return 0;
         }
         return  foe.fHealth - this.fDamage;
     }
     public boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue <= this.fdodge;
     }
}
