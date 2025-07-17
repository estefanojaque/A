package com.upc.products.repositories;

import com.upc.products.dtos.ReporteTipoIncidenteDTO;
import com.upc.products.entities.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
    @Query("SELECT new com.upc.products.dtos.ReporteTipoIncidenteDTO(i.dsaeTipoIncidente.dsaeNombre, COUNT(i)) " +
            "FROM Incidente i GROUP BY i.dsaeTipoIncidente.dsaeNombre")
    List<ReporteTipoIncidenteDTO> cantidadPorTipo();
}
