package com.indracompany.treinamento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.bp.LocalDateTime;

import com.indracompany.treinamento.model.dto.UsuarioInsertDTO;
import com.indracompany.treinamento.model.entity.Usuario;
import com.indracompany.treinamento.model.repository.ClienteRepository;
import com.indracompany.treinamento.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	
	@Autowired
	private ClienteRepository repositorioCliente;
	
	

	public Usuario salvar(UsuarioInsertDTO dto) {
		
		Optional<Cliente> c = repositorioCliente.findById(dto.getIdCliente());
		
		Usuario u;
		u = new Usuario(null, dto.getNome(), LocalDateTime.now(), c );
		u = repositorio.save(u);
	}
	public Usuario deletar(Long id) {
		Optional<Usuario> opU = repositorio.findById(id);
		
		Usuario u = null;
		
		if(opU.isPresent()) {
			u = opU.get();
			repositorio.delete(u);
		}
		;
	}
	
	public Usuario atualizar() {
		Optional<Usuario> opU = repositorio.findById(id);
		
		Usuario u = null;
		
		if(opU.isPresent()) {
			u = opU.get();
			repositorio.delete(u);
		}
		
	}

	public Usuario getUsuario(Long id) {
		return null;
	}
	
	public Usuario getTodosUsuarios() {
		return null;
	}

	public Usuario getTodosUsuariosNaLista(List<Long> idsUsuarios) {
		return null;
	}
}
