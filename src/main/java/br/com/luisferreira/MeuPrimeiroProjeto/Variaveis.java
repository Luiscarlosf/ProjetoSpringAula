package br.com.luisferreira.MeuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Variaveis {

    Integer age = 23;
    Double peso = 58.6;
    Boolean carroTemPneu = true;
    String nome = "Luis";
    Integer numero1 = 10;
    Integer numero2 = 5;
    Double preco = 29.99;
    Integer quantidade = 3;
    Integer[] numeros = {1, 6, 8, 15, 22};
    String[] familia = {"Cláudio", "Noeli", "Patrícia", "Pablo", "Edecir"};
    Float[] notas = {9.0F, 8.4F, 2.9F, 4.2F};
    Integer[] numerosInt = new Integer[7];
    Integer[] numerosInt2 = new Integer[4];

    @GetMapping("/idade")

    public Integer minhaIdade(){

        return age;

    }

    @GetMapping("/peso")

    public double meuPeso(){

        return peso;

    }

    @GetMapping("/temPneu")

    public Boolean carroTemPneu(){

        return carroTemPneu;

    }

    @GetMapping("/meuNome")

    public void nome(){

        System.out.println(nome);
    }

    @GetMapping("/soma")

    public Integer somaVariaveis(){

        return (numero1 + numero2);

    }

    @GetMapping("/multiplicacao")

    public double multTeste(){

        return (preco * quantidade);

    }

    @GetMapping("/arrayNumeros")

    public void arrayInt(){

        System.out.println(Arrays.toString(numeros));

    }

    @GetMapping("/arrayString")

    public String[] arrayStr(){

        return familia;

    }

    /*@GetMapping("/arrayString2")

    public void arrayStr2(){

        System.out.println(familia[2]);

    }
    exemplar de como selecionar um elemento específico de um array
    */

    @GetMapping("/mediaNotas")

    public Float[] arrayNot(){

        float soma = 0F;
        for(int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        Float[] returno = {soma / notas.length};
        return returno;
    }

    @GetMapping("/arrayInteiro")

    public Integer[] arrayInteiros(){

        numerosInt[0] = 1;
        numerosInt[1] = 6;
        numerosInt[2] = 4;
        numerosInt[3] = 8;
        numerosInt[4] = 16;
        numerosInt[5] = 0;
        numerosInt[6] = 10;

        return numerosInt;
    }

    @GetMapping("/arrayInteiroSoma")

    public Integer[] arrayInteirosSoma(){

        numerosInt2[0] = 3;
        numerosInt2[1] = 9;
        numerosInt2[2] = 4;
        numerosInt2[3] = 5;

        Integer somaT = 0;
        for (int i = 0; i < numerosInt2.length; i++) {
            somaT = somaT + numerosInt2[i];
        }

        return new Integer[]{somaT};

    }
    }

