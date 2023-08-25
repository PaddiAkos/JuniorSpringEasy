package com.JuniorEasy.demo.Spring.model;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumberId", nullable = false, unique = true)
    private Long NumberId;

    private double number1;

    private double number2;



}
