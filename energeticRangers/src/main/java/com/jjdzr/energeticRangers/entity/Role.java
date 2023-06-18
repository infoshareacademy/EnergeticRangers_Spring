package com.jjdzr.energeticRangers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table (name="role")
public class Role {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }
}
