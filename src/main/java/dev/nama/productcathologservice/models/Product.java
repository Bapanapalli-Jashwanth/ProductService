package dev.naman.productservicettsevening.models;

import dev.naman.productservicettsevening.models.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends dev.naman.productservicettsevening.models.BaseModel {
    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageUrl;
}