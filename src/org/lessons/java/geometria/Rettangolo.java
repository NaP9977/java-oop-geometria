//Esercitazione di oggi: Geometria :quadrato_rosso_grande::quadrato_viola_grande::quadrato_verde_grande:
//Nome repo: java-oop-geometria
//Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria, in cui inserire le classi:
//una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri. Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
// Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
//BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni, come nell’immagine allegata

package org.lessons.java.geometria;
public class Rettangolo {


    int base;
    int altezza;
   int area;
     int perimetro;

   Rettangolo( int base, int altezza){
       this.base = base;
       this.altezza = altezza;
       this.area = area;
       this.perimetro = perimetro;

   }
   void calcolaArea(int base, int altezza){
        area = base * altezza;
   }

 void calcolaPerimetro(int base, int altezza) {
       perimetro = (base + altezza) * 2;
    }

static void Draw(){

}

}
