package br.com.bytebank.modelo;

public class GuardarContas {

    private Conta[] referencias;
    private int posicaoLivre = 0;

    public GuardarContas(){
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }


    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
