package br.com.amicis.model;

import java.util.Date;

public class Notificacao {

	private int id;
	private Perfil perfil;
	private String usuario;
	private Date data;
	private String conteudo;

	public Notificacao(Perfil perfil) {
		setPerfil(perfil);
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Date getDataNoficacao() {
		return data;
	}

	public void setDataNoficacao(Date data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
