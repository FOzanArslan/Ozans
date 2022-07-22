public class AdressManager {
    public static void addressAdd(User user,
                                  Adress adress){
        user.getAdressArr().add(adress);
    }
    public static void adressRemove(User user,
                                    Adress adress){
        user.getAdressArr().remove(adress);
    }
}
