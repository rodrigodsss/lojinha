package br.com.lojinha.pojo;

import br.com.lojinha.Interface.Favorito;
import br.com.lojinha.enums.Tamanho;



public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaDeImportacao;
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }
    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }
    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }
    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + "," + this.getMarca() + "e" + this.getValor();
    }
}
