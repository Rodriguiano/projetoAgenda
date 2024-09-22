package br.ufpb.dcx.thiago.agenda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {

    @Test
    public void testaConstrutor(){
        Contato c1 = new Contato("Thiago", 27, 2);
        assertEquals("Thiago", c1.getNome());
        assertEquals(27, c1.getDiaAniversario());
        assertEquals(2, c1.getMesAniversario());
    }

}