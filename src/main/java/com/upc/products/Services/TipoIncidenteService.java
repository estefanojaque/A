package com.upc.products.Services;

import com.upc.products.dtos.TipoIncidenteDTO;
import com.upc.products.interfaces.InterfaceTipoIncidente;
import com.upc.products.repositories.TipoIncidenteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoIncidenteService implements InterfaceTipoIncidente {
    @Autowired
    private TipoIncidenteRepository repo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TipoIncidenteDTO> listar() {
        return repo.findAll()
                .stream()
                .map(e -> modelMapper.map(e, TipoIncidenteDTO.class))
                .collect(Collectors.toList());
    }
}
