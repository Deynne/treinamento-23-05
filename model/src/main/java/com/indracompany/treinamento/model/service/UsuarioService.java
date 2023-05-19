package com.indracompany.treinamento.model.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.treinamento.model.dto.UsuarioInsertDTO;
import com.indracompany.treinamento.model.dto.UsuarioUpdateDTO;
import com.indracompany.treinamento.model.entity.Cliente;
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
		
		Cliente c = null;
		if(dto.getIdCliente() != null) {
			Optional<Cliente> opCliente = repositorioCliente.findById(dto.getIdCliente());

			if(opCliente.isPresent()) {
				c = opCliente.get();
			}
		}
		
		Usuario u;
		u = new Usuario(null,dto.getNome(),LocalDateTime.now(), c);
		
		u = repositorio.save(u); // Salva no banco e adiciona o id na instância de usuário.
		
		return u;
	}
	
	public Usuario deletar(Long id) {
		Optional<Usuario> opU = repositorio.findById(id);
		
		Usuario u = null;
		
		if(opU.isPresent()) {
			u = opU.get();
			repositorio.delete(u);
		}
		
		return u;
			
	}
	
	public Usuario atualizar(UsuarioUpdateDTO dto) {
		Optional<Usuario> opU = repositorio.findById(dto.getId());
		
		Usuario u = null;
		
		if(opU.isPresent()) {
			u = opU.get();
			
			u.setNome(dto.getNome());
			if(dto.getIdCliente() != null ) {
				Optional<Cliente> opCliente = repositorioCliente.findById(dto.getIdCliente());
				
				Cliente c = null;
				
				if(opCliente.isPresent()) {
					c = opCliente.get();
					u.setCliente(c);
				}
			}
		}
		return u;
	}
	
	public Usuario getUsuario(Long id) {
		Usuario u = repositorio.getUsuario(id);
		
		return u;
	}
	
	// TODO implementar as funções
	public List<Usuario> getTodosUsuarios() {
		return null;
	}
	
	public List<Usuario> getTodosUsuariosNaLista(List<Long> idsUsuarios) {
		return null;
	}
}
