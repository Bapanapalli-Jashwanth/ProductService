package dev.nama.productcathologservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddNewProductRequestDto {
    private Long id;
    private String title;
    private double price;
    private String description;

    private String image;
    private String category;

}
