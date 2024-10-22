package ie.atu.week6;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //Creating a class which is interested in request and responses. Separation of Concern.
    @GetMapping
    public List<Product> getProduct()
    {
        list = myService.getProduct();
        return list;
    }

    @PostMapping
    public  List<Product> newProduct(@RequestBody Product product)
    {
        //Send it to business logic
        list = myService.addProduct(product);
        return list;
    }
}
