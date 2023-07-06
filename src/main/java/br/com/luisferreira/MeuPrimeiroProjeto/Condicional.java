package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Condicional {

    @GetMapping("podeDirigir/{idade}/{carteira}")
    public String verificaSeTemMaisDe18AnosEPodeDirigir(@PathVariable("idade") int idade, @PathVariable("carteira") boolean temCarteira ){

        String fraseDeRetorno = "";

        if(idade >= 18 && temCarteira == true){

            fraseDeRetorno = "Pode dirigir";

        }else{

            fraseDeRetorno = "Não pode dirigir";

        }

        return fraseDeRetorno;
    }
}
