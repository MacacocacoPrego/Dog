package negocios;

import entidades.Dogsons;
import java.util.List;

public interface INEDogson {
	
	int salvar(Dogsons d);
	void deletar(int id);
	Dogsons get(int id);
	
	List<Dogsons> list();
	List<Dogsons> listByDono(int id);
}
