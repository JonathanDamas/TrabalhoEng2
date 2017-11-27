package br.edu.univas.si4.BD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AluguelDAO {

public void insertNewAluguel(AluguelTO to) throws AluguelException {
		
		String sentenca = "INSERT INTO ALUGUEL " + " (NOME, CPF, DATAALUGUEL, MODELO, PLACA)" + " VALUES(?, ?, ?, ?, ?)";
		
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getNome());
			prepStat.setInt(2, to.getCpf());
			prepStat.setString(3, to.getData());
			prepStat.setString(4, to.getModelo());
			prepStat.setString(5, to.getPlaca());
			
			prepStat.execute();
		} catch (Exception e) {
			throw new AluguelException("Erro salvando Aluguel" + to.getNome(),e);
		  } finally {
			DBUtil.closeConnection(conn);
		   	}
	}	
	
}
