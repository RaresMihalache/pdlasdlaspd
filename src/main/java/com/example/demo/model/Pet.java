package com.example.demo.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Pet")
@NoArgsConstructor
@Data
public class Pet {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private int age;

    @Column
    @NonNull
    private String breed;

    @Column
    @NonNull
    private String details;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @NonNull
    private Owner owner;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
