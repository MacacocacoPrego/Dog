package negocios;

import java.util.List;
import entidades.Hospedar;

public interface INEHospedar {
	
	int salvar(Hospedar h);
	void finalizar(int id);
	void deletar(int id);
	Hospedar get(int id);

	List<Hospedar>list();

}
