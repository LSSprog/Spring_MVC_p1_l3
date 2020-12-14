package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.model.Product;
import spring.mvc.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductRepositoryController {
    private ProductRepository productRepository;

    public ProductRepositoryController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/all")
    public String getAllProducts(Model model) {
        model.addAttribute("frontProd", productRepository.getProductList());
        return "all_products";
    }

    @PostMapping("/add")
    public String addNewProduct(@ModelAttribute Product product) {
        productRepository.addProduct(product);
        return "redirect:/products/all";
    }

}


