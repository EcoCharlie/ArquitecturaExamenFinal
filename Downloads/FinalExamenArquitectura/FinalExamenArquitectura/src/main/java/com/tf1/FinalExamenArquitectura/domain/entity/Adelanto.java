package com.tf1.FinalExamenArquitectura.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "adelanto")
@Data
public class Adelanto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private String userId;

    @Column(length = 5, nullable = false)
    private Float mount;

    @Column(length = 20)
    private Date date = new Date();
}
