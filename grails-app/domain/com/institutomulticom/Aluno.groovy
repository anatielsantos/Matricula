package com.institutomulticom

class Aluno {
	String turma
	String matricula
	String nome
	String cpf
	String rg
	String orgao
	Date nascimento
	String estadoCivil
	String sexo
	String cor
	String logradouro
	String bairro
	String cep
	String estado
	String telefone
	String profissao
	String email
	String pai
	String mae
	String tituloEleitoral
	ArrayList<Nota> notas
	static hasMany = [notas:Nota]
    static constraints = {
    }
}
