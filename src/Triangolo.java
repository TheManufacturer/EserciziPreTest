public class Triangolo implements Forma {
        private double altezza;
        private double base;


    public void calcolaArea(double base , double altezza) {

        this.base = base;
        this.altezza = altezza;
        //controlliamo una cosetta
        if(base>0 && altezza>0){

        // Calcolo dell'area del triangolo
        double area = (this.base * this.altezza)/2;

        System.out.println("L'area del triangolo è: " + area);
        
        }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
        }
    }
}