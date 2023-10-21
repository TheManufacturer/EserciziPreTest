public class Rettangolo extends Forma {

    @Override
    public void calcolaArea(double base , double altezza) {
        
        double b=base;
        double h=altezza;
        
        //controlliamo una cosetta
        if(base>0 && altezza>0){

        // Calcolo dell'area del rettangolo
        double area = b * h;
        System.out.println("L'area del rettangolo è: " + area);
        }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
        }
    }
}
