package com.example.memorydb.Entity;

import lombok.Data;

@Data
public abstract class Entity implements PrimaryKey {

    private Long id;
}
