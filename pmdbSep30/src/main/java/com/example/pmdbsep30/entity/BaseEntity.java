package com.example.pmdbsep30.entity;

import lombok.Builder;
import java.time.Instant;


public class BaseEntity {

    @Builder.Default
    protected Instant createDate = Instant.now();

    @Builder.Default
    protected Instant updateDate = Instant.now();

}
