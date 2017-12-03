package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import fachada.Fachada;
import bean.Corretora;



@ManagedBean(name="beancorretora")

public class CorretoraBean {
	
	private Corretora corretora;
	private Fachada fachada;
	private List<Corretora> listCorretora;

	
	
	public CorretoraBean(){
		corretora = new Corretora();
		fachada = Fachada.getInstanceFachada();
		listCorretora = new ArrayList<Corretora>();
	
		
	}
	
	public Corretora getCorretora() {
		return corretora;
	}
	public void setCorretora(Corretora corretora) {
		this.corretora = corretora;
	}
	
	//Get e set da lista de usuarios;
	public List<Corretora> getListCorretora() {
		listCorretora = fachada.controler.listarCorretoras();
		return listCorretora;
	}

	public void setListCorretora(List<Corretora> listCorretora) {
		this.listCorretora = listCorretora;
	}

	//salvar Corretora
	public String salvarCorretora() {
	
		fachada.controler.cadastrarCorretora(corretora);
		corretora = new Corretora();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Corretora salvo com sucesso", "Corretora salvo com sucesso"));
		
		return "principal.xhtml";
	}
	//listar Corretoraes
	public String listarCorretora(){
		getListCorretora();
		return "consultarCorretoras.xhtml";
	}
	//excluir Corretora
	public String excluirCorretora(Corretora corretora){

		fachada.controler.excluirCorretora(corretora);
		
		FacesContext menssagem = FacesContext.getCurrentInstance();
		menssagem.addMessage(null, new FacesMessage("Corretora excluido com sucesso"));
		
		return "principal.xhtml";
	}

}
