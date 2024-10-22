package ie.atu.week6;

import org.springframework.stereotype.Service;

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
}
