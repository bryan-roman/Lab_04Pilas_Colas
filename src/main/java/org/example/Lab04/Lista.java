package org.example.Lab04;


public class Lista {
    Estudiante cabeza;
    Estudiante cola;
    int size;

    public Lista() {
        cabeza = null;
        cola = null;
        size = 0;
    }


    public void addFirst(String ID, String name, String career, int credits, char gender) {
        if (cabeza == null) { //Si la cabeza está vacía agregue un nuevo nodo (estudiante) con sus valores
            cabeza = new Estudiante(ID, name, career, credits, gender);

        } else { //si ya existe un nodo(estudiante) en la cabeza
            Estudiante temp = cabeza; //guardamos en valor de la cabeza
            Estudiante newStudent = new Estudiante(ID, name, career, credits, gender); //Creamos un nuevo nodo aislado
            newStudent.enlazarSiguiente(temp); //Enlazamos el nuevo nodo con la cabeza
            cabeza = newStudent; //El nuevo nodo es la nueva cabeza
        }
        size++;
    }

    //Opción 1 Ingresar Estudiante
    public void addEnd(String ID, String name, String career, int credits, char gender) {
        if (cabeza == null) {
            cabeza = cola = new Estudiante(ID, name, career, credits, gender);
        } else {
            cola.siguienteEstudiante = new Estudiante(ID, name, career, credits, gender);
            cola = cola.siguienteEstudiante;
        }
        size++;
    }

    //Opción 2 Mostrar los estudiantes por ID
    public String getAllID() {
        String list = "";
        Estudiante student = cabeza;
        int contador = 1;
        while (student != null) {
            list = list + "\n" + contador + " - " + student.getID();
            student = student.obtenerSiguiente();
            contador++;
        }
        return list;
    }

    //Opción 3 Mostrar los estudiantes por nombre
    public String getAllNames() {
        String list = "";
        Estudiante student = cabeza;
        int counter = 1;
        while (student != null) {
            list = list + "\n" + counter + " - " + student.getName();
            student = student.obtenerSiguiente();
            counter++;
        }
        return list;
    }

    //Opción 4 Mostrar todos los estudiantes con sus datos
    public String showList() {
        Estudiante estudiante = cabeza;
        String lista = "";
        int contador = 1;
        while (estudiante != null) {
            lista = lista + "\n" + contador + " - " + estudiante.toString();
            estudiante = estudiante.obtenerSiguiente();
            contador++;
        }
        return lista;
    }

    //Opción 5 Mostrar un solo estudiante por ID
    public String getSpecificID(String ID) {
        String list = "";
        Estudiante student = cabeza;
        while (!student.getID().equals(ID)) {
            student = student.obtenerSiguiente();
        }
        return list = student.toString();
    }

    //Opción 6 Mostrar un solo estudiante por el nombre
    public String getSpecificName(String name) {
        String list = "";
        Estudiante student = cabeza;
        while (!student.getName().equals(name)) {
            student = student.obtenerSiguiente();
        }
        return list = student.toString();
    }

    //Opción 7 Mostrar un solo estudiante por la posición de la lista
    public String getStudentFromPosition(int position) {
        int counter = 0;
        Estudiante student = cabeza;
        while (counter < position) {
            student = student.obtenerSiguiente();
            counter++;
        }
        return student.obtenerValor();
    }

    //Opcion 8 Modificar datos de un estudiante
    public boolean modifyStudent(int position, String ID, String name, String career, int credits, char gender) {
        boolean result = false;
        int counter = 0;
        Estudiante student = cabeza;
        while (counter < position) {
            student = student.obtenerSiguiente();
            counter++;
        }
        if (counter == position) {
            student.setID(ID);
            student.setName(name);
            student.setCareer(career);
            student.setCredits(credits);
            student.setGender(gender);
            result = true;
        }
        return result;
    }

    //Opción 9 Eliminar estudiante de posición específica
    public boolean deleteSpecific(int position) {
        boolean answer = false;
        if (position == 0) {
            cabeza = cabeza.obtenerSiguiente();
            answer = true;

        } else {
            int contador = 0;
            Estudiante temporal = cabeza;
            while (contador < position - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
            answer = true;
        }
        size--;
        return answer;
    }

    //Opcion 10
    public int sizeList() {
        int counter = 0;
        Estudiante student = cabeza;
        while (counter < size()) {
            student = student.obtenerSiguiente();
            counter++;
        }
        return counter;
    }

    public int size() { //Método que retorna el tamaño de la lista
        return size;
    }


    public boolean emptyList() {
        return (cabeza == null) ? true : false;

    }

    public void deleteFirst() {
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }


}
