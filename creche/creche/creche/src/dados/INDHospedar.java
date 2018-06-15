package dados;

import java.util.List;

import entidades.Dogsons;
import entidades.Hospedar;

public interface INDHospedar {
	
	int hospedar(Dogsons dog);
	void deletar(Dogsons dog);
	int salvar(Dogsons dog);
	List<Hospedar>list();
	

}
