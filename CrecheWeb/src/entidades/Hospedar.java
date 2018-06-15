package entidades;

import java.util.Date;

public class Hospedar {
	
	int id;
	int idDono;
	int idCachorro;
	Date inicial;
	Date saida;
	float valor;
	
	public Hospedar() {
		
	}
	
	public Hospedar(int idDono, int idCachorro, float valor) {
		this.idDono = idDono;
		this.idCachorro = idCachorro;
		this.valor = valor;
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
	
	public int getIdCachorro() {
		return idCachorro;
	}
	
	public void setIdCachorro(int idCachorro) {
		this.idCachorro = idCachorro;
	}
	
	public Date getInicial() {
		return inicial;
	}
	
	public void setInicial(Date inicial) {
		this.inicial = inicial;
	}
	
	public Date getSaida() {
		return saida;
	}
	
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	

}
