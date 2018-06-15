package negocios;

import java.util.List;
import entidades.Dono;

public interface INEDono {
	
	int salvar(Dono d);
	void deletar(Dono d);
	Dono get(int id);
	
	List<Dono> list();
	
}
