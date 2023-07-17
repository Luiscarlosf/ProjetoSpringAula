package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CondicionaisExercicios {

    @GetMapping("/verificadorIdade/{idade}")
    public String verificaorIdade(@PathVariable("idade") int idade){

        String fraseDeRetorno = "";

        if (idade >= 18) {
            fraseDeRetorno = "Você é maior de idade.";
        }else{
            fraseDeRetorno = "Você não é maior de idade.";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/maiorQueCem/{numero}")
    public String maiorQueCem(@PathVariable("numero") int numero){

       String fraseDeRetorno = "";

       if(numero > 100){
           fraseDeRetorno = "O número é maior que 100.";
       }else{
           fraseDeRetorno = "O número não é maior que 100.";
       }

       return fraseDeRetorno;

    }

    @GetMapping("/verificaDivisibilidade/{dividendo}")
    public String verificaDivisibilidade(@PathVariable("dividendo") int dividendo){

        String fraseDeRetorno = "";

        if(dividendo % 3 == 0 && dividendo % 5 == 0){
            fraseDeRetorno = "O número é divisivel por 3 e por 5 ao mesmo tempo.";
        }else{
            fraseDeRetorno = "O número não é divisivel por 3 e por 5 ao mesmo tempo.";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaPalavras/{palavra1}/{palavra2}/{palavra3}")
    public String[] verificaPalavras(@PathVariable("palavra1") String palavra1, @PathVariable("palavra2") String palavra2, @PathVariable("palavra3") String palavra3){

        String[] listaPalavras = {"amor", "paz", "felicidade"};
        String[] fraseDeRetorno = new String[3];
        String[] listaPalavrasDigitadas = {palavra1, palavra2, palavra3};
        Integer x = 0;

        for(int i = 0; i < listaPalavrasDigitadas.length; i++){
            for(int y = 0; y < listaPalavras.length; y++){
                if(listaPalavrasDigitadas[i].equals(listaPalavras[y])){
                    fraseDeRetorno[x] = "A palavra está na lista.";
                    break;
                }else{
                    fraseDeRetorno[x] = "A palavra não está na lista.";
                }
            }
            x++;
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaNumeroNegativo/{numero}")
    public String verificaNumeroNegativo(@PathVariable("numero") int numero){

        String fraseDeRetorno = "";

        if(numero < 0){
            fraseDeRetorno = "O número é negativo.";
        }else{
            fraseDeRetorno = "O número não é negativo.";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaAcessoEvento/{idade}/{temIngresso}")
    public String verificaAcessoEvento(@PathVariable("idade") int idade, @PathVariable("temIngresso") Boolean temIngresso){
        String fraseDeRetorno = "";

        if(idade >= 18 && temIngresso == true){
            fraseDeRetorno = "Acesso permitido!";
        }else{
            fraseDeRetorno = "Acesso negado!";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaDiaDeTrabalho/{dia}")
    public String verificaDiaDeTrabalho(@PathVariable("dia") int dia){

        Integer[] diasDeTrabalho = {1, 2, 3, 4, 5};
        String fraseDeRetorno = "";

        for(int i = 0; i < diasDeTrabalho.length; i++){

            if(dia == diasDeTrabalho[i]){
                fraseDeRetorno = "Dia de Trabalho!";
                break;
            }else{
                fraseDeRetorno = "Fim de semana, aproveite!";
            }

        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaEmprestimo/{valor}/{temConta}")
    public String verificaEmprestimo(@PathVariable("valor") int valor, @PathVariable("temConta") Boolean temConta){

        String fraseDeRetorno = "";

        if(valor >= 2000 && temConta == true){
            fraseDeRetorno = "Empréstimo aprovado!";
        }else{
            fraseDeRetorno = "Empréstimo negado!";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaCombinacaoAcoes/{empresaA}/{empresaB}")
    public String verificaCombinacaoAcoes(@PathVariable("empresaA") Boolean empresaA, @PathVariable("empresaB") Boolean empresaB){

        String fraseDeRetorno = "";

        if(empresaA == true && empresaB == true){
            fraseDeRetorno = "Combinação inválida!";
        }else{
            fraseDeRetorno = "Combinação válida!";
        }

        return fraseDeRetorno;

    }

    @GetMapping("/verificaUsuario/{usuario}/{senha}")
    public String verificaUsuario(@PathVariable("usuario") String usuario, @PathVariable("senha") int senha){

        String usuarioAdm = "admin";
        Integer senhaAdm = 123456;
        String fraseDeRetorno = "";

        if(usuario.equals(usuarioAdm) && senha == senhaAdm){
            fraseDeRetorno = "Acesso concedido.";
        }else{
            fraseDeRetorno = "Acesso negado.";
        }

        return fraseDeRetorno;

    }

}
