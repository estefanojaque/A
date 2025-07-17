package com.upc.products.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dsaeId;

    @Column(nullable = false)
    private String dsaeDescripcion;

    private LocalDate dsaeFecha;

    private String dsaeLugar;

    @ManyToOne
    @JoinColumn(name = "tipo_incidente_id")
    private TipoIncidente dsaeTipoIncidente;
}
