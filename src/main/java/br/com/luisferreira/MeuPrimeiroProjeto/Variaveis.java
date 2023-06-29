package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Variaveis {
    String nomePessoaVariavel = "Luis Carlos Ferreira Neto";
    int numerosParaSorteio[] = {1,5,9,12,46,85};
    @GetMapping("teste/retornaVariavel")
    public String retornaVariavel(){
        return nomePessoaVariavel;
    }

    @GetMapping("teste/retornaArray")
    public int retornaArray(){
        return numerosParaSorteio[2];
    }
}
