package br.com.stefanini.cestadecompras.controller;

import br.com.stefanini.cestadecompras.model.ItemProduto;

public class CalculoProduto {

	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setValorFinal(item.getProduto().getPreco() * item.getQuantidade());
	}
}
