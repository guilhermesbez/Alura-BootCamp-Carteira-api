package br.com.alura.carteira.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto {
	
	@NotBlank
	@Size(min = 1, max = 140)
	private String nome;
	@NotBlank
	@Size(min = 1, max = 140)
	private String login;

}
