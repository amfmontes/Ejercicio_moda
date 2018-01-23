/**
 * 
 */
package com.curso.moda;

/**
 * @author Curso mañana
 *
 */
public abstract class GrupoModa implements IModa {
	public int id;
	public String nombre;
	public String apellidos;
    public int edad;
	
    

	public GrupoModa(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see com.curso.moda.IModa#diseñar()
	 */
	@Override
	public void disenar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.curso.moda.IModa#coser()
	 */
	@Override
	public void coser() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.curso.moda.IModa#probar()
	 */
	@Override
	public void probar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.curso.moda.IModa#desfilar()
	 */
	@Override
	public void desfilar() {
		// TODO Auto-generated method stub

	}

}
