package org.dnavaro.ejemplo;

import org.dnavaro.pooherencia.*;


public class EjemploHerenciaConstructores {
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
        System.out.println("-----Imprimiendo los datos comunes del tipo Persona-----");
        System.out.println("Alumno: " + persona.getNombre()
                + " " + persona.getApellido()
                + " - Edad: " + persona.getEdad()
                + " - Email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("-----Imprimiendo los datos del tipo Alumno-----");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            // como Alumno Internacional es hija de Alumno pongo valido si es instancia de Internacional dentro de la validacion de Alumno
            if(persona instanceof AlumnoInternacional){
                System.out.println("-----Imprimiendo los datos del tipo Alumno Internacional-----");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais de Origen: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("========== Sobrescritura promedio ==========");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("========== Fin Sobrescritura promedio ==========");

        }
        if(persona instanceof Profesor){
            System.out.println("-----Imprimiendo los datos del tipo Profesor-----");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("========== Sobrescritura saludar ==========");
        System.out.println(persona.saludar());
        System.out.println("========== Fin Sobrescritura saludar ==========");
    }
}
