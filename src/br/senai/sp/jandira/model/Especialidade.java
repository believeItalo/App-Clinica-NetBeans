package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	private static Integer contador = 100;
        private Integer codigo;
        private String nome;
        private String descricao;

        // Construtores da classe
        public Especialidade(String nome) {
            this.nome = nome;
            this.codigo = contador++;
        }

        public Especialidade(String nome, String descricao) {
            this.nome = nome;
            this.descricao = descricao;
            this.codigo = contador++;
        }

        public Especialidade() {
            this.codigo = contador++;
        }

        // Métodos de acesso aos atributos
        public void setNome(String nome) {

            if (nome.length() >= 3) {
                this.nome = nome;
            } else {
                JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\nDeve conter pelo menos 3 letras!");
            }

        }

        public String getNome() {
            return nome;
        }

        public void setDescricao(String descricao) {
            if (descricao.length() >= 10) {
                this.descricao = descricao;
            } else {
                JOptionPane.showMessageDialog(null, "A descrição deve conter pelo menos 10 caracteres!");
            }
        }

        public String getDescricao() {
            return this.descricao;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }




}
