package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DAO.ProdutoDAO;

//Para cada tabela de domínio, temos uma classe de domínio
//Por exemplo, a tabela produtos tem uma classe Produto associada
//Objetos dessa classe representa um registro na tabela
//Para acessar a tabela, usaremos um padrão chamado Data Access Object (DAO)
//Para cada classe de domínio, existe um DAO. Por exemplo, a classe Produto possui um ProdutoDao
//Todos os métodos JDBC relacionados com o produto devem estar encapsulados no ProdutoDao

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Comoda", "Comoda vertical");

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.salvar(comoda);
			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}

		System.out.println(comoda);
	}

}
