package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDaoXpto {

	public static void main(String[] args) {
		//chamando o método main de outra classe
		
		TesteDao.main(args);
		
		System.out.println(PlanoDeSaudeDAO.listar().size());

	}

}
