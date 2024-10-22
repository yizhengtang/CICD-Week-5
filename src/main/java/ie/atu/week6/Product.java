package ie.atu.week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "Product ID must be greater than 0!!!")
    private int id;
    @NotBlank(message = "Product Name cannot be blank!!!")
    private String name;
    @Min(value = 1, message = "Price must be greater than 0!!!")
    private double price;

}
