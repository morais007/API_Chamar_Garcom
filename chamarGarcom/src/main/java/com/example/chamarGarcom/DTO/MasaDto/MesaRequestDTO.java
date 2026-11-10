package com.example.chamarGarcom.DTO.MasaDto;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MesaRequestDTO {

    private Integer numeroMesa;
    private List<ChamarGarcomResponseDTO> chamarGarcons = new ArrayList<>();

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
