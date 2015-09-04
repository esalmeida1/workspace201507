package br.fatec.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsavel {
	@Id
	String cnpj;
	String telefone;
	String responsavel;
	String telefoneResponsavel;
	String setor;
	String email;
}
