
package com.mycompany.ejercicioarbol;


class Persona {
    String nombre;
    int edad;
    String sexo;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo;
    }
}

