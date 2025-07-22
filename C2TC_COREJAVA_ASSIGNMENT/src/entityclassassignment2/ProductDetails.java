package entityclassassignment2;
import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];

        // Collecting details for 4 products
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Product Price: ");
            double price = Double.parseDouble(sc.nextLine());

            products[i] = new Product(id, name, price);
            System.out.println();
        }

        // Displaying all product details
        System.out.println("Product Details:");
        for (Product p : products) {
            p.display();
        }

        sc.close();
    }
}
