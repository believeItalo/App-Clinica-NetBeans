package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO {
	
	//dao = camada de dados 
        // dao é uma classe como todas as outras, definimos atributos, métodos, construtores etc...
	
	private PlanoDeSaude planoDeSaude;
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>(); // está simulando o banco de dados, usamos static para a array comartilhar a mesma lista de Planos
	
	
	public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
		this.planos.add(planoDeSaude);
	}
	public PlanoDeSaudeDAO() {
		// TODO Auto-generated constructor stub
	} 
		
	
	
	public static void gravar(PlanoDeSaude planoDeSaude) {
		
		planos.add(planoDeSaude);
		
	}
	public static ArrayList<PlanoDeSaude> listar(){
		return planos;
	}

}
