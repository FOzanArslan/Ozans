public class Device {
    private int productId;
    private String productName;
    private double productPrice;
    private String productBrand;
    private int productStorage;
    private int productScreen;
    private int productRam;

    public Device(int productId, String productName, double productPrice, String productBrand, int productStorage, int productScreen, int productRam) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
        this.productStorage = productStorage;
        this.productScreen = productScreen;
        this.productRam = productRam;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(int productStorage) {
        this.productStorage = productStorage;
    }

    public int getProductScreen() {
        return productScreen;
    }

    public void setProductScreen(int productScreen) {
        this.productScreen = productScreen;
    }

    public int getProductRam() {
        return productRam;
    }

    public void setProductRam(int productRam) {
        this.productRam = productRam;
    }
}
