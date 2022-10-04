package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agenda {
	private LocalDate data;
	private LocalTime hora;
	private Paciente paciente;
	private Medico medico;
	private String observação;
	
	public String getObservação() {
		return observação;
	}
	public void setObservação(String observação) {
		this.observação = observação;
	}
	private Especialidade especialidade;
	private boolean comparecimento;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalTime getHora() {
		return hora;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isComparecimento() {
		return comparecimento;
	}
	public void setComparecimento(boolean comparecimento) {
		this.comparecimento = comparecimento;
	}
	

	
}
