package br.senai.sp.jandira.testes;

import java.util.ArrayList;
import java.util.Iterator;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		// testando vetores
		//vetor com 3 planos de saúde
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Unimed", "bronze");
		PlanoDeSaude plano2 = new PlanoDeSaude("Amil", "basic");
		PlanoDeSaude plano3 = new PlanoDeSaude("Notredame", "Advanced");
		PlanoDeSaude plano4 = new PlanoDeSaude("Bradesco", "Intermediário");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		int i =0; //começamos do índice 0 da array
		
		 while (i < planos.size()) {
			System.out.println(planos.get(i).getDadosDoPlano());
			i++;
		}
		 System.out.println("Acabou o loop");
		// enquanto o índice(i) for menor que o tamnho da array (4) entraremos no loop e "printaremos os dados"
		 //i++ seria a soma de "1" ao índice em cada rodada do loop
		 
		 //utilizando o looping for (for(contador;condição;acumulador ))
		 
		 for(int contador =0; contador < planos.size(); contador++) {
		 System.out.println(planos.get(contador).getDadosDoPlano());
		 }
	
		 System.out.println("----------------------");
		// iteração de objetos dentro de uma arraylist preferimos utilizar um for each:

		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getDadosDoPlano());
			
		}
		
		//usando for com array List
		
		
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologista");
		e1.setDescricao("Cuida do coração");
		Especialidade e2 = new Especialidade();
		e2.setNome("Ortopedista");
		e2.setDescricao("Cuida dos ossos");
		Especialidade e3 = new Especialidade();
		e3.setNome("Clínico Geral");
		e3.setDescricao("Consulta em termos gerais ");
		
		
		
	ArrayList<Especialidade> especialidades = new ArrayList<>();
	 especialidades.add(e1);
	 especialidades.add(e2);
	 especialidades.add(e3);
	 
	 
	 
	 
	for(Especialidade e : especialidades) {
		
		System.out.println(e.getNome() + " ===> " + e.getDescricao() );
	}
	
	Endereco endereco1 = new Endereco();
	endereco1.setCidade("Osasco");
	endereco1.setBairro("Jd Bonança");
	Endereco endereco2 = new Endereco();
	endereco2.setCidade("Jandira");
	endereco2.setBairro("Centro");
	
	ArrayList<Endereco> en = new ArrayList();
	
	en.add(endereco1);
	en.add(endereco2);
	
	for( Endereco endereco : en) {
		
		System.out.println(endereco.getCidade() + " ==> " + endereco.getBairro());
	}
	
	
	
	}
	



}
		
		
		
		
		
		
		
		
		

//	PlanoDeSaude[] planos = {plano1, 
//			new PlanoDeSaude("Porto Seguro"),
//			new PlanoDeSaude("Unimed", "básico")};
//	
//	System.out.println(planos[0].getOperadora());
//	System.out.println(planos[1].getOperadora());
//	System.out.println(planos[2].getDadosDoPlano());
//	//
//	ArrayList<String> cidades = new ArrayList<>();
//	cidades.add("Barueri");
//	cidades.add("Osasco"); 
//	cidades.add("Jandira");
//	cidades.add("Carapicuíba");
//	cidades.add("Cotia");
//	cidades.add("São Roque");
//	cidades.add("Itapevi");
//	
//	System.out.println(cidades.get(0));
//	System.out.println(cidades.size());
//	System.out.println(cidades.isEmpty());
//	System.out.println(cidades.remove(2));
//	///
//	ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//	
//	planos2.add(new PlanoDeSaude("Unimed"));
//	planos2.add(new PlanoDeSaude("amil") );
//	planos2.add(new PlanoDeSaude("Notredame"));		
//	planos2.add(new PlanoDeSaude("Ameplan"));		
//	
//	PlanoDeSaude planonovo = new PlanoDeSaude();
//	planonovo.setOperadora("Bradesco");
//	planonovo.setTipoDoPlano("Brabo");
//	planos2.add(planonovo);
//	
//	System.out.println(planos2.get(4).getDadosDoPlano());
//			
//	System.out.println(planos2.get(2).getOperadora());
//	
//	Integer nota2 = new Integer(5); // palavras taxadas (integer) são termos que se tornaram inútil, se tornaram descontinuadas
//	//preferimos usar os valores primitivos(int,double,float,char etc...) com letras maiúsculas, dessa forma se tornam objetos.
//	
//
//	PlanoDeSaude planoAmil = new PlanoDeSaude("Amil", "Básico");
//	PlanoDeSaude planoAllianz = new PlanoDeSaude("Allianz", "Bronze");
//	
//	PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//	dao.gravar(planoAllianz);
//	dao.gravar(planoAmil);
//	System.out.println(dao.listarTodos());

	


