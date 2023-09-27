package com.example.guestregistration.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

// Database annotations
//@Entity will need unique Id property
@Entity
@Data
@Table(name="GUEST_DETAILS")
public class Guest {
    @Id // unique id
    @GeneratedValue(strategy = GenerationType.AUTO) // generating id automatically
    @Column(name = "GUEST_ID") // In database it will rename id column name to GUEST_ID
    private Integer id;

    @Column(nullable = false) // Firstname won't be null
    private String firstName;

    @Column(updatable = false)
    private String lastName;

    @Column(unique = true, nullable = false) // email will be unique
    private String email;

    private Date createDate;
    private Date updateDate;


}
