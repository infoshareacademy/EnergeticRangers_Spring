package com.jjdzr.energeticRangers.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
@Data
@Entity
@Table(name="_user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String name;
    @Column()
    private String surname;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable (
            name="users_roles",
            joinColumns = @JoinColumn (
                    name ="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn (
                    name ="role_id", referencedColumnName = "id"))

    private Collection<Role> roles;


    public User(String name, String surname, String email, String password, Collection<Role> roles) {
        super();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public User() {

    }
}
