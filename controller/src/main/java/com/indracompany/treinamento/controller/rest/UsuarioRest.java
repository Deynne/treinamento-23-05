package com.indracompany.treinamento.controller.rest;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.treinamento.model.dto.UsuarioInsertDTO;
import com.indracompany.treinamento.model.entity.Usuario;
import com.indracompany.treinamento.model.service.UsuarioService;

@RestController
@RequestMapping("rest/usuario")
public class UsuarioRest {
	
	@Autowired
	private UsuarioService servico;
	
	// "/rest/usuario/salvar"
	@RequestMapping(method = {RequestMethod.POST}, value = "/salvar",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Usuario> salvar(@RequestBody(required = true) UsuarioInsertDTO dto) {
		return new ResponseEntity<>(servico.salvar(dto), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = {RequestMethod.DELETE}, value = "/deletar", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Usuario> deletar(@RequestParam(required = true) Long id) {
		return new ResponseEntity<>(servico.deletar(id), HttpStatus.OK);
	}
	
	//TODO implementar demais formatos

}
