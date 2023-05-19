package com.indracompany.treinamento.model.dto;

import java.time.LocalDateTime;

import com.indracompany.treinamento.model.entity.Cliente;
import com.indracompany.treinamento.model.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioInsertDTO {

	private String nome;
	private Long idCliente;
}
