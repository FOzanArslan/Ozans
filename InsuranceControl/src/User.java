import java.util.ArrayList;
import java.util.Date;

public class User {

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPassword;
    private String userJob;
    private int userAge;
    private ArrayList<Adress> adressArr;
    private Date userLastUpdate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public ArrayList<Adress> getAdressArr() {
        return adressArr;
    }

    public void setAdressArr(ArrayList<Adress> adressArr) {
        this.adressArr = adressArr;
    }

    public Date getUserLastUpdate() {
        return userLastUpdate;
    }

    public void setUserLastUpdate(Date userLastUpdate) {
        this.userLastUpdate = userLastUpdate;
    }
}
