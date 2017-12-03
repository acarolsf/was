package interfaces;

import bean.Corretora;

import java.util.List;

public interface CorretoraInterface {
	public void cadastrarCorretora(Corretora Corretora);
	public void excluirCorretora(Corretora Corretora);
	public List<Corretora> listarCorretoras();
}
