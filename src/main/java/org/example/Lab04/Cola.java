package org.example.Lab04;

public class Cola extends Lista {
    Lista lista;

    public Cola(Lista lista) {
        this.lista = lista;
    }

    public void enqueue(String ID, String name, String career, int credits, char gender) {
        lista.addFirst(ID, name, career, credits, gender);
    }

    public Estudiante dequeue() {
        Estudiante tmp = lista.getStudentFromPosition(lista.sizeList()-1);
        lista.deleteSpecific(lista.sizeList()-1);
        return tmp;
    }

    public Estudiante top() {
        return lista.cabeza;
    }
}
