package org.dnavaro.ejemplo;

import org.dnavaro.pooherencia.Alumno;
import org.dnavaro.pooherencia.AlumnoInternacional;
import org.dnavaro.pooherencia.Persona;
import org.dnavaro.pooherencia.Profesor;


public class EjemploHerenciaSobrecargaToString {
    public static void main(String[] args) {


        System.out.println("========== Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno("Walter", "Black", 16, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("WBlack@correo.com");

        System.out.println("========== Creando la instancia de la clase AlumnoInternacional ==========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Albert", "Gas", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("AGas@correo.com");

        System.out.println("========== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor("Calen", "Tito", "Matematicas");
        profesor.setEdad(45);
        profesor.setEmail("CTito@correo.com");


        System.out.println("\n========== ************************* ==========");
        imprimir(alumno);
        System.out.println("\n========== ************************* ==========");
        imprimir(alumnoInt);
        System.out.println("\n========== ************************* ==========");
        imprimir(profesor);


    }

    //creo una clase con el método estático imprimir para imprimir un objeto del tipo Persona
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
