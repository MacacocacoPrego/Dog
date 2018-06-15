package negocios;

import java.util.List;

import entidades.Dogsons;
import entidades.Dono;

public interface INEDono {
	int cadastrar(Dono D);
	void deletar(Dono D);

	
	List<Dogsons> list();
	
}
