package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

	public static void main(String[] args) {
		PlanoDeSaude plano1 = new PlanoDeSaude("Unimed", "bronze");
		PlanoDeSaude plano2 = new PlanoDeSaude("Amil", "basic");
		PlanoDeSaude plano3 = new PlanoDeSaude("Notredame", "Advanced");
		PlanoDeSaude plano4 = new PlanoDeSaude("Bradesco", "Intermediário");
		PlanoDeSaude plano5 = new PlanoDeSaude();
		System.out.println(PlanoDeSaude.getContador());
		System.out.println(plano1.getCodigo());
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		
		//a função gravar esta simulando o envio de dados a um banco de dados, no nosso caso o DAO
		dao.gravar(plano1);
		dao.gravar(plano2);

		for(PlanoDeSaude p : PlanoDeSaudeDAO.listar()) {
			
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Operadora: " + p.getOperadora());
			
			
		}
		//exemplo claro de uma classe estática, se observarmos o "for" estamos apenas invocando a primeira lista que fizemos utilizando o objeto DAO.
		//porém, as classes do objeto tem as váraveis(os planos) no mesmo lugar, sendo assim eles compartilham o mesmo local de armazenamentos 
		
		
		
		
		
		
}}
