package com.eukolos.restaurant.dto;

import com.eukolos.restaurant.model.Account;
import com.eukolos.restaurant.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductDtoConverter {
    public ProductDto convert(Product product){
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .amount(product.getAmount())
                .price(product.getPrice())
                .build();
    }
}
