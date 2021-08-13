package br.com.stefanini.cestadecompras.controller;

import br.com.stefanini.cestadecompras.model.Cliente;
import br.com.stefanini.cestadecompras.model.Endereco;
import br.com.stefanini.cestadecompras.model.Produto;

public class Teste {

	public static void main(String[] args)throws Exception {
		ManagerItemProduto m = new ManagerItemProduto();
		Endereco e1 = new Endereco(10,"Rua 2","São Paulo","SP","053503");
		Produto p1 = new Produto(100,"Blusa",50.);
		Cliente c = new Cliente(1,"Danilo","540.349.234-24",e1,p1);
		
		
		
	}
}
