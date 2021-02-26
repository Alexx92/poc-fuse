package cl.amsa.contrato.obj;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Input {
	@NotNull(message = "Valor Requerido ")
	@Size(min=3, max=15, message = "Largo Incorrecto")
	private String rut_trabajador;
	
	@NotNull(message = "Valor Requerido")
	@Size(min=2, max=20, message = "Largo Incorrecto")
	private String fecha_inicio;
	
	@NotNull(message = "Valor Requerido ")
	@Size(min=2, max=20, message = "Largo Incorrecto")
	private String fecha_termino;
	
	@NotNull(message = "Valor Requerido ")
	private String codigo_certificado;

	public String getRut_trabajador() {
		return rut_trabajador;
	}

	public void setRut_trabajador(String rut_trabajador) {
		this.rut_trabajador = rut_trabajador;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_termino() {
		return fecha_termino;
	}

	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}

	public String getCodigo_certificado() {
		return codigo_certificado;
	}

	public void setCodigo_certificado(String codigo_certificado) {
		this.codigo_certificado = codigo_certificado;
	}

	public Input(String rut_trabajador, String fecha_inicio, String fecha_termino, String codigo_certificado) {
		super();
		this.rut_trabajador = rut_trabajador;
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;
		this.codigo_certificado = codigo_certificado;
	}

	public Input() {
		super();
	}
	
	
	

}
