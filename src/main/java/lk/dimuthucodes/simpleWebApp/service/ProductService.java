package lk.dimuthucodes.simpleWebApp.service;

import lk.dimuthucodes.simpleWebApp.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000),
            new Product(104,"Handfree",100)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int proId) {
//        for (Product product : products) {
//            if (product.getProId() == proId) {
//                return product;
//            }
//        }
        return products.stream()
                .filter(p -> p.getProId() == proId)
                .findFirst().orElse(new Product(100,"No Data",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
