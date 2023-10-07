package com.example.microserviceuserdata.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserOtherData {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String login;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    private String name;

    private String company;

    @JsonProperty("public_repos")
    private String publicRepos;

}

