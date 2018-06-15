package dados;

import java.util.List;

import entidades.Dogsons;

public interface INDDogsons {
	
	int salvar(Dogsons d);
	void deletar(int id);
	Dogsons get(int id);
	
	List<Dogsons> list();
	List<Dogsons> listByDono(int id);

}
