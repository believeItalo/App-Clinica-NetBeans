package br.senai.sp.jandira.model;

import java.util.Set;

public class Paciente {

	private String nome;
	private String email;
	private String rg;
	private String cpf;
	private String telefone;
	private Genero genero;
	private String tiposanguineo;
	private Endereco endereco;

	private PlanoDeSaude planoDeSaude; // aqui utilizamos uma classe ja construída para um novo atributo de um novo objeto.

	// Métodos de acesso...

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero sexo) {
		this.genero = genero;
	}

	public String getTiposanguineo() {
		return tiposanguineo;
	}

	public void setTiposanguineo(String tiposanguineo) {
		this.tiposanguineo = tiposanguineo;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
	

