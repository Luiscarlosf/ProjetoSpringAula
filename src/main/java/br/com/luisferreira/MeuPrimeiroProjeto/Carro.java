package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Carro {

    @GetMapping("/acelerar")
    public void acelerar(){
        // acelerar por 10 metros
        System.out.println("o carro está andando.");
    }

    @GetMapping("/freiar")
    public String frear(){
        return "O seu carro está freiando.";
    }

}
