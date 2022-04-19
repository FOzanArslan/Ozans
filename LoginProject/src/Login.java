import java.util.Scanner;
public class Login {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String uName = sc.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String uPassword = sc.nextLine();

        if (uName.equals("fatizan77")  && uPassword.equals("fatihozan77")){
            System.out.print("Başarılı giriş yaptınız");

        }else {

            System.out.println("Kullanıcı bilgileriniz hatalı");
            System.out.println("Şifrenizi değiştimek istermisiniz?(Y): ");
            String uChoice = sc.nextLine();
            if (uChoice.charAt(0) == 'Y' || uChoice.charAt(0) == 'y'){
                System.out.println("Yeni şifrenizi giriniz: ");
                String uNPassword = sc.nextLine();
                if (uNPassword.equals("fatihozan77")){
                    System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }

            }
        }

    }
}
