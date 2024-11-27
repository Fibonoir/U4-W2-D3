import classes.Customer;
import classes.Order;
import classes.Product;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Sample Products
        Product p1 = new Product(1, "Book1", "Books", 100.0);
        Product p2 = new Product(2, "Book2", "Books", 200.0);
        Product p3 = new Product(3, "Baby toy", "Baby", 50.0);
        Product p4 = new Product(4, "Boys shirt", "Boys", 150.0);
        Product p5 = new Product(5, "Boys pants", "Boys", 200.0);

        //Sample Customers
        Customer c1 = new Customer(1, "John", 1);
        Customer c2 = new Customer(2, "Jane", 2);

        //Sample Orders
        Order o1 = new Order (1, "Delivered", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 5), Arrays.asList(p1, p2), c1);
        Order o2 = new Order (2, "Delivered", LocalDate.of(2021, 2, 12), LocalDate.of(2021, 2, 20), Arrays.asList(p3, p4), c2);
        Order o3 = new Order (3, "Processing", LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 10), Arrays.asList(p5, p1), c1);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
        List<Order> orders = Arrays.asList(o1, o2, o3);

        //Exercise 1
        System.out.println("Exercise 1");
        List<Product> expensiveBooks = exercises.ExOne.getExpensiveBooks(products);
        System.out.println("\nExpensive Books (>100):\n" + expensiveBooks);

        //Exercise 2
        List<Order> babyOrders = exercises.ExTwo.getOrdersWithBabyProducts(orders);
        System.out.println("\nOrders with Baby Products:\n" + babyOrders);

        //Exercise 3
        List<Product> discountedBoysProducts = exercises.ExThree.getDiscountedBoysProducts(products);
        System.out.println("\nDiscounted Boys Products:\n" + discountedBoysProducts);

        //Exercise 4
        LocalDate startDate = LocalDate.of(2021, 1, 1);
        LocalDate endDate = LocalDate.of(2021, 2, 28);
        List<Product> tier2Products = exercises.ExFour.getProductsOrderedByTier2CustomersBetweenDates(orders, startDate, endDate);
        System.out.println("\nProducts ordered by Tier 2 customers between " + startDate + " and " + endDate + ":\n" + tier2Products);
    }
}
