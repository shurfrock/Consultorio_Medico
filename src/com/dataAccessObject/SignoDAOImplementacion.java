package com.dataAccessObject;

import java.sql.SQLException;
import java.util.List;

import com.componentes.Signo;

public class SignoDAOImplementacion implements SignoDAO{
	
	public int insertar(Signo signo) throws SQLException{
		return 0;
	}
	public int eliminar(Signo signo) throws SQLException{
		return 0;
	}
	
	public int actualizar(Signo signo) throws SQLException{
		return 0;
	}
	
	public Signo consultar(String criterio) throws SQLException{
		return null;
	}
	
	public List<Signo> consultarTodo() throws SQLException{
		return null;
	}
}
