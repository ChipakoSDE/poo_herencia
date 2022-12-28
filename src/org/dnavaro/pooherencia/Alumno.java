package org.dnavaro.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        // con super() invoco al constructor del padre
        // super(); // si lo omito, implícitamente invoca por defecto al constructor vacío del padre
        System.out.println("Alumno: inicializando el constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido); // invoco al constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        //this(nombre, apellido, edad); // con this llamo al constructor de arriba y ese invoca al del padre
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaCastellano,
                  double notaHistoria, double notaMatematica){
        this(nombre, apellido, edad, institucion);
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
        this.notaMatematica = notaMatematica;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public String saludar(){
        String saludar = super.saludar(); // llamo al saludar del padre, en este caso de Persona
        return saludar + " Mi nombre es " + getNombre() + " y soy un alumno";
    }

    public double calcularPromedio(){
        // System.out.println("Calcular Promedio " + Alumno.class.getCanonicalName());
        return (notaMatematica+notaHistoria+notaCastellano)/3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInstitución: " + institucion +
                " - Nota Matemática: " + notaMatematica +
                " - Nota Castellano: " + notaCastellano +
                " - Nota Historia: " + notaHistoria +
                " - Promedio: " + this.calcularPromedio();
    }
}
