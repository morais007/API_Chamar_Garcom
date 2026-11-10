package com.example.chamarGarcom.Controller;

import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomRequestDTO;
import com.example.chamarGarcom.DTO.ChamarGarcomDto.ChamarGarcomResponseDTO;
import com.example.chamarGarcom.Service.ChamarGarcomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chamadas")
@CrossOrigin("*")
public class ChamarGarcomController {

    private final ChamarGarcomService chamarGarcomService;

    public ChamarGarcomController(ChamarGarcomService chamarGarcomService) {
        this.chamarGarcomService = chamarGarcomService;
    }

    @PostMapping
    public ResponseEntity<ChamarGarcomResponseDTO> chamarGarcomNaMesa(@RequestBody ChamarGarcomRequestDTO dto){
        ChamarGarcomResponseDTO chamar = chamarGarcomService.criarChamado(dto);
        return ResponseEntity.status(201).body(chamar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChamarGarcomResponseDTO> chamadoAtualizado(@PathVariable Long id, @RequestBody ChamarGarcomRequestDTO dto){
        return ResponseEntity.ok(chamarGarcomService.atualizarChamado(dto, id));
    }
}
