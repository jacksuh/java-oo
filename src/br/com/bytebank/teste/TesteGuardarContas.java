package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardarContas;

public class TesteGuardarContas {

    public static void main(String[] args) {
        GuardarContas guardador = new GuardarContas();

        Conta cc = new ContaCorrente(22, 11);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        guardador.adiciona(cc);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
