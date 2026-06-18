package DataStructures_Algorithms.ECommerce_Platform;

public class Product {

    private long productId;
    private String productName;
    private String category;

    private static long id = 10000;

    public Product(String productName, String category) {
        this.productId = ++id;
        this.productName = productName;
        this.category = category;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                "\nProduct Name: " + productName +
                "\nCategory: " + category;
    }
}