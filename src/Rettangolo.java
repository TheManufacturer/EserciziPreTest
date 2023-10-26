class Rettangolo extends Forma {

    public void calcolaArea(double base , double altezza,TipoForma tipo) {
        
        double b=base;
        double h=altezza;
        
        //controlliamo una cosetta
        if(base>0 && altezza>0){
            if(tipo ==TipoForma.RETTANGOLO){ 

            // Calcolo dell'area del rettangolo
            double area = b * h;
            System.out.println("è un rettangolo...quindi--> "+ "L'area del rettangolo è: " + area);        
            }else{

            System.out.println("Forse non è un rettangolo...xD" );
            }
        }

    }
}
