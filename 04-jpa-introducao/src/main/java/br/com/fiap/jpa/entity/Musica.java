package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TB_MUSICA")
		//name-> nome no Java (@GeneratedValue), sequenceName -> nome no banco, incremento 
@SequenceGenerator(name="musica", sequenceName = "SQ_TB_MUSICA", allocationSize = 1)
public class Musica {

	@Id //Define que o atributo é PK
	@Column(name="cd_musica")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musica")
	private Integer codigo;
	
	@Column(name="nm_musica", length = 50, nullable = false, unique = true) //nullable -> pode ser nulo?
	private String nome;
	
	@Column(name="dt_lancamento", nullable = false)
	private Calendar dataLancamento;
	
	@Column(name="vl_duracao")
	private Float duracao;
	
	@Column(name="nm_album", nullable = false, length = 40)
	private String album;
	
	@Column(name="st_instrumental")
	private Boolean instrumental;
	
	@Column(name="dt_cadastro", updatable = false) //updatable -> será atualizado?
	private LocalDate dataCadastro;
	
	@Column(name="vl_faturamento", precision = 11, scale = 2)
	private BigDecimal faturamento;
	
	@Transient //Idade não será um campo na tabela
	private Integer idade;
	
}