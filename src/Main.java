import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci grandezza Array... ");

        int grandezza = scan.nextInt();

        scan.close();

        int[] arr = new int[grandezza];

        popolArray(arr);
        sommaValoriArr(arr);
        maxMin(arr);

    }

    public static void popolArray(int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
        }
    }

    public static void sommaValoriArr(int[] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            somma += arr[i];
        }
        System.out.println("La somma è --> " + somma);

    }

    public static void maxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){

                max=arr[i];

            }else if(arr[i]< min){

                min =arr[i];
            }
        }
        System.out.println("il valore minimo è : " + min + " Il valore massimo è : " + max);

    }
}

/*
 * Array di int random
 * Somma di tutti i valori nell'array
 * max e min dei valori
 * 
 */