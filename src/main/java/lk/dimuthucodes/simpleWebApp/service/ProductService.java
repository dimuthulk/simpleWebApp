package lk.dimuthucodes.simpleWebApp.service;

import lk.dimuthucodes.simpleWebApp.model.Product;
import lk.dimuthucodes.simpleWebApp.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public ResponseEntity<Product> getProductById(Integer proId) {
        Optional<Product> product = productRepo.findById(proId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<String> addProduct(Product prod) {
        productRepo.save(prod);
        return ResponseEntity.ok("Product added successfully!");
    }

    public ResponseEntity<String> removeProduct(Integer proId) {
        Optional<Product> product = productRepo.findById(proId);
        if (product.isPresent()) {
            productRepo.deleteById(proId);
            return ResponseEntity.ok("Product deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<String> updatePrice(Integer proId, Integer newPrice) {
        Optional<Product> product = productRepo.findById(proId);
        if (product.isPresent()) {
            Product pro = product.get();
            pro.setProPrice(newPrice);
            productRepo.save(pro);
            return ResponseEntity.ok("Price updated successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
