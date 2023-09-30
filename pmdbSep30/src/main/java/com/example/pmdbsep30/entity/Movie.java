package com.example.pmdbsep30.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String movieName;

    @Column(unique = true)
    private String uuid;

    @Column(columnDefinition = "BLOB")
    private String poster;

    @Builder.Default
    private Instant createDate = Instant.now();

    @Builder.Default
    private Instant updateDate = Instant.now();

    @OneToMany(targetEntity = Review.class, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Review> review;


}
