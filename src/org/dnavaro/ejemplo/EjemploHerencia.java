package org.dnavaro.ejemplo;

import org.dnavaro.pooherencia.Alumno;
import org.dnavaro.pooherencia.AlumnoInternacional;
import org.dnavaro.pooherencia.Persona;
import org.dnavaro.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        // Persona alumno = new Alumno();
        // puedo definir al alumno como un Objeto de clase Persona, pero en ese caso no puedo acceder a los
        // datos de alumno (Institucion y notas) para eso tengo que castearlo
        // casteo la invocacion del setter para definir los datos de alumno
        //((Alumno)alumno).setInstitucion("Instituto Nacional");

        System.out.println("========== Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Esteban");
        alumno.setApellido("Quito");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("========== Creando la instancia de la clase AlumnoInternacional ==========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Albert");
        alumnoInt.setApellido("Gas");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("========== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Valen");
        profesor.setApellido("Tito");
        profesor.setAsignatura("Matemáticas");

        System.out.println("========== --- ==========");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + " - Colegio: "
        + alumno.getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("Alumno Internacional: " + alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " - Colegio: "
                + alumnoInt.getInstitucion() + " - Pais de Origen: " + alumnoInt.getPais());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre: " + padre);
            clase = clase.getSuperclass();
        }
    }
}
