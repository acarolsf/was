package controller;


import java.util.List;

import dao.CorretoraDao;
import interfaces.CorretoraInterface;
import bean.Corretora;

public class ControladorCorretora implements CorretoraInterface {
	
	private CorretoraDao rp;
	
	public ControladorCorretora(){
		rp = new CorretoraDao();
	}
		
	
	public void cadastrarCorretora(Corretora corretora) {
		rp.cadastrarCorretora(corretora);
		
	}

	
	public void excluirCorretora(Corretora Corretora) {
		rp.excluirCorretora(Corretora);
		
	}



	public List<Corretora> listarCorretoras() {
		return rp.listarCorretoras();
	}

	




	

}
