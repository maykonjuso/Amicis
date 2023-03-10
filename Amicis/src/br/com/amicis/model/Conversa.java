package br.com.amicis.model;

import java.util.ArrayList;

public class Conversa {   
	private int id;    
	private Usuario perfil;    
	private Usuario amigo;    
	private ArrayList<Mensagem> mensagens;   
	
public Conversa(Usuario usuario, Usuario amigo){     
	mensagens = new ArrayList<Mensagem>(); 
	this.setPerfil(usuario);       
	this.setAmigo(amigo);   
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean temId() {
		if (id >= 0) {
			return true;
		}
		return false;
	}
	
	
	public Usuario getPerfil() {
		return perfil;
	}
	
	public void setPerfil(Usuario perfil) {
		this.perfil = perfil;
	}
	
	public Usuario getAmigo() {
		return amigo;
	}
	
	public void setAmigo(Usuario amigo) {
		this.amigo = amigo;
	}
	
	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}
	
	public void setMensagens(ArrayList<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}
	
	public void adicionarMensagem(Mensagem mensagem) {
		mensagens.add(mensagem);
	}
	
	public void removerMensagem(Mensagem mensagem) {
		mensagens.remove(mensagem);
	}
	
	public Mensagem getMensagem(int posicao) {
		return mensagens.get(posicao);
	}
	
	public int sizeMensagens() {
		return mensagens.size();
	}
}