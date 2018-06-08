package negocios;
import java.util.List;

import entidades.Dogsons;
import entidades.Hospedar;

public interface INEHospedar {
	
	

	int hospedar();
	void deletar(Dogsons dog);
	void cancelar(Dogsons dog);
	int salvar(Dogsons dog);
	List<Hospedar>list();
	

}
