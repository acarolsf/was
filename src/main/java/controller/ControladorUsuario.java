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

	@Override
	public List<Usuario> listarUsuario() {
		return rp.listarUsuario();
	}

	@Override
	public void cadastrarUsuario(Usuario usuario) {
		rp.cadastrarUsuario(usuario);
		
	}

	@Override
	public void excluirUsuario(Usuario usuario) {
	
		rp.excluirUsuario(usuario);
	}

}
