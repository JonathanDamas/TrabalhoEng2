package br.edu.univas.si4.BD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {

public void insertNewCliente(ClienteTO to) throws ClienteException {
		
		String sentenca = "INSERT INTO CLIENTE " + " (NOME, ENDERECO, CPF, TELEFONE)" + " VALUES(?, ?, ?, ?)";
		
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getNome());
			prepStat.setString(2, to.getEnderešo());
			prepStat.setInt(3, to.getCpf());
			prepStat.setInt(4, to.getTelefone());
			
			prepStat.execute();
		} catch (Exception e) {
			throw new ClienteException("Erro salvando cliente" + to.getNome(),e);
		  } finally {
			DBUtil.closeConnection(conn);
		   	}
	}
}
