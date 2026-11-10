package com.example.chamarGarcom.Mapper;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import com.example.chamarGarcom.DTO.MasaDto.MesaRequestDTO;
import com.example.chamarGarcom.DTO.MasaDto.MesaResponseDTO;
import com.example.chamarGarcom.Entityes.Mesa.Mesa;

import java.util.List;

public class MesaMapper {

    public static Mesa toEntity(MesaRequestDTO dto){
        Mesa mesa = new Mesa();
        mesa.setNumeroMesa(dto.getNumeroMesa());

        return mesa;
    }

    public static MesaResponseDTO toDto(Mesa mesa){
        MesaResponseDTO dto = new MesaResponseDTO();
        dto.setId(mesa.getId());
        dto.setNumeroMesa(mesa.getNumeroMesa());


        if (mesa.getChamarGarcons() != null){
            List<ChamarGarcomResponseDTO> garcom = mesa.getChamarGarcons().stream()
                    .map(ChamarGarcomMapper::toDto)
                    .toList();

            dto.setChamarGarcons(garcom);
        }

        return dto;
    }
}
