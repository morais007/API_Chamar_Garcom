package com.example.chamarGarcom.DTO.MasaDto;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MesaResponseDTO {

    private Long id;
    private Integer numeroMesa;
    private List<ChamarGarcomResponseDTO> chamarGarcons = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public List<ChamarGarcomResponseDTO> getChamarGarcons() {
        return chamarGarcons;
    }

    public void setChamarGarcons(List<ChamarGarcomResponseDTO> chamarGarcons) {
        this.chamarGarcons = chamarGarcons;
    }
}
