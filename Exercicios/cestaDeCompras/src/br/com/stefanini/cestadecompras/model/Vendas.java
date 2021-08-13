package br.com.stefanini.cestadecompras.model;

public class Vendas {

	private Integer idVenda;
	private int qntdVendas;
	
	public Vendas() {
		// TODO Auto-generated constructor stub
	}

	public Vendas(Integer idVenda, int qntdVendas) {
		super();
		this.idVenda = idVenda;
		this.qntdVendas = qntdVendas;
	}
	
	@Override
	public String toString() {
		return "Vendas [idVenda=" + idVenda + ", qntdVendas=" + qntdVendas  
				+ "]";
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public int getQntdVendas() {
		return qntdVendas;
	}

	public void setQntdVendas(int qntdVendas) {
		this.qntdVendas = qntdVendas;
	}
	
}
