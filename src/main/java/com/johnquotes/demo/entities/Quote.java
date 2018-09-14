package com.johnquotes.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Quote {

    @Id
    private String id;
    private String quote;
}
