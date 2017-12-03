package controller;

import java.util.List;
import bean.Corretora;
import bean.Usuario;
import interfaces.InterfaceControlador;





public class Controler implements InterfaceControlador{
	
	private ControladorCorretora controleCorretora;
	private ControladorUsuario controladorUsuario;

	public Controler(){
		this.controleCorretora = new ControladorCorretora();
		this.controladorUsuario = new ControladorUsuario();
	
	}
	//Corretora
	
	public void cadastrarCorretora(Corretora corretora) {
		controleCorretora.cadastrarCorretora(corretora);
		
	}


	
	public void excluirCorretora(Corretora corretora) {
		controleCorretora.excluirCorretora(corretora);
		
	}

	
	public List<Corretora> listarCorretoras() {
		return controleCorretora.listarCorretoras();
	}

	
	
	//Usuario

	public List<Usuario> ListarUsuario() {
		return controladorUsuario.listarUsuario();
	}
		
	public void cadastrarUsuario(Usuario usuario) {
		controladorUsuario.cadastrarUsuario(usuario);		
	}
	@Override
	public void excluirUsuario(Usuario usuario) {
		
		controladorUsuario.excluirUsuario(usuario);
	}
		


	
	
	
	
}
