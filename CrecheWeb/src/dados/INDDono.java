package dados;

import java.util.List;
import entidades.Dono;

public interface INDDono {
	
	int salvar(Dono d);
	void deletar(Dono d);
	Dono get(int id);
	
	List<Dono> list();
	

}
