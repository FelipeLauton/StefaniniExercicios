package br.com.stefanini.cestadecompras.model;

public class ItemProduto implements Comparable<ItemProduto>{

	private Integer idItem;
	private Produto produto;
	private Integer quantidade;
	private Double valorFinal;
	
	
	public ItemProduto() {
		// TODO Auto-generated constructor stub
	}

	public ItemProduto(Integer idItem, Produto produto, Integer quantidade) {
		super();
		this.idItem = idItem;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemProduto [idItem=" + idItem + ", produto=" + produto + ", quantidade=" + quantidade + ", valorFinal="
				+ valorFinal + "]";
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public int compareTo(ItemProduto o) {
		return this.idItem.compareTo(o.getIdItem());
	}
}
