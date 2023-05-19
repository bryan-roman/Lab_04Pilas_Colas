package org.example.Lab04;

public class Estudiante {
    private String ID;
    private String name;
    private String career;
    private int credits;
    private char gender;
    public Estudiante siguienteEstudiante; //Esto es un puntero del nodo 1 al nodo 2

    public Estudiante(String ID, String name, String career, int credits, char gender) { //Método constructor de la clase Estudiante
        this.ID = ID;
        this.name = name;
        this.career = career;
        this.credits = credits;
        this.gender = gender;
        this.siguienteEstudiante = null; //Aqui termina la lista
    }

    public void enlazarSiguiente(Estudiante estudiante) { //Este método apunta a otro nodo que podemos añadir de afuera.
        siguienteEstudiante = estudiante;
    }

    public Estudiante obtenerSiguiente() { //Regresa el enlace al siguiente nodo.
        return siguienteEstudiante;
    }

    public String obtenerValor() { //Obtener valores
        return toString();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public Estudiante getSiguienteEstudiante() {
        return siguienteEstudiante;
    }

    public void setSiguienteEstudiante(Estudiante siguienteEstudiante) {
        this.siguienteEstudiante = siguienteEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", career='" + career + '\'' +
                ", credits=" + credits +
                ", gender=" + gender +
                '}';
    }
}
