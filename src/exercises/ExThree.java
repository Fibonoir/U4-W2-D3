package exercises;

import classes.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ExThree {
    public static List<Product> getDiscountedBoysProducts(List<Product> products) {
        return products.stream()
                .filter(product -> "Boys".equalsIgnoreCase(product.getCategory()))
                .map(product -> new Product(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice() * 0.9
                ))
                .collect(Collectors.toList());
    }
}
