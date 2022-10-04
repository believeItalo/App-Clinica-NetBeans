package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {
	private String Nome;	
	private LocalDate dataDeNascimento;
	private Especialidade[] especialidades;
	private String sexo;
	private String crm;
	
	//Métodos de acesso

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public Especialidade[] getEspecialidade() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}

	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
