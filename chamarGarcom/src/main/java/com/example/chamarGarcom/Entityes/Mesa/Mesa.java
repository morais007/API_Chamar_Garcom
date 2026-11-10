package com.example.chamarGarcom.Entityes.Mesa;

import com.example.chamarGarcom.Entityes.Garcom.ChamarGarcom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mesa")
@NoArgsConstructor
@AllArgsConstructor
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroMesa;

    @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL)
    private List<ChamarGarcom> chamarGarcons = new ArrayList<>();

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

    public List<ChamarGarcom> getChamarGarcons() {
        return chamarGarcons;
    }

    public void setChamarGarcons(List<ChamarGarcom> chamarGarcons) {
        this.chamarGarcons = chamarGarcons;
    }
}
