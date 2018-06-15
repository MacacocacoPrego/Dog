package negocios;

import java.util.List;

import dados.DDogsons;
import entidades.Dogsons;

public class NEDogsons implements INEDogson {
	
	private DDogsons repositorio;
	
	public NEDogsons() {
		repositorio = new DDogsons();
	}
	
	public DDogsons getRepositorio() {
		return repositorio;
	}
	
	public void setRepositorio(DDogsons rep) {
		this.repositorio = rep;
	}
	
	@Override
	public int salvar(Dogsons d) {
		if(d.getId()!= 0 && repositorio.get(d.getId()) == null) {
            throw new RuntimeException("Tentativa de atualizar um Dogson não existente");
        }
		if(d.getIdDono() == 0) {
			throw new RuntimeException("ID do dono incorreto");
		}
		
		int id = repositorio.salvar(d);
		return id;
	}
	
	@Override
	public void deletar(int id) {
		repositorio.deletar(id);
	}
	
	@Override
	public Dogsons get(int id) { 
		return repositorio.get(id);
	}
	
	@Override
	public List<Dogsons> list(){
		return repositorio.list();
	}
	
	@Override
	public List<Dogsons> listByDono(int id){
		return repositorio.listByDono(id);
	}
}
