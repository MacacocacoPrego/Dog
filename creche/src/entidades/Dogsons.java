package entidades;

public class Dogsons {
	int idDog;
	String raça;
	boolean sexo;
	int idade;
	Dono Dono;
	public Dono getDono() {
		return Dono;
	}
	public void setDono(Dono dono) {
		Dono = dono;
	}
	public int getIdDog() {
		return idDog;
	}
	public void setIdDog(int idDog) {
		this.idDog = idDog;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
