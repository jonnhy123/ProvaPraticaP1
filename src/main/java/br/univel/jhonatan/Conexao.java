package br.univel.jhonatan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection con;
	private static Conexao self;
	private String url = "jdbc:postgresql://localhost:5432/pessoa";
	private String pass = "univel";
	private String banco = "postgres";
	private String driver = "org.postgresql.Driver";
	
	public Conexao() {
		try {
			Class.forName(driver);
			this.con = DriverManager.getConnection(url,banco,pass);
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Conexao.this.con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}));
	}
	
	public static final synchronized Conexao newInstance(){
		if (self == null) {
			self = new Conexao();
		}
		return self;
	}
	
	public Connection getConecao(){
		return this.con;
	}
}
