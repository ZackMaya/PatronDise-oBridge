package edu.uacm.patronBridge.clasesAbstractas;

import edu.uacm.patronBridge.implementacion.Elaborar;

public class Especialidad extends ElaborarSolicitud {

    public Especialidad( Elaborar implementador )
    {
        this.setImplementador( implementador );
    }

    @Override
    public void obtener()
    {
        System.out.println("Registrando en ...");

        this.getImplementador().procesar();
    }
}
