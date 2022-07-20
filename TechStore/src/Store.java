import java.util.*;

public class Store {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Device newNotebook1 = new Notebook(1, "Huawei Matebook 14",
                7000,"Huawei", 512,14,16);
        Device newNotebook2 = new Notebook(2, "Lenovo Legion",
                8000,"Acer", 1024,14,8);

        ArrayList<Device> noteBookArr = new ArrayList<>();


        noteBookArr.add(newNotebook1);
        noteBookArr.add(newNotebook2);
        Collections.sort(noteBookArr,new NameComparator());


        int userChoice= -1;


        while (userChoice != 0){
            System.out.println("Device Control Panel");

            System.out.println("1 - Notebooks");
            System.out.println("2 - Show brands");
            System.out.println("3 - Delete product");
            System.out.println("4 - Add Product");
            System.out.println("0 - Exit");
            System.out.print("What is your choice : ");
            userChoice = input.nextInt();
            if (userChoice == 1) showNotebooks(noteBookArr);
            if (userChoice == 2){
                System.out.print("Which brand do you want to see? ");
                String userBrand = input.next();
                brandSelector(noteBookArr, userBrand.toLowerCase());
            }
            if (userChoice == 3){
                System.out.print("Give an id for deletion : ");
                int userDeleteId = input.nextInt();
                deleteDevice(noteBookArr, userDeleteId);
            }
            if(userChoice == 4){
                addProduct(noteBookArr);
            }
        }
    }
    public static void showNotebooks(ArrayList<Device> dv){
        for (Device i: dv) {
            System.out.println("Id : " + i.getProductId() + " Name : "+ i.getProductName()+
                    " Price : " + i.getProductPrice() + " Brand : "+ i.getProductBrand()
            + " Storage : " + i.getProductStorage()+ " Screen : "+ i.getProductScreen()
            +" Ram : " + i.getProductRam());
        }

    }

    public static void brandSelector(ArrayList<Device> dv, String brand){
        for (Device i: dv) {
            if(brand.equals(i.getProductBrand().toLowerCase())) {
                System.out.println("Id : " + i.getProductId() + " Name : " + i.getProductName() +
                        " Price : " + i.getProductPrice() + " Brand : " + i.getProductBrand()
                        + " Storage : " + i.getProductStorage() + " Screen : " + i.getProductScreen()
                        + " Ram : " + i.getProductRam());
            }
            }
    }

    public static boolean deleteDevice(ArrayList<Device> dv, int id){
        for (Device i: dv){
            if (id == i.getProductId()){
                dv.remove(i);
                return true;

            }
        }
        return false;
    }

    public static void addProduct (ArrayList<Device> dv){

        System.out.println("Welcome to adding new product");
        int highestid = 0;
        for (Device i : dv) {
            if (i.getProductId()>highestid) highestid = i.getProductId()+1;
        }
        System.out.print("Enter product name: ");
        String pname = input.next();
        System.out.println();
        System.out.print("Enter product price: ");
        double pprice = input.nextDouble();
        System.out.println();
        System.out.print("Enter product Brand: ");
        String pbname = input.next();
        System.out.println();
        System.out.print("Enter product Storage: ");
        int pStorage = input.nextInt();
        System.out.println();
        System.out.print("Enter product Screen: ");
        int pScreen = input.nextInt();
        System.out.println();
        System.out.print("Enter product Ram: ");
        int pRam = input.nextInt();
        dv.add(new Notebook(highestid,pname,pprice,pbname,pStorage,pScreen,pRam));
    }

}
