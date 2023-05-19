package com.indracompany.treinamento.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indracompany.treinamento.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAll(); // equivale a "select * from usuario;"
	
	@Query(value = "select u from Usuario u where u.id = :id")
	//@Query(value = "select Usuario u where u.id = ?1")
	public Usuario getUsuario(Long id); // equivale a "select * from usuario u where u.id = <valor-parametro>
	
	
//	@Query(nativeQuery = true, value = "select id from usuario where id in (:idUsuarios);")
	@Query(nativeQuery = true, value = "select id from usuario where id in (?1);")
	public List<Usuario> getTodosNaLista(List<Long> idUsuarios);

}
