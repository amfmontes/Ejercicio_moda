/**
 * 
 */
package com.curso.moda;

import java.util.ArrayList;

/**
 * @author Curso mañana
 *
 */
public class Main {

	/**
	 * @param args
	 */

	public static ArrayList<GrupoModa> integrantes = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrupoModa modelo1 = new Modelos(1, "Megan", "Fox", 25, "M", 1.65f);
		GrupoModa disenador1 = new Disenador(2, "Ralph", "Lauren", 43, "neoclásico");
		GrupoModa costurera1 = new Costurera(3, "María", "del Carmen", 51, 20.0f);

		integrantes.add(modelo1);
		integrantes.add(disenador1);
		integrantes.add(costurera1);

//		for (GrupoModa integrante : integrantes) {
//			System.out.print(disenador1.getNombre() + " " + disenador1.getApellidos() + " -> ");
//			disenador1.disenar();
//		}
//
//		for (GrupoModa integrante : integrantes) {
//			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
//			integrante.coser();
//		}
//		for (GrupoModa integrante : integrantes) {
//			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
//			integrante.probar();
//		}
//		
		for (GrupoModa integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.desfilar();
		
		}
		System.out.print(disenador1.getNombre() + "->" );
		((Disenador)disenador1).disenar();
	}

}
