import java.util.Scanner;

public class AtmProject {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int hak = 3;
        int balance = 1500;

        do {
            System.out.println("Enter your username: ");
            String uName = sc.nextLine();
            System.out.println("Enter your password: ");
            String uPassword = sc.nextLine();
            if (uName.equals("ozan")&& uPassword.equals("fatihozan77")){
                do {
                    System.out.println("Yapmak istediğin şeyi seçiniz");
                    System.out.println("1-) Para Çekme\n"+ "2-) Para Yatırma\n"+ "3-) Bakiye Sorgula\n"+"4-) Çıkış Yap\n");
                    int uChoice = sc.nextInt();
                    switch (uChoice) {
                        case 1:
                            System.out.println("çekilecek miktarı giriniz");
                            int withdraw = sc.nextInt();

                            if (withdraw>balance){
                                System.out.println("Bakiyeniz Yetersiz");
                                break;
                            }else balance -= withdraw;
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            int deposit = sc.nextInt();
                            balance += deposit;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        case 4:
                        System.exit(0);
                        default:
                            System.out.println("Yanlış numara tuşladınız. ");
                }
            }while(true);

            }else {
                System.out.println("Your initials are wrong, please try again.");
                hak--;
            }

        }while (hak>0);
        if (hak == 0){
            System.out.println("Hesabınız bloke edilmiştir.");
        }
    }
}
