package entidades;

public class Dono {
	
	int id;
	String cpf;
	String nome;
	int idade;
	String telefone;
	
	public Dono() {
		
	}
	
	public Dono(String cpf, String nome, int idade, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String numeroCel) {
		this.telefone = numeroCel;
	}
	
}
