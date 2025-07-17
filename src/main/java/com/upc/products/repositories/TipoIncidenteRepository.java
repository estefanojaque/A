package com.upc.products.repositories;

import com.upc.products.entities.TipoIncidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIncidenteRepository extends JpaRepository<TipoIncidente, Long> {
}
