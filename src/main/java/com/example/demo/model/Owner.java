package com.example.demo.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Owner")
@NoArgsConstructor
@SuperBuilder
@Data
@PrimaryKeyJoinColumn
public class Owner extends User{

    /*@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column
    @NonNull
    private String username;

    @Column
    @NonNull
    private String password;*/

    @Column(nullable = false)
    private int balance;

    /*@Column
    @NonNull
    private String role = "";*/

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Pet> pets;

    /*public Owner(@NonNull String username, @NonNull String password, @NonNull String role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = 1;
    }*/
}
