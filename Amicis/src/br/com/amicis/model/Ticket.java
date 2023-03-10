package br.com.amicis.model;

import java.util.Date;

public class Ticket {

	private String usuario;
	private String conteudo;
	private Date data;
	private int protocolo;
	private String status;
	private String severidade;
	
	public Ticket (Usuario usuario) {
		usuario.getPerfil().getSuporte().adicionarTicket(this);
		this.setUsuario(usuario.getUsuario());
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeveridade() {
		return severidade;
	}

	public void setSeveridade(String severidade) {
		this.severidade = severidade;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
