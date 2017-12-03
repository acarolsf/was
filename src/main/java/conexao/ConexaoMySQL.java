package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
     public static String status = "N�o conectou...";
     
     public ConexaoMySQL(){
         
     }
     
     public static java.sql.Connection getConexaoMySQL() {
 
        Connection connection = null;
        try{
            String driverName = "com.mysql.jdbc.Driver";                        
 
            Class.forName(driverName);
            
            String serverName = "localhost";    //caminho do servidor do BD
 
            String mydatabase = "db_was";        //nome do seu banco de dados
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
 
            String username = "root";        //nome de um usu�rio de seu BD      
 
            String password = "admin";      //sua senha de acesso
 
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
 
                status = ("STATUS--->Conectado com sucesso!");
                System.out.println("Conexao aberta!\n");
 
            } else {
 
                status = ("STATUS--->N�o foi possivel realizar conex�o");
 
            }
            
                
            return connection;
            
        }catch (ClassNotFoundException e) {  //Driver n�o encontrado
 
  
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 
//N�o conseguindo se conectar ao banco
 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
 
  
 
    }
 
  
 
    //M�todo que retorna o status da sua conex�o//
 
    public static String statusConection() {
 
        return status;
 
    }
 
   
 
   //M�todo que fecha sua conex�o//
 
    public static boolean FecharConexao() {
 
        try {
 
            ConexaoMySQL.getConexaoMySQL().close();
 
            return true;
 
        } catch (SQLException e) {
 
            return false;
 
        }
 
  
 
    }
 
   
 
   //M�todo que reinicia sua conex�o//
 
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
 
  
 
        return ConexaoMySQL.getConexaoMySQL();
 
    }
 
}
