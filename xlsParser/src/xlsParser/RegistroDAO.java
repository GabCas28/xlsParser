package xlsParser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class RegistroDAO implements IRegistroDAO{

	private static final String URL="jdbc:mysql://localhost:3306/empresa3";
	private Connection conexion;
	@Override
	public void conectar(String login, String pass) throws DAOException {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");

			conexion=DriverManager.getConnection(URL, login, pass);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void grabar(Registro r) throws DAOException {
		PreparedStatement ps = null;
		String sql;

		//Crear la SQL
		sql = "insert into categorias () values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			ps = conexion.prepareStatement(sql);
			
			ps.setString(1,r.getId());
			ps.setString(2,r.getLeft());
			ps.setString(3,r.getState());
			ps.setString(3,r.getSeverity());
			ps.setString(4,r.getPriority());
			ps.setString(5,r.getCategory());
			ps.setString(6,r.getNodehits_dnsname());
			ps.setString(7,r.getControl_external_id());
			ps.setString(8,r.getSistema());
			ps.setString(9,r.getAplicacion());
			ps.setString(10,r.getFec_crea().toString());
			ps.setString(11,r.getAsignado().toString());
			ps.setString(12,r.getU_asignado());
			ps.setString(13,r.getG_asignado());
			ps.setString(14,r.getResuelto().toString());
			ps.setString(15,r.getU_resuelto());
			ps.setString(16,r.getG_resuelto());
			ps.setString(17,r.getState());
			ps.setString(18,r.getCerrado().toString());
			ps.setString(19,r.getU_cerrado());
			ps.setString(20,r.getG_cerrado());
			ps.setString(21,String.valueOf(r.getDuplicate_count()));
			ps.setString(22,r.getReplace());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DAOException(e.getMessage());
		}		
		
	}

	@Override
	public void actualizar(Registro r) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String idRegistro) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Registro leer(String idRegistro) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registro> leerTodos() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cerrar() throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
