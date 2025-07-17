package com.upc.products.Services;



import com.upc.products.dtos.IncidenteDTO;
import com.upc.products.dtos.ReporteTipoIncidenteDTO;
import com.upc.products.entities.Incidente;
import com.upc.products.entities.TipoIncidente;
import com.upc.products.interfaces.InterfaceIncidente;
import com.upc.products.repositories.IncidenteRepository;
import com.upc.products.repositories.TipoIncidenteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidenteService implements InterfaceIncidente {
    @Autowired
    private IncidenteRepository incidenteRepository;

    @Autowired
    private TipoIncidenteRepository tipoIncidenteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public IncidenteDTO registrar(IncidenteDTO incidenteDTO) {
        Incidente incidente = new Incidente();
        incidente.setDsaeDescripcion(incidenteDTO.getDsaeDescripcion());
        incidente.setDsaeFecha(incidenteDTO.getDsaeFecha());
        incidente.setDsaeLugar(incidenteDTO.getDsaeLugar());

        Optional<TipoIncidente> tipo = tipoIncidenteRepository.findById(incidenteDTO.getDsaeTipoIncidenteId());
        tipo.ifPresent(incidente::setDsaeTipoIncidente);

        incidente = incidenteRepository.save(incidente);
        return modelMapper.map(incidente, IncidenteDTO.class);
    }

    @Override
    public List<ReporteTipoIncidenteDTO> obtenerReporteCantidadPorTipo() {
        return incidenteRepository.cantidadPorTipo();
    }
}
