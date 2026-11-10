package com.example.chamarGarcom.Service;

import com.example.chamarGarcom.DTO.MasaDto.MesaRequestDTO;
import com.example.chamarGarcom.DTO.MasaDto.MesaResponseDTO;
import com.example.chamarGarcom.Mapper.MesaMapper;
import com.example.chamarGarcom.Entityes.Mesa.Mesa;
import com.example.chamarGarcom.Repositoryes.MesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {

    private final MesaRepository mesaRepository;

    public MesaService(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public List<MesaResponseDTO> listarMesasSalao(){
        return mesaRepository.findAll().stream()
                .map(MesaMapper::toDto)
                .toList();
    }

    public MesaResponseDTO criaMesa(MesaRequestDTO dto){
        Mesa mesa = MesaMapper.toEntity(dto);

        Mesa salvo = mesaRepository.save(mesa);
        return MesaMapper.toDto(salvo);

    }

}
