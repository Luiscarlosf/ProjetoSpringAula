package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class somadorNumerico {


    @GetMapping("/somador/{numero}/{numero2}/{numero3}/{numero4}")

    public String somaVariaveis(@PathVariable("numero") int numero, @PathVariable("numero2") int numero2, @PathVariable("numero3") int numero3, @PathVariable("numero4") int numero4){

        Integer[] soma = {numero, numero2, numero3, numero4};
        Integer somador = 0;
        Integer numeroMaior = 0; //como inicializar sem a necessidade de atribuir um valor?
        Integer numeroMenor = 0; //como inicializar sem a necessidade de atribuir um valor?

        for (int i = 0; i < soma.length; i++) {

            somador = somador + soma[i];

            if(soma[i] > numeroMaior) {

                numeroMaior = soma[i];

            }

            if(soma[i] < numeroMenor || numeroMenor == 0) {

                numeroMenor = soma[i];

            }

        }

        String fraseDeRetorno = "A soma total foi de: "+somador+", onde o maior número digitado foi: "+numeroMaior+" e o menor número foi: "+numeroMenor;

        return fraseDeRetorno;

    }

}
