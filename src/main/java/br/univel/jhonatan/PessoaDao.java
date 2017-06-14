package br.univel.jhonatan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao {
	private Connection con;
	private static final String delete_from = "DELETE FROM pessoa";
	private static final String delete_from_id = "DELETE FROM pessoa WHERE ID = ?";
	private static final String select_from = "SELECT * FROM pessoa";
	private static final String insert_into = "INSERT INTO pessoa(id,idade,nome,telefone)"
			+ "VALUES (?,?,?,?)";
	
	public List<Pessoa> buscarTodos() {
		
		con = Conexao.newInstance().getConecao();
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		try {
			PreparedStatement ps = con.prepareStatement(select_from);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getInt(1));
				p.setIdade(rs.getInt(2));
				p.setNome(rs.getString(3));
				p.setTelefone(rs.getString(4));
				lista.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public void salvar(Pessoa p) {
		con = Conexao.newInstance().getConecao();
		
		try {
			PreparedStatement ps = con.prepareStatement(insert_into);
			
			int id = p.getId();
			int idade = p.getIdade();
			String nome = p.getNome();
			String telefone = p.getTelefone();
			
			ps.setInt(1,  id);
			ps.setInt(2, idade);
			ps.setString(3, nome);
			ps.setString(4, telefone);
			
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluirItem(int intId) {
		con = Conexao.newInstance().getConecao();
		try {
			PreparedStatement ps = con.prepareStatement(delete_from_id);
			ps.setInt(1, intId);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluirTodos() {
		con = Conexao.newInstance().getConecao();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(delete_from);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void speed() {
		con = Conexao.newInstance().getConecao();
		
		try {
			PreparedStatement ps = con.prepareStatement(insert_into);
			
			Pessoa p = new Pessoa();
			for (int i = 1; i <= 12; i++)
			{
				p.setId(i);
				p.setIdade(i*4);
				p.setNome("Nome_"+i);
				p.setTelefone("(55)9 9956-1832");
				
				ps.setInt(1, p.getId());
				ps.setInt(2, p.getIdade());
				ps.setString(3, p.getNome());
				ps.setString(4, p.getTelefone());
				
				ps.execute();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
