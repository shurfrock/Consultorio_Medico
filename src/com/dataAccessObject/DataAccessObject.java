package com.dataAccessObject;
import java.sql.SQLException;
import java.util.List;

public interface DataAccessObject <T>{
	public int insertar(T t) throws SQLException;
	public int eliminar(T t) throws SQLException;
	public int actualizar(T t) throws SQLException;
	public T consultar(String criterio) throws SQLException;
	public List<T> consultarTodo() throws SQLException;
}
