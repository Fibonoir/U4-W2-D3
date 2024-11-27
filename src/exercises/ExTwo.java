package exercises;

import classes.Order;

import java.util.List;
import java.util.stream.Collectors;

public class ExTwo {
    public static List<Order> getOrdersWithBabyProducts(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "Baby".equalsIgnoreCase(product.getCategory())))
                .collect(Collectors.toList());
    }
}
