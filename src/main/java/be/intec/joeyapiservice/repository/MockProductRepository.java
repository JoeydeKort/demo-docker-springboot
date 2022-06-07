package be.intec.joeyapiservice.repository;

import be.intec.joeyapiservice.enity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MockProductRepository implements ProductRepository{


    @Override
    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();
        Product apple = new Product();
        apple.setTitle("apple");
        products.add(apple);

        Product orange = new Product();
        orange.setTitle("orange");
        products.add(orange);

        Product banana = new Product();
        banana.setTitle("banana");
        products.add(banana);

        Product redBerries = new Product();
        redBerries.setTitle("redberries");
        products.add(redBerries);

        return products;
    }

}
