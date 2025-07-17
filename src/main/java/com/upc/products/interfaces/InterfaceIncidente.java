package com.upc.products.interfaces;


import com.upc.products.dtos.IncidenteDTO;
import com.upc.products.dtos.ReporteTipoIncidenteDTO;

import java.util.List;

public interface InterfaceIncidente {
    IncidenteDTO registrar(IncidenteDTO incidenteDTO);
    List<ReporteTipoIncidenteDTO> obtenerReporteCantidadPorTipo();
}
