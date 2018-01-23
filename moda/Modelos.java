/**
 * 
 */
package com.curso.moda;

/**
 * @author Curso mañana
 *
 */
public class Modelos extends GrupoModa{
	
	private String talla;
	private float altura;

	public Modelos(int id, String nombre, String apellidos, int edad, String talla, float altura) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/* (non-Javadoc)
	 * @see com.curso.moda.GrupoModa#probar()
	 */
	@Override
	public void probar() {
		// TODO Auto-generated method stub
		super.probar();
		System.out.println("La modelo se prueba la ropa");
	}

	/* (non-Javadoc)
	 * @see com.curso.moda.GrupoModa#desfilar()
	 */
	@Override
	public void desfilar() {
		// TODO Auto-generated method stub
		super.desfilar();
		System.out.println("La modelo desfila");
	}

	
	
	
}
