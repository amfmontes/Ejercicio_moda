/**
 * 
 */
package com.curso.moda;

/**
 * @author Curso ma�ana
 *
 */
public class Disenador extends GrupoModa {
	private String estilo;

	public Disenador(int id, String nombre, String apellidos, int edad, String estilo) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	/* (non-Javadoc)
	 * @see com.curso.moda.GrupoModa#dise�ar()
	 */
	@Override
	public void disenar() {
		// TODO Auto-generated method stub
		super.disenar();
		System.out.println("La ropa es neocl�sica");
	}

	
	
}
