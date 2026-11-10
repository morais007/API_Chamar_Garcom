package com.example.chamarGarcom.Repositoryes;

import com.example.chamarGarcom.Entityes.Mesa.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {

}
