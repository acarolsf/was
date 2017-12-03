package interfaces;

import java.util.List;

import bean.Usuario;

public interface UsuarioInterface {
	public void cadastrarUsuario(Usuario usuario);
	public List<Usuario> listarUsuario();
	public void excluirUsuario(Usuario usuario);

}
