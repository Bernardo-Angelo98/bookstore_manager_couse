package com.bern6angel.bookstoremanager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;



}
