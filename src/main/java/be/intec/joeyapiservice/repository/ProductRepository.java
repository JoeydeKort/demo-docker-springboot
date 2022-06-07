package be.intec.joeyapiservice.repository;

import be.intec.joeyapiservice.enity.Product;
import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

}
