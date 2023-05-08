package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("SONY", Tamanho.MEDIO);

        System.out.println(meuProduto.getMarca());

        meuProduto.setNome("PlayStation 4");
        meuProduto.setValor(30.00);

        List<ItemIncluso> itensInclusos = new ArrayList<ItemIncluso>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 3);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(2));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());

        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }

        System.out.println("Acabaram os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("SONY", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55555);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        
        ProdutoInternacional meuProdutoInterncional = new ProdutoInternacional("SAMSUNG", Tamanho.MEDIO);
        meuProdutoInterncional.setValor(1500);

    }
}
