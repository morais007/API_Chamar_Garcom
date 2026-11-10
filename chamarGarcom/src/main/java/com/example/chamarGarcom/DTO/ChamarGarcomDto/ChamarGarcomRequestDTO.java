package com.example.chamarGarcom.DTO.ChamarGarcomDto;

import com.example.chamarGarcom.Enums.StatusChamado;
import com.example.chamarGarcom.Enums.TipoChamado;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class ChamarGarcomRequestDTO {

    private Long mesaId;
    private LocalDateTime horarioChamado;
    private StatusChamado status = StatusChamado.PENDENTE;;
    private TipoChamado tipoChamado;

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    public LocalDateTime getHorarioChamado() {
        return horarioChamado;
    }

    public void setHorarioChamado(LocalDateTime horarioChamado) {
        this.horarioChamado = horarioChamado;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }

    public TipoChamado getTipoChamado() {
        return tipoChamado;
    }

    public void setTipoChamado(TipoChamado tipoChamado) {
        this.tipoChamado = tipoChamado;
    }
}
