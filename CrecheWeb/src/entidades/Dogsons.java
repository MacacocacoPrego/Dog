package entidades;

public class Dogsons {
	
	int id;
	int idDono;
	String raca;
	float peso;
	boolean castrado;
	boolean sexo;
	int idade;
	String nome;
	String nomeDono;
	
	public Dogsons() {
		
	}
	
	public Dogsons(int idDono, String raca, boolean sexo, int idade, String nome, float peso, boolean castrado) {
		this.idDono = idDono;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
		this.castrado = castrado;
	}
	
	public Dogsons(int id, int idDono, String raca, boolean sexo, int idade, String nome, float peso, boolean castrado) {
		this(idDono, raca, sexo, idade, nome, peso, castrado);
		this.id = id;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdDono() {
		return idDono;
	}
	public void setIdDono(int idDono) {
		this.idDono = idDono;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	
	

}
