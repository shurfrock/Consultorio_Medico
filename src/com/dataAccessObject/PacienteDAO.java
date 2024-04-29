package com.dataAccessObject;
import java.sql.SQLException;
import java.util.List;
import com.componentes.Paciente;

public interface PacienteDAO extends DataAccessObject <Paciente>{
	public List<Paciente> buscarPaciente(String nombre) throws SQLException;
}
