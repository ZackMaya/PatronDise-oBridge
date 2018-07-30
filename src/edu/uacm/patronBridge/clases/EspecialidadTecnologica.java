package edu.uacm.patronBridge.clases;

import edu.uacm.patronBridge.clasesAbstractas.ElaborarSolicitud;
import edu.uacm.patronBridge.clasesAbstractas.Especialidad;
import edu.uacm.patronBridge.implementacion.CursoJavascript;
import edu.uacm.patronBridge.implementacion.CursoOracle;

public class EspecialidadTecnologica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
		ElaborarSolicitud solicitud = new Especialidad (new CursoOracle());
		solicitud.obtener();
		
        // Ahora le indicamos que use otra implementación para obtener la de verduras
		solicitud.setImplementador(new CursoJavascript());
		solicitud.obtener();
	}

}
