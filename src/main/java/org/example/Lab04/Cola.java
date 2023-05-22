package org.example.Lab04;

public class Cola extends Lista {
    Lista listaCola = new Lista();

    public Cola(Lista listaCola) {
        this.listaCola = listaCola;
    }

    public void enqueue(String ID, String name, String career, int credits, char gender) {
        listaCola.addFirst(ID, name, career, credits, gender);
    }

    public Estudiante dequeue() {
        Estudiante tmp = listaCola.getStudentFromPosition(listaCola.sizeList()-1);
        listaCola.deleteSpecific(listaCola.sizeList()-1);
        return tmp;
    }
    public Estudiante top() {
        return listaCola.cabeza;
    }
}
