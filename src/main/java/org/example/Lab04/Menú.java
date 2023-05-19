package org.example.Lab04;

import java.util.Scanner;

public class Menú {

    Lista lista = new Lista();
    Scanner scanner = new Scanner(System.in);
    String ID, name, career;
    int credits;
    char gender;

    Pila pila = new Pila(lista);
    Cola cola = new Cola(lista);


    public void mainMenu() {
        System.out.println("Seleccione una opción del menú: \n" +
                "1) Pilas\n" +
                "2) Colas\n" +
                "3) Salir"
        );

        int optionMenu = Integer.parseInt(scanner.nextLine());
        do {
            switch (optionMenu) {
                case 1:
                    menuPilas();
                    break;
                case 2:
                    menuColas();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (optionMenu != 3);
    }

    public void menuPilas() {
        System.out.println("Seleccione una operación de la pila: \n" +
                "1) Push \n" +
                "2) Top \n" +
                "3) Pop \n" +
                "4) Mostrar pila \n" +
                "5) Menú principal");

        int optionMenu = Integer.parseInt(scanner.nextLine());
        do {
            switch (optionMenu) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante: ");
                    System.out.println("ID: ");
                    ID = scanner.nextLine();
                    System.out.println("Nombre: ");
                    name = scanner.nextLine();
                    System.out.println("Carrrera: ");
                    career = scanner.nextLine();
                    System.out.println("Créditos: ");
                    credits = Integer.parseInt(scanner.nextLine());
                    System.out.println("Género: {M para masculino - F para Femenino");
                    gender = scanner.nextLine().charAt(0);
                    pila.push(ID, name, career, credits, gender);
                    menuPilas();
                    break;
                case 2:
                    System.out.println("El estudiante en la posición top es: ");
                    System.out.println(pila.top());
                    menuPilas();
                    break;
                case 3:
                    System.out.println("El estudiante a sacar es: ");
                    System.out.println(pila.pop());
                    menuPilas();
                    break;

                case 4:
                    System.out.println("La lista de estudiantes es: ");
                    System.out.println(lista.showList());
                    menuPilas();
                    break;

                case 5:
                    mainMenu();
                    break;
            }
        } while (optionMenu != 5);

    }

    public void menuColas() {
        System.out.println("Seleccione una operación de la pila: \n" +
                "1) Enqueue \n" +
                "2) Top \n" +
                "3) Dequeue \n" +
                "4) Mostrar cola \n" +
                "5) Menú principal");

        int optionMenu = Integer.parseInt(scanner.nextLine());
        do {
            switch (optionMenu) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante: ");
                    System.out.println("ID: ");
                    ID = scanner.nextLine();
                    System.out.println("Nombre: ");
                    name = scanner.nextLine();
                    System.out.println("Carrrera: ");
                    career = scanner.nextLine();
                    System.out.println("Créditos: ");
                    credits = Integer.parseInt(scanner.nextLine());
                    System.out.println("Género: {M para masculino - F para Femenino");
                    gender = scanner.nextLine().charAt(0);
                    cola.enqueue(ID, name, career, credits, gender);
                    menuColas();
                    break;
                case 2:
                    System.out.println("El estudiante en la posición top es: ");
                    System.out.println(cola.top());
                    menuColas();
                    break;
                case 3:
                    System.out.println("El estudiante a sacar es: ");
                    System.out.println(cola.dequeue());
                    menuColas();
                    break;
                case 4:
                    System.out.println("La lista de estudiantes es: ");
                    System.out.println(lista.showList());
                    menuColas();
                    break;

                case 5:
                    mainMenu();
                    break;
            }
        } while (optionMenu != 4);
    }
}

