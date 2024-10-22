package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
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
    public List<Product> getAllProducts()
    {
        list = myService.getAllProducts();
        return list;
    }

    @PostMapping
    public  List<Product> newProduct(@Valid @RequestBody Product product)
    {
        //Send it to business logic
        list = myService.addProduct(product);
        return list;
    }

    @PutMapping("/{id}")
    public List<Product> updateProduct (@PathVariable int id, @RequestBody Product product)
    {
        list = myService.updateProduct(id, product);
        return list;
    }

    @DeleteMapping ("/{id}")
    public List<Product> deleteProduct (@PathVariable int id)
    {
        list = myService.deleteProduct(id);
        return list;
    }
}
