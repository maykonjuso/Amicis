package br.com.amicis.main;

import java.sql.SQLException;

import br.com.amicis.dao.AmigoDAO;
import br.com.amicis.dao.ConversaDAO;
import br.com.amicis.dao.NotificacaoDAO;
import br.com.amicis.dao.PublicacaoDAO;
import br.com.amicis.dao.UsuarioDAO;
import br.com.amicis.model.Conversa;
import br.com.amicis.model.Notificacao;
import br.com.amicis.model.Publicacao;
import br.com.amicis.model.Usuario;

public class Executar {

	public static void main(String[] args) throws SQLException {

		// para salvar os dados no banco
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		AmigoDAO amigoDAO = new AmigoDAO();
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		Usuario usuario4 = new Usuario();

		usuario1.setUsuario("maykona");
		usuario2.setUsuario("pedro");
		usuario3.setUsuario("paulo");
		usuario4.setUsuario("mauricio");
		usuario1.getPerfil().setBio("salve");
		usuario1.getPerfil().getStatus().setLocalidade("japão");

		usuario1.getPerfil().adicionarAmigo(usuario2.getPerfil());
		usuario1.getPerfil().adicionarAmigo(usuario3.getPerfil());
		usuario1.getPerfil().adicionarAmigo(usuario4.getPerfil());

		usuarioDAO.save(usuario1);
		usuarioDAO.save(usuario2);
		usuarioDAO.save(usuario3);
		usuarioDAO.save(usuario4);

		amigoDAO.save(usuario1.getPerfil());

		usuario2.getPerfil().setAmigos(amigoDAO.getAmigos(usuario1.getPerfil()));

		amigoDAO.save(usuario2.getPerfil());
		PublicacaoDAO publicacaoDAO = new PublicacaoDAO();

		Publicacao publicacao = new Publicacao(usuario1.getPerfil());

		publicacao.setConteudo("vai se fuder lula e bozo!");
		publicacao.setCoracao(1);

		publicacaoDAO.save(publicacao);

		// para listar os dados no banco

		Conversa conversa = new Conversa(usuario1.getPerfil(), 0);
		ConversaDAO conversaDAO = new ConversaDAO();

		conversa.setConteudo("vai se fuder");

		conversaDAO.save(conversa);

		Notificacao notificacao = new Notificacao(usuario1.getPerfil());
		NotificacaoDAO notificacaoDAO = new NotificacaoDAO();

		notificacao.setConteudo("bozo");

		notificacaoDAO.save(notificacao);

		for (Usuario usuario : usuarioDAO.getUsuarios()) {
			try {
				System.out.println(usuario.getPerfil().getNotificacao(0).getConteudo());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
