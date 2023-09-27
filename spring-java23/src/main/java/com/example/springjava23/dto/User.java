package com.example.springjava23.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.NonNull;

@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    @NonNull
    private Integer age;
}
