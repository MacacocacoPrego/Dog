package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.Dono;

public class DonoDao {

	public void criarDono(String name) {
		try{
		Connection con = connectionFactory.getConnection(); 
		
		String sql = "insert into Dono	(nome) values (?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setString(1, name);
		stmt.execute();
		stmt.close();
		con.close();	
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removerDono(int cpf) {
			try{
			Connection con = connectionFactory.getConnection(); 
			
			String sql = "delete from Dono	where cpf = (?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt (1, cpf);
			stmt.execute();
			stmt.close();
			con.close();	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		

	}

	public void AtualizarDono(Dono a) {
		try{
			Connection con = connectionFactory.getConnection(); 
			
			String sql = "update dono set " + 
			"name = ?,cpf =? 
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt (1, cpf);
			stmt.execute();
			stmt.close();
			con.close();	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

	public Dono getDono(int cpf) {

	}

	public Arraylist <Dono> getlist(){
		
	}

	private Dono LerAluno(ResultSet r ) throw SQLException{
		
	}
}