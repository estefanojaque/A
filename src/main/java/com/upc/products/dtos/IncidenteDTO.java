package com.upc.products.dtos;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IncidenteDTO {
    private Long dsaeId;
    private String dsaeDescripcion;
    private LocalDate dsaeFecha;
    private String dsaeLugar;
    private Long dsaeTipoIncidenteId;
}
