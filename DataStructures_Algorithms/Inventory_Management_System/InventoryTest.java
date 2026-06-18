package DataStructures_Algorithms.Inventory_Management_System;

public class InventoryTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Product laptop = new Product("Laptop", 10, 50000);
		Product phone = new Product("Phone", 20, 25000);
		long laptopId = inventory.addProduct(laptop);
		long phoneId = inventory.addProduct(phone);
		System.out.println("Added Products");
		System.out.println(inventory.getProduct(laptopId));
		System.out.println(inventory.getProduct(phoneId));
		Product updatedLaptop = new Product("Gaming Laptop", 15, 75000);
		inventory.updateProduct(laptopId, updatedLaptop);
		System.out.println("\nAfter Update");
		System.out.println(inventory.getProduct(laptopId));
		inventory.deleteProduct(phoneId);
		System.out.println("\nAfter Delete");
		System.out.println(inventory.getProduct(phoneId));
	}

}
