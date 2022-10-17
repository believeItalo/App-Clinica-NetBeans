package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

	public static void main(String[] args) {
            
            String[] linha0 = {"Cotia","itapevi","Jandira"};
            String[] linha1 = {"Osasco","Carapicuíba","Itapevi"};
            String[] linha2 = {"Itu","itapevi","Santana de Parnaíba"};
            String[] linha3 = {"Presidente Prudente","São Roque","São Paulo"};
            
            String [][] linhas = {linha0,linha1,linha2, linha3};
            
            System.out.println(linhas[2][2]);
            
            
            String [][][] frutas = {
                {   
                {"Banana", "Maça" },
                {"Pera", "Melancia"}},
                    
                {{"Banana", "Maça" },
                {"Pera", "Melanciaxxx"}}
                
               
                
                
            };
            
            System.out.println(frutas[0][1][1]);
            System.out.println(frutas[1][1][1]);
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
		dao.gravar(plano3);
		dao.gravar(plano4);
		dao.gravar(plano5);
                
		for(PlanoDeSaude p : PlanoDeSaudeDAO.listar()) {
			
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Operadora: " + p.getOperadora());
			
			
		}
                
                
                PlanoDeSaudeDAO.excluir(101);
                System.out.println("Apos Exclusão");
                for(PlanoDeSaude p : PlanoDeSaudeDAO.listar()) {
			System.out.println("Código: " + p.getCodigo());
			System.out.println("Operadora: " + p.getOperadora());
		}
                
                
                //testar o metodo getPlanoDesaude Dao
                
                PlanoDeSaude p = PlanoDeSaudeDAO.getPlanoDeSaude(104);
                System.out.println("Código: " + p.getCodigo());
		System.out.println("Operadora: " + p.getOperadora());
                System.out.println("Tipo Do Plano: " + p.gettipoDoPlano());
		//exemplo claro de uma classe estática, se observarmos o "for" estamos apenas invocando a primeira lista que fizemos utilizando o objeto DAO.
		//porém, as classes do objeto tem as váraveis(os planos) no mesmo lugar, sendo assim eles compartilham o mesmo local de armazenamentos 
		
		
		
		
		
		
}}
