import java.util.Scanner;
public class Main {
    public static void main(String[] args){  
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la base...");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza...");
        double altezza= scanner.nextDouble(); 

    
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        //chiamata dei metodi
        rettangolo.calcolaArea(base, altezza);
        triangolo.calcolaArea(base, altezza);

        scanner.close();

    }
}

/*
Scrivere un programma che contenga una classe astratta chiamata Forma
un metodo astratto chiamato calcolaArea().

Crea poi due sottoclassi Rettangolo e Triangolo 
che estendono Forma 
ed implementano il metodo per il calcolo dell'area in maniera specifica.
 */