package br.com.bytebank.teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";

        String outra = nome.replace("A", "a");

        System.out.println(nome);
        System.out.println(outra);

        //trim tirar o espaço
        String vazio ="    Alura    ";

        String outroVazio = vazio.trim();

        System.out.println(vazio.isEmpty());

        //Constains verifica se existe
        System.out.println(outroVazio.contains("Alu"));
    }
}
