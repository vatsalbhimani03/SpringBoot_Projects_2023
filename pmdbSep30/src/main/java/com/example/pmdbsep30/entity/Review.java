package com.example.pmdbsep30.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id; // I can't use primitive data type (int) on Generic Id, that's why we use Integer

    private int rating;

    private String reviewText;

    @Builder.Default
    private Instant createDate = Instant.now();

    @Builder.Default
    private Instant updateDate = Instant.now();
}
