package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeros.add(numero);

    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer i : numeros){
            soma += i;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n <= menorNumero) {
                    menorNumero = n;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }


}


