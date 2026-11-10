package com.example.chamarGarcom.Mapper;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomRequestDTO;
import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import com.example.chamarGarcom.Entityes.Garcom.ChamarGarcom;

public class ChamarGarcomMapper {

    public static ChamarGarcom toEntity(ChamarGarcomRequestDTO dto){
        ChamarGarcom chamarGarcom = new ChamarGarcom();
        chamarGarcom.setTipoChamado(dto.getTipoChamado());
//        chamarGarcom.setStatus(dto.getStatus());
//        chamarGarcom.setHorarioChamado(dto.getHorarioChamado());

        return chamarGarcom;
    }

    public static ChamarGarcomResponseDTO toDto(ChamarGarcom chamarGarcom){
        ChamarGarcomResponseDTO dto = new ChamarGarcomResponseDTO();
        dto.setId(chamarGarcom.getId());
        dto.setStatus(chamarGarcom.getStatus());
        dto.setTipoChamado(chamarGarcom.getTipoChamado());
        dto.setHorarioChamado(chamarGarcom.getHorarioChamado());
        dto.setMesaId(chamarGarcom.getMesa().getId());

        return dto;
    }
}
