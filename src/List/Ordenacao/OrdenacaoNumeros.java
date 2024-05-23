package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> numerosI;

    public OrdenacaoNumeros() {
        this.numerosI = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosI.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemAscendente = new ArrayList<>(this.numerosI);
        if (!numerosI.isEmpty()) {
            Collections.sort(ordemAscendente);
            return ordemAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }


    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDescendente = new ArrayList<>(this.numerosI);
        if (!numerosI.isEmpty()) {
            ordemDescendente.sort(Collections.reverseOrder());
            return ordemDescendente;
        }
        else{
        throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosI.isEmpty()) {
            System.out.println(this.numerosI);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
