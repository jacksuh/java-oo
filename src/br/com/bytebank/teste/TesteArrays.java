package br.com.bytebank.teste;

public class TesteArrays {
    public static void main(String[] args) {
        int[]idades = new int[5]; //inicializa o array com os valores padroes

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade1 = idades[0];

        System.out.println(idade1);
        //length tamanho do array
        System.out.println(idades.length);


        int[]idade = new int[5]; //inicializa o array com os valores padroes

        for(int i = 0; i < idade.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }
}
