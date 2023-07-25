package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificadorInteligente {

    // verificar com Matheus como construir um array com quebras de linhas.
    Integer soma = 0;
    Integer media;
    Integer divisivelPor5 = 0;
    Integer numeroNulo = 0;
    Integer somaDePares = 0;
    Integer[] numerosDigitados = new Integer[5];
    String[] frasesDeRetorno = new String[5];

    public void verifica(int i){

        soma = soma + numerosDigitados[i];
        media = soma / numerosDigitados.length;
        if(numerosDigitados[i] % 5 == 0 && numerosDigitados[i] != 0){
            divisivelPor5 = divisivelPor5 + 1;
        }
        if(numerosDigitados[i] == 0){
            numeroNulo = numeroNulo + 1;
        }
        if(numerosDigitados[i] % 2 == 0){
            somaDePares = somaDePares + numerosDigitados[i];
        }

    }
    @GetMapping("/verificador1/{numero1}/{numero2}/{numero3}/{numero4}/{numero5}")
    public String[] verificador(@PathVariable("numero1") int n1, @PathVariable("numero2") int n2, @PathVariable("numero3") int n3, @PathVariable("numero4") int n4, @PathVariable("numero5") int n5){

      numerosDigitados[0] = n1;
      numerosDigitados[1] = n2;
      numerosDigitados[2] = n3;
      numerosDigitados[3] = n4;
      numerosDigitados[4] = n5;

      for(int i = 0; i < numerosDigitados.length; i++){
          verifica(i);
      }

      frasesDeRetorno[0] = "A soma total dos valores digitados foi de: "+soma;
      frasesDeRetorno[1] = "A média entre os valores digitados é de: "+media;
      frasesDeRetorno[2] = "O número total de valores divisíveis por 5 é de: "+divisivelPor5;
      frasesDeRetorno[3] = "Há "+numeroNulo+" valor nulo entre os valores digitados";
      frasesDeRetorno[4] = "A soma dos números pares digitados é de: "+somaDePares;

      return frasesDeRetorno;

    }

}
