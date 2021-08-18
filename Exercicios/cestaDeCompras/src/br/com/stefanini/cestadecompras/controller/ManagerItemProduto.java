package br.com.stefanini.cestadecompras.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.cestadecompras.model.Cliente;
import br.com.stefanini.cestadecompras.model.Endereco;
import br.com.stefanini.cestadecompras.model.ItemProduto;
import br.com.stefanini.cestadecompras.model.Produto;
import br.com.stefanini.cestadecompras.model.Vendas;

public class ManagerItemProduto {

	private List<ItemProduto> items;

	public ManagerItemProduto() {
		
		this.items = new ArrayList<ItemProduto>();
	}

	public List<ItemProduto> getItems() {
		return items;
	}

	public void setItems(List<ItemProduto> items) {
		this.items = items;
	}

	public void mock() throws Exception {
		Endereco e1 = new Endereco(10,"Rua 2","São Paulo","SP","053503");
		Endereco e2 = new Endereco(11,"Rua 3","Rio de Janeiro","RJ","394024");
		Endereco e3 = new Endereco(12,"Rua 4","Naboo","SP","035367");
		Produto p1 = new Produto(100, "Sabre de Luz", 5000.);
		Produto p2 = new Produto(102, "Mochila", 300.);
		Produto p4 = new Produto(104,"Blusa",50.);
		Cliente c1 = new Cliente(1,"Danilo","540.349.234-24",e1,p1);
		Cliente c2 = new Cliente(2,"Julia","550.233.242-94",e2,p2);
		Cliente c3 = new Cliente(3,"Carlos","780.002.124-01",e3,p4);
		Vendas v = new Vendas(1,0);
		ItemProduto item1 = new ItemProduto(100, p1, 1);
		ItemProduto item2 = new ItemProduto(101, p2, 3);
		ItemProduto item3 = new ItemProduto(102, p4, 2);
		CalculoProduto calc1 = new CalculoProduto();
		CalculoProduto calc2 = new CalculoProduto();
		CalculoProduto calc3 = new CalculoProduto();
		calc1.gerarPrecoItemProduto(item1);
		calc2.gerarPrecoItemProduto(item2);
		calc3.gerarPrecoItemProduto(item3);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		v.setQntdVendas(items.size());
		Collections.sort(items);

		System.out.println(items);
		System.out.println("Total de itens vendidos :" + v.getQntdVendas());
		System.out.println(c1 + ","+ c2 + "," +c3);
	}

	public static void main(String[] args) {
		try {
			new ManagerItemProduto().mock();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}

