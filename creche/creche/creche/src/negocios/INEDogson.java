package negocios;

import entidades.Dogsons;
import java.util.List;

public interface INEDogson {
	
	String cadastrar();
	String deletar();
	String Serviço();
	
	List<Dogsons> list();
}
