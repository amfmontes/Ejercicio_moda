/**
 * 
 */
package com.curso.moda;

/**
 * @author Curso ma�ana
 *
 */
public class Costurera extends GrupoModa{
	private float precio;
	
	public Costurera(int id, String nombre, String apellidos, int edad, float precio) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/* (non-Javadoc)
	 * @see com.curso.moda.GrupoModa#coser()
	 */
	@Override
	public void coser() {
		// TODO Auto-generated method stub
		super.coser();
		System.out.println("cose r�pidamente");
	}

	
	
}
