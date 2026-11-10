package com.example.chamarGarcom.Entityes.Garcom;

import com.example.chamarGarcom.Enums.StatusChamado;
import com.example.chamarGarcom.Enums.TipoChamado;
import com.example.chamarGarcom.Entityes.Mesa.Mesa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "chamarGarcom")
@NoArgsConstructor
@AllArgsConstructor
public class ChamarGarcom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;

    private LocalDateTime horarioChamado = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusChamado status = StatusChamado.PENDENTE;

    @Enumerated(EnumType.STRING)
    private TipoChamado tipoChamado;

//    public ChamarGarcom() {
//        this.horarioChamado = LocalDateTime.now();
//        this.status = StatusChamado.PENDENTE; // Já nasce como pendente por padrão
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
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
