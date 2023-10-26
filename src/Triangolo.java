public class Triangolo extends Forma {

    public void calcolaArea(double base , double altezza,TipoForma tipo) {
        
        double b=base;
        double h=altezza;
        
        //controlliamo una cosetta
        if(base>0 && altezza>0){
            if(tipo == TipoForma.TRIANGOLO){
                
            // Calcolo dell'area del triangolo
            double area = (b * h)/2;
            System.out.println("è un triangolo...quindi--> " + "L'area del triangolo è: " + area);
        
            }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
            }
        }
    }
}