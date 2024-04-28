package dev.naman.productservicettsevening.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends dev.naman.productservicettsevening.models.BaseModel {
    private String name;
    private String description;
    private List<dev.naman.productservicettsevening.models.Product> products;
}