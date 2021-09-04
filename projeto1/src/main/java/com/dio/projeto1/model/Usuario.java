package com.dio.projeto1.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id;
	@ManyToOne
	@JsonProperty
	private CategoriaUsuario categoriaUsuario;
	@JsonProperty
	private String nome;
	@ManyToOne
	@JsonProperty
	private Empresa empresa;
	@ManyToOne
	@JsonProperty
	private NivelAcesso nivelAcesso;
	@ManyToOne
	@JsonProperty
	private JornadaTrabalho jonadaTrabalho;
	@JsonProperty
	private BigDecimal tolerancia;
	@JsonProperty
	private LocalDateTime inicioJornada;
	@JsonProperty
	private LocalDateTime finalJornada;
}
