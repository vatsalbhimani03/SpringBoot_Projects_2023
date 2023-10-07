package com.example.jparelationships.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Student {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue
    private Integer id;

    @Column(length = 255, nullable = false)
    private String name;

    // you can use Date/LocalDate but that's old, Instant is new
    @Builder.Default
    private Instant createDate = Instant.now();

    @Builder.Default
    private Instant updateDate = Instant.now();

    @Transient
    private String funnyName;


    // Setting up a relationship between two table
    @OneToOne
    private StudentPermit studentPermit;

    @OneToMany
    private List<Review> reviews;


    //@ManyToOne

    //@ManyToMany

}
