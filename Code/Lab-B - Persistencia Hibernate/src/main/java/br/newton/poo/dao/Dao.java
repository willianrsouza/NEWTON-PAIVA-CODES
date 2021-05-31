package br.newton.poo.dao;

import java.util.*;

public interface Dao<T> {

	<T> void buscarPorId(Class<T> entityClass, Integer id);

	<T> List<T> Listar(Class<T> entityClass);

	void persisirDadosDb(T t);

	void atualizarDadosDb(T objetoGenerico);

	void delete(T  objetoGenerico);

}
