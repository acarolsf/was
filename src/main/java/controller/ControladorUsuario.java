package controller;

import java.util.List;

import dao.UsuarioDao;
import interfaces.UsuarioInterface;
import bean.Usuario;

public class ControladorUsuario implements UsuarioInterface {
	
	private UsuarioDao rp;
	
	
	public ControladorUsuario(){
		this.rp = new UsuarioDao();
	}


	public List<Usuario> listarUsuario() {
		return rp.listarUsuario();
	}


	public void cadastrarUsuario(Usuario usuario) {
		rp.cadastrarUsuario(usuario);
		
	}


	public void excluirUsuario(Usuario usuario) {
	
		rp.excluirUsuario(usuario);
	}

}
