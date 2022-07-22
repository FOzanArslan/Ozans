import java.util.ArrayList;

public abstract class Account {
    User myUser = new User();
    public final void showUserInfo(){
        System.out.println("UserName "+ myUser.getUserName());
        System.out.println("UserSurname "+ myUser.getUserSurname());
        System.out.println("UserMail "+ myUser.getUserEmail());
        System.out.println("UserJob "+ myUser.getUserJob());
        System.out.println("UserAge "+ myUser.getUserAge());
    }

    ArrayList<Insurance> userInsurances = new ArrayList<>();
    AuthenticationStatus userAuthStatus;

    public abstract void addPolicy();


}
