package br.senai.sp.jandira.model;

public class Especialidade {

	private  String nome; // Atributos sempre privados, eles devem ser "encapsulados"
	private  String descricao; // a atribuição static define que os objetos compartilharao o msm atributo, eles são estáticos, todos apontam pra um única variável
	 
	
	// sem o static os atributos não são compartilhados

			// métodos de acesso getters e setters, métodos para acessar os atributos
			// métodos sao públicos
	
	
	public void setNome(String novoNome) {
		nome = novoNome;

	}			
	
	
	
	
	public String getNome(){
		
			return nome; 
					
					
					// nesse caso usamos  return porque o ato do get é retornar/pegar algo 
			

}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	}
