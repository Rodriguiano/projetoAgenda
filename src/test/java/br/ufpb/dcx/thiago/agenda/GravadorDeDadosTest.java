package br.ufpb.dcx.thiago.agenda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class GravadorDeDadosTest {

    @Test
    public void testaGravacao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        if (arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        assertFalse(arquivo.exists());
        HashMap <String, Contato> contatosMap = new HashMap<>();
        contatosMap.put("Thiago", new Contato("Thiago",27,2));
        gravadorDeDados.salvarContatos(contatosMap);
        assertTrue(arquivo.exists());
        arquivo.delete();
    }

    @Test
    public void testaRecuperacao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        if (arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        assertFalse(arquivo.exists());
        HashMap <String, Contato> contatosMap = new HashMap<>();
        contatosMap.put("Thiago", new Contato("Thiago",27,2));
        gravadorDeDados.salvarContatos(contatosMap);
        assertTrue(arquivo.exists());
        HashMap<String, Contato> contatosRecuperados = gravadorDeDados.recuperarContatos();
        Contato c1 = contatosRecuperados.get("Thiago");
        assertEquals(27, c1.getDiaAniversario());
        assertEquals(2, c1.getMesAniversario());
        assertEquals("Thiago", c1.getNome());
        arquivo.delete();
    }


}