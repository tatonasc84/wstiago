package br.com.itau.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Usuario;

/*
 * e um pattern que sugestiona onde devem ficar os comandos SQL DML
 * Deve armazenar o CRUD => (Create - Read - Update - Delete)
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
/*
 * Crudrepository sera a clasee paiu do UsuarioDAO e esta informando ao 
 * Spring que esta classe armazenara o CRUD para usuario. O Integer é para especificar
 * 	que o tipo de dados da chave primaria é Integer.
 */
	
	/*
	 * metodos herdados do CRudRepository:
	 * - save(objeto): grava / altera uma linha no banco de dados
	 * - findById(int): pesquisa um usuario pelo codigo
	 * - findAll(): retorna todos os usuarios
	 * - delteByID(int): apaga um usuario pelo codigo
	 * - deleteAll(): apaga tudo
	 * - count(): retorna qtos usuarios existem
	 */

}
