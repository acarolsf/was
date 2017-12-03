package interfaces;

import java.util.List;

import bean.Usuario;
import bean.Corretora;

public interface InterfaceControlador {
	
	public void cadastrarCorretora(Corretora corretora);
	public void excluirCorretora(Corretora corretora);
	public List<Corretora> listarCorretoras();

//Usuario
	public List<Usuario> ListarUsuario();
	public void cadastrarUsuario(Usuario usuario);
	public void excluirUsuario(Usuario usuario);
	
}
