package org.example.Lab04;

public class Pila extends Lista{
    Lista lista;
    public Pila(Lista lista){
        this.lista=lista;
    }
    public void push(String ID, String name, String career, int credits, char gender){
        lista.addFirst(ID, name, career, credits, gender);
    }

    public Estudiante pop(){
        Estudiante tmp= lista.cabeza;
          lista.deleteFirst();
        return tmp;
    }

    public Estudiante top(){
        return lista.cabeza;
    }

}
