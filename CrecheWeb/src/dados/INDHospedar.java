package dados;

import java.util.List;
import entidades.Hospedar;

public interface INDHospedar {
	
	int salvar(Hospedar h);
	void finalizar(int id);
	void deletar(int id);
	Hospedar get(int id);

	List<Hospedar>list();
	
}
