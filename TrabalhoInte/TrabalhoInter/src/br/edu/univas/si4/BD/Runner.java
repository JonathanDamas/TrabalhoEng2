package br.edu.univas.si4.BD;

public class Runner {
	
	public static void main(String[] args) {

		AluguelDAO aluguelDAO = new AluguelDAO();
		AluguelTO to = new AluguelTO("Jonathan", 1195917961, "26/11/2016", "Hyundai","ABC1234");
		
		try {
			aluguelDAO.insertNewAluguel(to);
		} catch (AluguelException e) {
			System.out.println("Erro salvando cliente. ");
			e.printStackTrace();
		}
		System.out.println("Sucesso salvando cliente");
			
		}

}
