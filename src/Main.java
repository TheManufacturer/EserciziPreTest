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
A partire dal programma creato precedentemente 
in cui si richiedeva il calcolo dell'area 
aggiungere una ulteriore classe chiamata Triangolo 
supportando poi il calcolo dell'area per quest'ultima figura.


{ PROGRAMMA PRECEDENTE
Scrivere un programma che contenga una classe chiamata Forma
    ed un metodo chiamato calcolaArea() che stampi l'area della forma.

Crea poi una sottoclasse chiamata Rettangolo 
    che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
}

 */