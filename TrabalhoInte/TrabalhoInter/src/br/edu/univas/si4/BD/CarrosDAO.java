package br.edu.univas.si4.BD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CarrosDAO {
	
	public void insertNewCarros(CarrosTO to) throws CarrosException {
		
		String sentenca = "INSERT INTO CARROS " + " (FABRICANTE, MODELO, ANO, PLACA)" + " VALUES(?, ?, ?, ?)";
		
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getFabricante());
			prepStat.setString(2, to.getModelo());
			prepStat.setInt(3, to.getAno());
			prepStat.setString(4, to.getPlaca());
			
			prepStat.execute();
		} catch (Exception e) {
			throw new CarrosException("Erro salvando carros" + to.getFabricante(),e);
		  } finally {
			DBUtil.closeConnection(conn);
		   	}
	}

}
