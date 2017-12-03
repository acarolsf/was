package bean;

import java.util.ArrayList;
import java.util.List;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fachada.Fachada;
import bean.Usuario;

@ManagedBean(name="beanusuario")
@SessionScoped
public class UsuarioBean {
	
	private Usuario usuario;
	private Fachada fachada;
	private List<Usuario> listaUsuario;
	
	public UsuarioBean() {
		usuario = new Usuario();
		fachada = Fachada.getInstanceFachada();
		listaUsuario = new ArrayList<Usuario>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String logarusuario(){
		Usuario usuariook = new Usuario();
		usuariook = usuarioExisteNoBanco(usuario);
		//testa se o usuario existe no banco se exister, retorna logado, se o usuario for igual a nulo, retorna para pagina index;
		if(usuariook == null){
			usuario = new Usuario();
			FacesContext menssagem = FacesContext.getCurrentInstance();
			menssagem.addMessage(null, new FacesMessage("Usuario invalido"));
			return "index.xhtml";
			
		}else {
			FacesContext fc = FacesContext.getCurrentInstance();
			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("usuario", usuariook);
			return "principal.xhtml";
		}
	
	}
	
public Usuario usuarioExisteNoBanco(Usuario usuario) {
		
		listaUsuario = fachada.controler.ListarUsuario();
		
		for (Usuario usuarioset : listaUsuario) {

			String loginset = usuarioset.getLogin();
			String senhaset = usuarioset.getSenha();
			// coloca um usuario em cada atributo dos usuarios da lista
			Usuario usuarioTeste = new Usuario();
			usuarioTeste.setLogin(loginset);
			usuarioTeste.setSenha(senhaset);
			// testa se o login do usuario da lista é o mesmo login do usuario da pagina
			//testa o login
			if (usuarioTeste.getLogin().equals(usuario.getLogin())) {
				System.out.println("login ok");
				//testa a senha
				if (usuarioTeste.getSenha().equals(usuario.getSenha())) {
					System.out.println("senha ok");
					Usuario usuarioOK = usuarioset;
					return usuarioOK;//retorna o usuario logado
				}
			}

		}

		return null;//se ele não existir retorna null;
	}
	
	public String sairlogin(){
		
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.removeAttribute("usuario");
		
		return "index.xhtml";
	
	}
	public String salvarUsuario() {
	
		fachada.controler.cadastrarUsuario(usuario);
		usuario = new Usuario();
		FacesContext menssagem = FacesContext.getCurrentInstance();
		menssagem.addMessage(null, new FacesMessage("Usuario salvo com sucesso"));
		
		return "principal.xhtml";
	}
	public void testausuario(){
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
	}
	
	public String excluirUsuario(){

		fachada.controler.excluirUsuario(usuario);
		
		FacesContext menssagem = FacesContext.getCurrentInstance();
		menssagem.addMessage(null, new FacesMessage("Usuario excluido com sucesso"));
		
		return "principal.xhtml";
	}
}
