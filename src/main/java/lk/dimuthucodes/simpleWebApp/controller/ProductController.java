package lk.dimuthucodes.simpleWebApp.controller;

import lk.dimuthucodes.simpleWebApp.model.Product;
import lk.dimuthucodes.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController  {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/products/{Id}")
    public Product getProductById (@PathVariable(value = "Id") int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        System.out.println(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping(("/products/{Id}"))
    public void deleteProduct(@PathVariable(value = "Id") int proId){
        service.removeProduct(proId);
    }
}
