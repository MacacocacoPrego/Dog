package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dados.Conexao;
import entidades.Dogsons;

public class DDogsons implements INDDogsons {
	
	public int salvar(Dogsons d) {
		int retorno = 0;
        try {
            Connection con = Conexao.getConnection();

            if(d.getId() == 0) {
                //Cria o preparedStatement
                String sql = "INSERT INTO DOGSONS (ID, ID_DONO, RACA, SEXO, IDADE, NOME, PESO, CASTRADO) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = con.prepareStatement(sql);

                //Preenche os valores
                statement.setInt(1, d.getIdDono());
                statement.setString(2, d.getRaca());
                statement.setBoolean(3, d.isSexo());
                statement.setInt(4, d.getIdade());
                statement.setString(5, d.getNome());
                statement.setString(6, d.getPeso());
                statement.setBoolean(7, d.isCastrado());

                //Executa
                statement.execute();
                ResultSet rs = statement.getGeneratedKeys();
                if(rs.next()) {
                    retorno = rs.getInt(1);
                }

                statement.close();
            } else {
                // Cria o preparedStatement
                String sql = "UPDATE USUARIO SET ID_DONO = ?, RACA = ?, SEXO = ?, IDADE = ?, NOME = ?, PESO = ?, CASTRADO = ? WHERE ID = ?";
                PreparedStatement statement = con.prepareStatement(sql);

                // Preenche os valores
                statement.setInt(1, d.getIdDono());
                statement.setString(2, d.getRaca());
                statement.setBoolean(3, d.isSexo());
                statement.setInt(4, d.getIdade());
                statement.setString(5, d.getNome());
                statement.setString(6, d.getPeso());
                statement.setBoolean(7, d.isCastrado());
                statement.setInt(8, d.getId());

                // Executa
                statement.execute(); // Executa a Consulta
                retorno = d.getId(); // Retorna o id do Objeto
                statement.close();
            }
            con.close(); // Fecha a conexão
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno; 
	}
	
	public void deletar(int id) {
		try {
            Connection con = Conexao.getConnection();

            // Cria um preparedStatement
            String sql = "DELETE FROM DOGSONS WHERE ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            // Preenche os valores
            statement.setInt(1, id);

            // Executa
            statement.execute();

            statement.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public Dogsons get(int id) {
		Dogsons retorno = null;
        try {
            Connection con = Conexao.getConnection();

            // Cria o preparedStatement
            String sql = "SELECT * FROM DOGSONS WHERE ID = (?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Preenche os valores
            statement.setInt(1, id);

            // Executa
            ResultSet r = statement.executeQuery();

            r.next();
            retorno = lerDogson(r);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
	}
	
	public List<Dogsons> list() {
		ArrayList<Dogsons> retorno = new ArrayList<Dogsons>();
        try {
            Connection con = Conexao.getConnection();

            // Cria o preparedStatement
            String sql = "SELECT * FROM DOGSONS";
            PreparedStatement statement = con.prepareStatement(sql);

            // Executa
            ResultSet r = statement.executeQuery();

            while (r.next()) {
                retorno.add(lerDogson(r));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
	}
	
	
	public List<Dogsons> listByDono(int id) {
		ArrayList<Dogsons> retorno = new ArrayList<Dogsons>();
        try {
            Connection con = Conexao.getConnection();

            // Cria o preparedStatement
            String sql = "SELECT * FROM DOGSONS WHERE ID_DONO = (?)";
            PreparedStatement statement = con.prepareStatement(sql);
            
            // Preenche o valor
            statement.setInt(1, id);

            // Executa
            ResultSet r = statement.executeQuery();

            while (r.next()) {
                retorno.add(lerDogson(r));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
	}
	
	private Dogsons lerDogson(ResultSet r) throws SQLException {
		Dogsons d = new Dogsons();
		d.setId(r.getInt("id"));
		d.setIdDono(r.getInt("id_dono"));
		d.setRaca(r.getString("raca"));
		d.setPeso(r.getString("peso"));
		d.setCastrado(r.getBoolean("castrado"));
		d.setSexo(r.getBoolean("sexo"));
		d.setIdade(r.getInt("idade"));
		d.setNome(r.getString("nome"));
		return d;
	}
	

}
