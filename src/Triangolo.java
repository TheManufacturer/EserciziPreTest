public class Triangolo extends Forma {

    @Override
    public void calcolaArea(double base , double altezza) {
        
        double b=base;
        double h=altezza;
        
        //controlliamo una cosetta
        if(base>0 && altezza>0){

        // Calcolo dell'area del triangolo
        double area = (b * h)/2;

        System.out.println("L'area del triangolo è: " + area);
        
        }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
        }
    }
}