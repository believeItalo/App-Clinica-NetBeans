package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

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

        public static void gravarPlanoDeSaudeTeste(){
            PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
            PlanoDeSaude p2 = new PlanoDeSaude("Amil", "Ouro");
            PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Premium");
            PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Prata");
         
            planos.add(p1);
            planos.add(p2);
            planos.add(p3);
            planos.add(p4);
            
          
        }
        
        //Método para criar a matriz que receberá os planso da saúde na tabela(Jtable)
        
        public static DefaultTableModel getTableModel(){
            int i = 0;
            Object[][] dados = new Object [planos.size()][3];            
            //for each para extrair os objetos do "banco de dados" 
            for(PlanoDeSaude p : planos  ){
                dados[i][0] = p.getCodigo();
                dados[i][1] = p.getOperadora();
                dados[i][2] = p.gettipoDoPlano();
                i++;
            }
            //definir um vetor com os TITULOS da tabela
            String[] titulos = {"Código", "Nome da Operadora", "Tipo Do Plano"};
        
            // Criar o modelo que será utilizado pela Jtable
            // para exibri
            DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
            return tableModel;
        }     

        
        
}

