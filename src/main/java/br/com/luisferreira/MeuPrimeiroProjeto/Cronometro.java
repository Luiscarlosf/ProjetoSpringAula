package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cronometro {

    @GetMapping("/tempoPadrao")

    public Integer tempoInicial(){

        return 0;

    }
    
    @GetMapping("/iniciarCronometro")

    public String iniciar(){

        return "Cronômetro iniciado!";

    }

    @GetMapping("/addTempoExtra")

    public Integer adicionarTempoEmSegundos(){

        return tempoInicial() + 1;

    }

    @GetMapping("/pausarCronometro")

    public String pausar(){

        return "Cronômetro pausado!";

    }

    @GetMapping("/encerrarCronometro")

    public String encerrar(){

        return "Cronômetro encerrado!";

    }

    
}
