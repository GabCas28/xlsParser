package xlsParser;

import java.util.List;

public interface IRegistroDAO {
	public void conectar(String login, String pass) throws DAOException; 
	public void grabar(Registro r) throws DAOException; 
	public void actualizar(Registro r) throws DAOException; 
	public void borrar(String idRegistro) throws DAOException; 
	public Registro leer(String idRegistro) throws DAOException; 
	public List<Registro> leerTodos() throws DAOException;
	public void cerrar() throws DAOException; 
}
