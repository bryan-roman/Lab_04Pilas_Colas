package org.example.Lab04;

public class Pila extends Lista{
    Lista listaPila = new Lista();
    public Pila(Lista lista){
        this.listaPila =lista;
    }
    public void push(String ID, String name, String career, int credits, char gender){
        listaPila.addFirst(ID, name, career, credits, gender);
    }

    public Estudiante pop(){
        Estudiante tmp= listaPila.cabeza;
          listaPila.deleteFirst();
        return tmp;
    }
    public Estudiante top(){
        return listaPila.cabeza;
    }
}
