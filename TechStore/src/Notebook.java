public class Notebook extends Device{
    public Notebook(int productId, String productName, double productPrice, String productBrand, int productStorage, int productScreen, int productRam) {
        super(productId, productName, productPrice, productBrand, productStorage, productScreen, productRam);
    }

    public void addProduct(int productId, String productName, double productPrice, String productBrand,
                              int productStorage, int productScreen, int productRam){

        new Notebook( productId,productName, productPrice,  productBrand,
        productStorage, productScreen, productRam);
    }
}
