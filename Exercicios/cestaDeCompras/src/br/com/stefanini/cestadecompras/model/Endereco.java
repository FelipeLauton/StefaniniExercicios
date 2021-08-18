package br.com.stefanini.cestadecompras.model;

public class Endereco {

	private Integer idEndereco;
	private String rua;
	private String cidade;
	private String estado;
	private String cep;
	private Cliente cliente;
	
	public Endereco() {
	}

	public Endereco(Integer idEndereco, String rua, String cidade, String estado, String cep) {
		super();
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", rua=" + rua + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + "]";
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
