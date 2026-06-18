package DataStructures_Algorithms.ECommerce_Platform;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[10];

        String[] names = {
                "Laptop",
                "Smartphone",
                "Headphones",
                "Keyboard",
                "Mouse",
                "Monitor",
                "Tablet",
                "Smartwatch",
                "Printer",
                "Speaker"
        };

        String[] categories = {
                "Electronics",
                "Electronics",
                "Accessories",
                "Accessories",
                "Accessories",
                "Electronics",
                "Electronics",
                "Wearables",
                "Office",
                "Audio"
        };

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(names[i], categories[i]);
        }

        System.out.print("Enter Product Name for Linear Search: ");

        String productName = sc.nextLine().trim();
        boolean found = false;
        System.out.println("\nLinear Search Result:");
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product Not Found");
        }

        Arrays.sort(products, (p1, p2) -> Long.compare(p1.getProductId(), p2.getProductId()));

        System.out.print("\nEnter Product ID for Binary Search: ");
        long targetId = sc.nextLong();

        Product result = binarySearch(products, targetId);

        System.out.println("\nBinary Search Result:");
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }

    public static Product binarySearch(Product[] products, long targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long currentId = products[mid].getProductId();
            if (currentId == targetId) {
                return products[mid];
            }
            if (currentId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}