package dao;


import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import bean.Corretora;
import interfaces.CorretoraInterface;
import util.JPAUtil;

public class CorretoraDao implements CorretoraInterface, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Corretora> corretoras;
	private EntityManager manager;
	
	public Corretora porId(long id){
		manager = JPAUtil.getEntityManager();
		return manager.find(Corretora.class, id);
	}
	
	public void cadastrarCorretora(Corretora corretora) {
		manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(corretora);
		manager.getTransaction().commit();
		manager.close();
	}


	
	public void excluirCorretora(Corretora corretora) {
		
		corretora = porId(corretora.getId_corretora());
		manager.getTransaction().begin();
		manager.remove(corretora);
		manager.getTransaction().commit();
		manager.close();

	}

	
	
	public List<Corretora> listarCorretoras() {
		manager = JPAUtil.getEntityManager();
		corretoras = manager.createQuery("FROM tb_corretora", Corretora.class).getResultList();
		manager.close();
		return corretoras;

	}
}
