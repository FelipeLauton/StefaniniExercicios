package br.com.stefanini.projetoprova.model;

public class Prova {

	private Integer idProva;
	private String nomeProva;
	private int nota;
	
	public Prova() {
	}

	public Prova(Integer idProva, String nomeProva) {
		super();
		this.idProva = idProva;
		this.nomeProva = nomeProva;
	}

	@Override
	public String toString() {
		return "Prova [idProva=" + idProva + ", nomeProva=" + nomeProva + ", nota=" + nota + "]";
	}

	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
