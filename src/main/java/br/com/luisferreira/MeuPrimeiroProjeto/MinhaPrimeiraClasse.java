package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhaPrimeiraClasse {

    @GetMapping("/")
    public String  meuPrimeiroMetodo(){
        return "Meu nome é Luis Carlos Ferreira.";
    }

}
