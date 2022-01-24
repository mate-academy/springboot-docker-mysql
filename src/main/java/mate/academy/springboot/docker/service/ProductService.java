package mate.academy.springboot.docker.service;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.docker.model.Product;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    List<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to);

    List<String> getUppercaseTitles();
}
