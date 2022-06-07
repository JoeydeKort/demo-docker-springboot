package be.intec.joeyapiservice.controller;

import be.intec.joeyapiservice.enity.Product;
import be.intec.joeyapiservice.repository.MockProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final MockProductRepository repo;

    public ProductController(MockProductRepository mockProductRepository) {
        this.repo= mockProductRepository;
    }

    @GetMapping("/all")
    public List<Product> getAll() {

        return repo.getAll();

    }

}
