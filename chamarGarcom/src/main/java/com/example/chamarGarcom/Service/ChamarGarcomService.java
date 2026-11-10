package com.example.chamarGarcom.Service;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomRequestDTO;
import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import com.example.chamarGarcom.DTO.MasaDto.MesaResponseDTO;
import com.example.chamarGarcom.Entityes.Garcom.ChamarGarcom;
import com.example.chamarGarcom.Enums.StatusChamado;
import com.example.chamarGarcom.Mapper.ChamarGarcomMapper;
import com.example.chamarGarcom.Entityes.Mesa.Mesa;
import com.example.chamarGarcom.Repositoryes.ChamarGarcomRepository;
import com.example.chamarGarcom.Repositoryes.MesaRepository;
import org.springframework.stereotype.Service;

@Service
public class ChamarGarcomService {

    private final MesaRepository mesaRepository;
    private final ChamarGarcomRepository chamarGarcomRepository;

    public ChamarGarcomService (MesaRepository mesaRepository, ChamarGarcomRepository chamarGarcomRepository) {
        this.mesaRepository = mesaRepository;
        this.chamarGarcomRepository = chamarGarcomRepository;
    }


    public ChamarGarcomResponseDTO criarChamado(ChamarGarcomRequestDTO dto){
        Mesa mesa = mesaRepository.findById(dto.getMesaId())
                .orElseThrow(()-> new RuntimeException("Mesa não encontrado"));

        ChamarGarcom chamarGarcom = ChamarGarcomMapper.toEntity(dto);
        chamarGarcom.setMesa(mesa);
        chamarGarcom.setTipoChamado(dto.getTipoChamado());

        ChamarGarcom salvo = chamarGarcomRepository.save(chamarGarcom);

        return ChamarGarcomMapper.toDto(salvo);

    }

    public ChamarGarcomResponseDTO atualizarChamado(ChamarGarcomRequestDTO dto, Long id){
        ChamarGarcom chamarGarcom = chamarGarcomRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Chamado não encontrado"));

        chamarGarcom.setStatus(StatusChamado.ATENDIDO);

        ChamarGarcom salvo = chamarGarcomRepository.save(chamarGarcom);
        return ChamarGarcomMapper.toDto(salvo);
    }



}
