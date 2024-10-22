package ie.atu.week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct (Product product)
    {
        //Do Business stuff like retrieving details from DB, or generating files like PDF etc.
        myList.add(product);
        return myList;
    }
}
