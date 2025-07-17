package com.upc.products.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ReporteTipoIncidenteDTO {
    private String dsaeTipoNombre;
    private Long dsaeCantidad;

    public ReporteTipoIncidenteDTO(String dsaeTipoNombre, Long dsaeCantidad) {
        this.dsaeTipoNombre = dsaeTipoNombre;
        this.dsaeCantidad = dsaeCantidad;
    }

    public String getDsaeTipoNombre() {
        return dsaeTipoNombre;
    }

    public void setDsaeTipoNombre(String dsaeTipoNombre) {
        this.dsaeTipoNombre = dsaeTipoNombre;
    }

    public Long getDsaeCantidad() {
        return dsaeCantidad;
    }

    public void setDsaeCantidad(Long dsaeCantidad) {
        this.dsaeCantidad = dsaeCantidad;
    }
}


