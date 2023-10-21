import java.util.Scanner;
public class Main {
    public static void main(String[] args){  
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la base...");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza...");
        double altezza= scanner.nextDouble(); 

    
        Forma forma = new Forma(); 
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        //chiamata dei metodi

        forma.calcolaArea(base, altezza);   
        rettangolo.calcolaArea(base, altezza);
        triangolo.calcolaArea(base, altezza);

        scanner.close();

    }
}

/*
Scrivere un programma che contenga una classe chiamata Forma
    ed un metodo chiamato calcolaArea() che stampi l'area della forma.

Crea poi una sottoclasse chiamata Rettangolo 
    che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
 */