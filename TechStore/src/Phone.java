public class Phone extends Device{
    private int productCamera;
    private double productBattery;
    private String productColor;

    public Phone(int productId, String productName, double productPrice, String productBrand, int productStorage,
                 int productScreen, int productRam,int productCamera,
                 double productBattery, String productColor) {
        super(productId, productName, productPrice, productBrand,
                productStorage, productScreen, productRam);
        this.productBattery = productBattery;
        this.productColor = productColor;
        this.productCamera = productCamera;
    }
}
