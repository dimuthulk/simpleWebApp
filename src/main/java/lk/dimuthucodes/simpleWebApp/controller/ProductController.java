package lk.dimuthucodes.simpleWebApp.controller;

import lk.dimuthucodes.simpleWebApp.model.Product;
import lk.dimuthucodes.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController  {

    @Autowired
    ProductService service;

    @RequestMapping("products")
    public List<Product> getProduct() {
        return service.getProducts();
    }
}
