package dados;

import java.util.List;

import entidades.Dogsons;

public interface INDDogsons {
	String cadastrar(Dogsons d);
	String deletar(int id);
	String Servi�o();
	
	List<Dogsons> list();

}
