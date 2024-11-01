

package com.mycompany.ejercicioarbol;

import javax.swing.JOptionPane;


public class Ejercicioarbol {
    private Nodo nodo;

    public Ejercicioarbol() {
        this.nodo = null;
    }

    
    public void insertarPersona() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
        String sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");

        Persona persona = new Persona(nombre, edad, sexo);
        nodo = insertarR(nodo, persona);
        JOptionPane.showMessageDialog(null, "Persona agregada: " + persona);
    }

    
    private Nodo insertarR(Nodo nodo, Persona persona) {
        if (nodo == null) {
            return new Nodo(persona);
        }
        if (persona.edad < nodo.persona.edad) {  
            nodo.derecha = insertarR(nodo.derecha, persona);
        } else {  
            nodo.izquierda = insertarR(nodo.izquierda, persona);
        }
        return nodo;
    }

    
    public void mostrarPersona() {
        if (nodo == null) {
            JOptionPane.showMessageDialog(null, "El árbol está vacío.");
        } else {
            inorden(nodo); 
        }
    }

   
    private void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);           
            
            String mensaje = nodo.persona.toString() + 
                             (nodo.persona.edad >= 18 ? " Es Mayor de edad" : " Es Menor de edad");
            JOptionPane.showMessageDialog(null, mensaje);
            
            inorden(nodo.derecha);                
        }
    }
}