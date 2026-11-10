package com.example.chamarGarcom.Mesa;


import com.example.chamarGarcom.Entityes.Mesa.Mesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesaTest {

    @Test
    void deveCriarMesaComNumeroCorreto() {
        // Cenário (Arrange)
        Mesa mesa = new Mesa();
        mesa.setNumeroMesa(5);

        // Verificação (Assert)
        assertNotNull(mesa);
        assertEquals(5, mesa.getNumeroMesa());
    }
}
