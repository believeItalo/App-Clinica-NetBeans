package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	
	private static int contador = 100;
	private  Integer codigo;
	private String operadora; // = atributos, estao definindo os comportamentos do objeto 
	private String tipoDoPlano;
	
	//construtor da classe = sempre será publico, não tem retorno, e sempre é o nome da classe, no caso"Plano de saúde"
	//construtor que n precisa nada = construtor default
	
	public PlanoDeSaude(String operadora,Integer codigo) {
		this.operadora = operadora;
		
		atualizarCodigo();
	}
	public PlanoDeSaude() {
		atualizarCodigo();
	}
	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoPlano = tipoDoPlano;
		
		atualizarCodigo();
		// ta copiando e colando código? ta fazendo cagada
	}
	
	// ao inves de copiar e colar o código para armazenar o atributo codigo a variavel contador, criamos um metodo e atribuimos esse metodo ao construtor
	// onome disso é : desacoplamento. diminuir o poder de cda função e fragmentar
	
	private void atualizarCodigo() {
		this.codigo = contador;
		contador++;
		
	}
	
	//Métodos de Acesso...
	
	public void setOperadora(String operadora) {
		
		this.operadora = operadora; // atribuimos o "mesmo" nome entre variaveis (String operadora) e o método (operadora).
	}								//para diferenciação usamos "this" ao nos referirmos ao atributo
	
	
	public String getOperadora() {
		
		return this.operadora;
		
		
	}
	//String tipoDoPlano
	public void setTipoDoPlano(String tipoDoPLano) {
		
		this.tipoDoPlano = tipoDoPLano;
		
		
	}
	
	public String gettipoDoPlano() {
		
		return this.tipoDoPlano;
		
	}
	
	public String getDadosDoPlano() {
	
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano;
		
		
	}
	
	// o método get contador esta com "static" pelo fato de ser nescessario compartilhhar com todos os objetos.
 public static int getContador() {
	return contador;
}
 public Integer getCodigo() {
	return codigo;
}


}
