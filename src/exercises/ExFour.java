package exercises;

import classes.Order;
import classes.Product;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ExFour {
    public static List<Product> getProductsOrderedByTier2CustomersBetweenDates(List<Order> orders, LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

    }
}
