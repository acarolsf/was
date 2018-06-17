package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import bean.Usuario;

@SuppressWarnings("deprecation")
@ManagedBean (name= "shit")
public class Login {
	
	private Usuario usuario = new Usuario();
	
	public String efetuarLogin() {
		//UsuarioDao user = new UsuarioDao();
		Usuario x = new Usuario();
		
		 if(x.getLogin().equals(usuario.getLogin()) && x.getSenha().equals(usuario.getSenha())) {
			 return "principal";
		 } else {
		      FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
		      FacesContext.getCurrentInstance().addMessage("erro", msg);
		      return null;
		  }
	}
	public String logarusuario() {
		
		 if("admin".equals(usuario.getLogin()) && "123".equals(usuario.getSenha())) {
			 return "principal";
		 } else {
		      FacesMessage msg = new FacesMessage("Usuário ou senha inválido!");
		      FacesContext.getCurrentInstance().addMessage("erro", msg);
		      return null;
		  }
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
