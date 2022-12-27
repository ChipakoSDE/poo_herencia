package org.dnavaro.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional: inicializando el constructor");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido); // constructor del padre, que a su vez se lo pasa a su padre, estariamos llamando al constructor "abuelo", el de Persona
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
