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

    @Override
    public String saludar() {
        return super.saludar() + " extranjero, vengo de " + getPais();
    }

    @Override
    public double calcularPromedio() {
        // System.out.println("Calcular Promedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPais origen: " + pais +
                " - Nota Idiomas: " + notaIdiomas;
    }
}
