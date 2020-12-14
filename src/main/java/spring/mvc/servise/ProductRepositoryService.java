package spring.mvc.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.mvc.model.Product;
import spring.mvc.repository.ProductRepository;

import java.util.List;
import java.util.Properties;

@Component
public class ProductRepositoryService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList() {
        return productRepository.getProductList();
    }

    public Product getProductById (int index) {
        return productRepository.getProductById(index);
    }

    public void addProduct (Product product) {
        productRepository.addProduct(product);
    }

}
