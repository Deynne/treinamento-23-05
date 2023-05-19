package com.indracompany.treinamento.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.indracompany.treinamento.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	public List <Usuario> findAll(); // equivale ao "select * from usuario;"
	
	@Query(value = "select from Usuario u where u.id = :id") // ou
	//@Query(value = "select Usuario u where u.id = ?1")
	// equivale a "select * from usuario u where u.id = <valo-parametro>"
	public Usuario getUsuario(Long id);
	
	@Query(nativeQuery = true, value = "select id from Usuario where id in (:idUsuarios);") // ou
	//@Query(nativeQuery = true, value = "select id from Usuario;")
	public List<Usuario> getTodosNaLista(List<Long> idUsuarios);
	
	
}
