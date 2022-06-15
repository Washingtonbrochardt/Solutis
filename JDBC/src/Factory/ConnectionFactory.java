package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//Para simplificar e encapsular a cria��o da conex�o, devemos usar uma classe ConnectionFactory
//A classe ConnectionFactory segue o padr�o de cria��o Factory Method
//O Factory Method encapsula a cria��o de um objeto


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");
	
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
	}
	
	

	public Connection recuperarConexao() throws SQLException{
		return this.dataSource.getConnection();
	}

}
