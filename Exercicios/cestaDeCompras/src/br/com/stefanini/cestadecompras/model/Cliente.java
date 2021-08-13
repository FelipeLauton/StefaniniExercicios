package br.com.stefanini.cestadecompras.model;

public class Cliente implements Comparable<Cliente>{

	private Integer idCliente;
	private String nomeCliente;
	private String cpf;
	private Endereco endereco;
	private Produto produto;
	
	public Cliente() {
	}
	
	public Cliente(Integer idCliente, String nomeCliente, String cpf) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
	}

	public Cliente(Integer idCliente, String nomeCliente, String cpf, Endereco endereco, Produto produto) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.endereco = endereco;
		this.produto = produto;
	}

	public Cliente(Integer idCliente, String nomeCliente, String cpf, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", endereco="
				+ endereco + ", produto=" + produto + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.idCliente.compareTo(o.getIdCliente()) ;
	}
	
}
