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
        rettangolo.calcolaArea(base, altezza,TipoForma.RETTANGOLO);
        triangolo.calcolaArea(base, altezza,TipoForma.TRIANGOLO);

        scanner.close();

    }
}

/*
Enum---
Scrivere un programma che contenga una classe chiamata Forma 
       avente un metodo chiamato calcolaArea()    -->     che stampi l'area della forma specifica.

Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma 
        che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.

 */