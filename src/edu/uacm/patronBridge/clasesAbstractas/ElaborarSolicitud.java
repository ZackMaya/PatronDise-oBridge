package edu.uacm.patronBridge.clasesAbstractas;

import edu.uacm.patronBridge.implementacion.Elaborar;

public abstract class ElaborarSolicitud {
	
	 // Referencia al Implementador
    Elaborar implementador;

    String nombre;

    public Elaborar getImplementador(){
        return this.implementador;
    }

    public void setImplementador( Elaborar implementador ){
        this.implementador = implementador;
    }
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
