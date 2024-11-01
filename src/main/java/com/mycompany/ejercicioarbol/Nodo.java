
package com.mycompany.ejercicioarbol;

class Nodo {
    Persona persona;
    Nodo izquierda, derecha;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.izquierda = null;
        this.derecha = null;
    }
}