package br.newton.poo.dao;
import java.util.*;

public interface Dao<T>{

	Optional<T>getId(long id);
	
	List<T> getAll();
	
	void save(T t);
	
	void update(T t);
	
	void delete(T t);
	
}
