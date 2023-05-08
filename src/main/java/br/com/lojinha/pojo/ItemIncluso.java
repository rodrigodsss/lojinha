package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public String getNome(){
        return this.nome;
    }
   public ItemIncluso(String nomeInicial, int quantidadeInicial) {
       this.nome = nomeInicial;
       this.quantidade = quantidadeInicial;
   }

    public void setNome (String nome){
            this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
