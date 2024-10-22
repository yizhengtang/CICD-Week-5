package ie.atu.week6;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> myList = new ArrayList<>();
    //Do Business stuff like retrieving details from DB, or generating files like PDF etc.

    //Handle Post requests
    public List<Product> addProduct (Product product)
    {
        myList.add(product);
        return myList;
    }

    //Handle Get Requests
    public List<Product> getAllProducts ()
    {
        return myList;
    }

    public List<Product> updateProduct (@PathVariable int id, @RequestBody Product product)
    {
        for (Product p : myList) {
            if (p.getId() == (id)) {
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

    public List<Product> deleteProduct (@PathVariable int id)
    {
        for (Product p : myList) {
            if (p.getId() == id) {
                myList.remove(p);
            }
        }
        return myList;
    }
}
