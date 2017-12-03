package dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import bean.Usuario;
import interfaces.UsuarioInterface;
import util.JPAUtil;

public class UsuarioDao implements UsuarioInterface, Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
	private EntityManager manager;
	
	public Usuario porId(long id){
		manager = JPAUtil.getEntityManager();
		return manager.find(Usuario.class, id);
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
	}


	
	public void excluirUsuario(Usuario usuario) {
		
		usuario = porId(usuario.getId());
		manager.getTransaction().begin();
		manager.remove(usuario);
		manager.getTransaction().commit();
		manager.close();

	}

	
	public List<Usuario> listarUsuario() {
		manager = JPAUtil.getEntityManager();
		usuarios = manager.createQuery("FROM tb_usuario", Usuario.class).getResultList();
		manager.close();
		return usuarios;

	}

}


