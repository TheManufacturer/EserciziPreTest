class Rettangolo extends Forma {
    

    private double base;
    private double altezza;

    public void calcolaArea(double base , double altezza, TipoForma tipo) {
        
        this.base = base;
        this.altezza = altezza;
        
        //controlliamo una cosetta
        if(base>0 && altezza>0){
            if(tipo ==TipoForma.RETTANGOLO){ 

            // Calcolo dell'area del rettangolo
            double area = base * altezza;
            System.out.println("è un rettangolo...quindi--> "+ "L'area del rettangolo è: " + area);        
            }else{

            System.out.println("Forse non è un rettangolo...xD" );
            }
        }

    }
}
