package com.example.chamarGarcom.Repositoryes;

import com.example.chamarGarcom.Entityes.Garcom.ChamarGarcom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamarGarcomRepository extends JpaRepository<ChamarGarcom, Long> {
}
