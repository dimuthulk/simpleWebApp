package lk.dimuthucodes.simpleWebApp.service;

import lk.dimuthucodes.simpleWebApp.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000),
            new Product(104,"Handfree",100));

    public List<Product> getProducts() {
        return products;
    }
}
