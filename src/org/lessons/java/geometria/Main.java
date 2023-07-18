package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la base e l'altezza del rettangolo: ");
        int altezzaInput = scan.nextInt();
        int baseInput = scan.nextInt();
        System.out.println("La base è: " + baseInput);
        System.out.println("L'altezza è: " + altezzaInput);
        Rettangolo ab = new Rettangolo(altezzaInput, baseInput);
       Rettangolo.calcolaArea(baseInput, altezzaInput);
     System.out.println("L'area è: + " + Rettangolo.area);
     Rettangolo.calcolaPerimetro(baseInput, altezzaInput);
     System.out.println("Il perimetro è: " + Rettangolo.perimetro);


    }
}
