package dados;

import java.util.List;

import entidades.Dogsons;
import entidades.Dono;

public interface INDDono {
	String cadastrar(Dono d);
	String deletar(Dono d);
	
	List<Dogsons> list();
	

}
