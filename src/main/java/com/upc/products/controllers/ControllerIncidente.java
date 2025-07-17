package com.upc.products.controllers;

import com.upc.products.dtos.IncidenteDTO;
import com.upc.products.dtos.ReporteTipoIncidenteDTO;
import com.upc.products.interfaces.InterfaceIncidente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/edquen/incidentes")
@CrossOrigin(origins = "${ip.frontend}", allowCredentials = "true", exposedHeaders = "Authorization")
public class ControllerIncidente {

    @Autowired
    private InterfaceIncidente service;

    @PostMapping
    public IncidenteDTO registrar(@RequestBody IncidenteDTO dto) {
        return service.registrar(dto);
    }

    @GetMapping("/reporte")
    //@PreAuthorize("hasRole('POLI')")
    public List<ReporteTipoIncidenteDTO> reporte() {
        return service.obtenerReporteCantidadPorTipo();
    }
}
