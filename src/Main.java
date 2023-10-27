import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi la stringa da analizzare");
        String ingr = scanner.nextLine();

        System.out.println("Dammi l'indice da utilizzare");
        int ind = scanner.nextInt();

        unicode(ingr, ind);

        scanner.close();
    }

    public static void unicode(String ingresso, int indice) {
        if (indice < 0 || indice >= ingresso.length()) {
            System.out.println("Indice non valido.");
        } else {
            int inputUnicode = ingresso.codePointAt(indice);
            System.out.println("Il carattere in Unicode è --> " + inputUnicode);
        }
    }
}




/*
import java.util.Scanner;

public class Main { 

    public static void main(String[] args){  
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi la stringa da analizzare");
        String ingr = scanner.nextLine();

        System.out.println("Dammi l'indice da utilizzare");
        int ind = scanner.nextInt();

        unicode(ingr, ind);

        scanner.close();

    }
    
    public static void unicode(String ingresso, int indice){
    if (indice < 0 || indice >= ingresso.length()) {
    System.out.println("Indice non valido.");
} else {
    int inputUnicode = ingresso.codePointAt(indice);
    StringBuilder risultato = new StringBuilder("Il carattere in unicode alla posizione scelta è ");
    risultato.append(inputUnicode);
    System.out.println("Il carattere in Unicode è --> " + inputUnicode);
} 
        int inputUnicode = ingresso.codePointAt(indice);
        
        
        }
    }

*/
/*
if(indice<=ingresso.length() ingresso.length()<=0 ){ 
            System.out.println("Non Valido.");   

        }else{
            StringBuilder risultato = new StringBuilder("Il carattere in unicode alla posizone scelta è ");

            risultato.append(inputUnicode);

            System.out.println("il carattere in Unicode e --> " + inputUnicode);
        

/*
Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode 
    in un indice specifico all'interno di una stringa e lo stampi.

    Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire 
    il carattere in unicode o una stringa di errore.
    Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

 */