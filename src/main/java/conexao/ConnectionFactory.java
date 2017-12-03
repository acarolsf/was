package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {
	//metodo que estabelece a conexao entre a base de dados e o software
	public Connection getConnection(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_was", "root", "admin");
			}catch(SQLException e) {
				System.out.println("Erro de Conexão" + e);
				
			}catch (ClassNotFoundException e) {
				System.out.println("Classe nao encontrada" + e);
			}
			return null;
	}
}