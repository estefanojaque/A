package com.upc.products.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TipoIncidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dsaeId;

    @Column(nullable = false)
    private String dsaeNombre;
}

