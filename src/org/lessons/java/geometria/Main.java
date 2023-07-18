package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("inserisci la base e l'altezza del rettangolo");
        int altezzaInput = scan.nextInt();
        int baseInput = scan.nextInt();
        System.out.println("la base è: " + baseInput);
        System.out.println("l'altezza è: " + altezzaInput);
        Rettangolo ab = new Rettangolo(altezzaInput, baseInput);



    }
}
