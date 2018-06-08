package dados;

import java.util.List;

import entidades.Dogsons;

public interface INDDogsons {
	String cadastrar();
	String deletar();
	String Serviço();
	
	List<Dogsons> list();

}
