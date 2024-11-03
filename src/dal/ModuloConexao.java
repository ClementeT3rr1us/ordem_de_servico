package dal;

import java.sql.*;

public class ModuloConexao {

    // Métode responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informaações referentes ao banco
        String url = "jdbc:mysql://192.168.43.1:3306/blueart";
        String user = "root";
        String password = "root";
        // Estabelcendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A alinha abaixo serve de apoio para estabelecer o erro
            //System.out.println(e);
            return null;
        }

    }
}
