package br.com.bytebank.teste.util;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteLinkedList {
    //Generics

    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
