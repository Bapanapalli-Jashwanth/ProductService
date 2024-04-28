package dev.nama.productcathologservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import dev.naman.productservicettsevening.dtos.RatingDto;

@Getter
@Setter
@ToString
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
    private RatingDto rating;
}