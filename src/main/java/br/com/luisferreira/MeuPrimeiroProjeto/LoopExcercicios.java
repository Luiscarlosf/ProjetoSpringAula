package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoopExcercicios {

    @GetMapping("/imprimeNumerosConsole")
    public void imprimeNumerosConsole(){

        Integer contador = 1;

        do{

            System.out.println(contador);
            contador++;

        } while(contador <= 10);

    }

    @GetMapping("/imprimeNumerosParesConsole")
    public void imprimeNumerosParesConsole(){

        Integer contador = 1;

        while(contador <= 20){

            if(contador % 2 == 0){

                System.out.println(contador);

            }

            contador++;

        }

    }

    @GetMapping("/somaDe1A100NoNavegador")
    public String somaDe1A100NoNavegador(){

        Integer soma = 0;
        String fraseDeRetorno = "";

        for(int i = 1; i <= 100; i++){

            soma = soma + i;

        }

        fraseDeRetorno = "O valor total para a soma dos números de 01 a 100 é de: "+soma;

        return fraseDeRetorno;

    }

    @GetMapping("/imprimeElementosLista")
    public void imprimeElementosLista(){

        String[] listaNomes = {"Luis", "João", "Fernando", "Cláudio"};
        Integer contador = 0;

        do{

            System.out.println(listaNomes[contador]);
            contador++;

        } while(contador < listaNomes.length);

    }

    @GetMapping("/imprimeNumerosImparesConsole")
    public void imprimeNumerosImparesConsole(){

        Integer contador = 1;

        while(contador <= 50){

            if(contador % 2 != 0){

                System.out.println(contador);

            }

            contador++;

        }

    }

    @GetMapping("/multiplicacaoDe1A10")
    public String multiplicacaoDe1A10(){

        Integer multiplicacao = 1;
        String fraseDeRetorno = "";

        for(int i = 1; i <= 10; i++){

            multiplicacao = multiplicacao * i;

        }

        fraseDeRetorno = "O produto da multiplicação entres os números de 01 a 10 é de: "+multiplicacao;

        return fraseDeRetorno;

    }

    @GetMapping("/imprimeListaFrutasConsole")
    public void imprimeListaFrutasConsole(){

        String[] listaFrutas = {"maçã", "banana", "pera", "kiwi"};

        for(int i = 0; i < listaFrutas.length; i++){

            System.out.println(listaFrutas[i]);

        }

    }

    @GetMapping("/imprimePrimoNavegador/{numero}")
    public Boolean imprimePrimoNavegador(@PathVariable("numero") int numero){

        Integer contadorDivisores = 0;

        for(int i = 1; i <= numero; i++){

            if(numero % i == 0){
                contadorDivisores = contadorDivisores + 1;
            }

        }

        Boolean resultadoFinal;

        if(contadorDivisores == 2){
            resultadoFinal = true;
        }else{
            resultadoFinal = false;
        }

        return resultadoFinal;

    }

    @GetMapping("/imprimeValoresOrdemDecrescenteConsole")
    public void imprimeValoresOrdemDecrescenteConsole(){

        for(int i = 10; i >= 1; i--){

            System.out.println(i);

        }

    }

/*    @GetMapping("/trianguloDeAsteriscos") -> estudar melhor a construção.
    public void trianguloDeAsteriscos(){

        StringBuilder triangulo = new StringBuilder();
        Integer n = 10;
        for(int i = 0; i < n; i++){
            triangulo.append("*");
            System.out.println(triangulo.toString());
        }

    }
*/
}
