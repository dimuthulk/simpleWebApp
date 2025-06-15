package lk.dimuthucodes.simpleWebApp.controller;

import lk.dimuthucodes.simpleWebApp.model.Product;
import lk.dimuthucodes.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController  {

    @Autowired
    ProductService service;
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/products/{Id}")
    public ResponseEntity<Product> getProductById (@PathVariable(value = "Id") Integer proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody Product prod){
        return service.addProduct(prod);
    }

    @PutMapping("/products")
    public ResponseEntity<String> updateProduct(@RequestParam Integer proId, @RequestParam Integer newPrice){
        return service.updatePrice(proId,newPrice);
    }

    @DeleteMapping(("/products/{Id}"))
    public ResponseEntity<String> deleteProduct(@PathVariable(value = "Id") Integer proId){
        return service.removeProduct(proId);
    }
}
