package xlsParser;

import java.sql.Timestamp;

public class Fila {
	String id, left, state, severity, priority, category, nodehits_dnsname, control_external_id, sistema, aplicacion,
			u_asignado, g_asignado, u_resuelto, g_resuelto, u_cerrado, g_cerrado, replace;
	Timestamp fec_crea, asignado, resuelto, cerrado;
	int duplicate_count;
	public Fila() {
	}
	public Fila(String id, String left, String state, String severity, String priority, String category,
			String nodehits_dnsname, String control_external_id, String sistema, String aplicacion, Timestamp fec_crea,
			Timestamp asignado, String u_asignado, String g_asignado, Timestamp resuelto, String u_resuelto,
			String g_resuelto, Timestamp cerrado, String u_cerrado, String g_cerrado, int duplicate_count,
			String replace) {
		super();
		this.id = id;
		this.left = left;
		this.state = state;
		this.severity = severity;
		this.priority = priority;
		this.category = category;
		this.nodehits_dnsname = nodehits_dnsname;
		this.control_external_id = control_external_id;
		this.sistema = sistema;
		this.aplicacion = aplicacion;
		this.fec_crea = fec_crea; // Creation Date
		this.asignado = asignado; // Assignment Date
		this.u_asignado = u_asignado;
		this.g_asignado = g_asignado;
		this.resuelto = resuelto; // Solving Date
		this.u_resuelto = u_resuelto;
		this.g_resuelto = g_resuelto;
		this.cerrado = cerrado; // Closing Date
		this.u_cerrado = u_cerrado;
		this.g_cerrado = g_cerrado;
		this.duplicate_count = duplicate_count;
		this.replace = replace;
	}

	public String getU_cerrado() {
		return u_cerrado;
	}

	public void setU_cerrado(String u_cerrado) {
		this.u_cerrado = u_cerrado;
	}

	public String getG_cerrado() {
		return g_cerrado;
	}

	public void setG_cerrado(String g_cerrado) {
		this.g_cerrado = g_cerrado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getNodehits_dnsname() {
		return nodehits_dnsname;
	}

	public void setNodehits_dnsname(String nodehits_dnsname) {
		this.nodehits_dnsname = nodehits_dnsname;
	}

	public String getControl_external_id() {
		return control_external_id;
	}

	public void setControl_external_id(String control_external_id) {
		this.control_external_id = control_external_id;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}

	public String getU_asignado() {
		return u_asignado;
	}

	public void setU_asignado(String u_asignado) {
		this.u_asignado = u_asignado;
	}

	public String getG_asignado() {
		return g_asignado;
	}

	public void setG_asignado(String g_asignado) {
		this.g_asignado = g_asignado;
	}

	public String getU_resuelto() {
		return u_resuelto;
	}

	public void setU_resuelto(String u_resuelto) {
		this.u_resuelto = u_resuelto;
	}

	public String getG_resuelto() {
		return g_resuelto;
	}

	public void setG_resuelto(String g_resuelto) {
		this.g_resuelto = g_resuelto;
	}

	public String getReplace() {
		return replace;
	}

	public void setReplace(String replace) {
		this.replace = replace;
	}

	public Timestamp getFec_crea() {
		return fec_crea;
	}

	public void setFec_crea(Timestamp fec_crea) {
		this.fec_crea = fec_crea;
	}

	public Timestamp getAsignado() {
		return asignado;
	}

	public void setAsignado(Timestamp asignado) {
		this.asignado = asignado;
	}

	public Timestamp getResuelto() {
		return resuelto;
	}

	public void setResuelto(Timestamp resuelto) {
		this.resuelto = resuelto;
	}

	public Timestamp getCerrado() {
		return cerrado;
	}

	public void setCerrado(Timestamp cerrad) {
		this.cerrado = cerrad;
	}

	public int getDuplicate_count() {
		return duplicate_count;
	}

	public void setDuplicate_count(int duplicate_count) {
		this.duplicate_count = duplicate_count;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", left=" + left + ", state=" + state + ", severity=" + severity + ", priority="
				+ priority + ", category=" + category + ", nodehits_dnsname=" + nodehits_dnsname
				+ ", control_external_id=" + control_external_id + ", sistema=" + sistema + ", aplicacion=" + aplicacion
				+ ", u_asignado=" + u_asignado + ", g_asignado=" + g_asignado + ", u_resuelto=" + u_resuelto
				+ ", g_resuelto=" + g_resuelto + ", u_cerrado=" + u_cerrado + ", g_cerrado=" + g_cerrado + ", replace="
				+ replace + ", fec_crea=" + fec_crea + ", asignado=" + asignado + ", resuelto=" + resuelto
				+ ", cerrado=" + cerrado + ", duplicate_count=" + duplicate_count + "]";
	}
	

}
