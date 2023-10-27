public class Triangolo extends Forma {

    private double base;
    private double altezza;

    public void calcolaArea(double base , double altezza,TipoForma tipo) {
        
        this.base = base;
        this.altezza = altezza;
        
        //controlliamo una cosetta
        if(this.base>0 && this.altezza>0){
            
            if(tipo == TipoForma.TRIANGOLO){
                
            // Calcolo dell'area del triangolo
            double area = (base * altezza)/2;
            System.out.println("è un triangolo...quindi--> " + "L'area del triangolo è: " + area);
        
            }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
            }
        }
    }
}