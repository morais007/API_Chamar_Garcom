package com.example.chamarGarcom.Controller;

import com.example.chamarGarcom.DTO.MasaDto.MesaRequestDTO;
import com.example.chamarGarcom.DTO.MasaDto.MesaResponseDTO;
import com.example.chamarGarcom.Service.MesaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesas")
@CrossOrigin("*")
public class MesaController {

    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }


    @GetMapping
    public ResponseEntity<List<MesaResponseDTO>> listarMesas() {
        return ResponseEntity.ok(mesaService.listarMesasSalao());
    }

    @PostMapping
    public ResponseEntity<MesaResponseDTO> criarMesasSalao(@RequestBody MesaRequestDTO dto){
        MesaResponseDTO mesas = mesaService.criaMesa(dto);
        return ResponseEntity.status(201).body(mesas);
    }


}
