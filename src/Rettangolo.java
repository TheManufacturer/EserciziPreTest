class Rettangolo implements Forma {

    private double altezza;
    private double base;

    public void calcolaArea(double base , double altezza) {
        
        this.base = base;
        this.altezza = altezza;
        
        //controlliamo una cosetta
        if(this.base>0 && this.altezza>0){

        // Calcolo dell'area del rettangolo
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
        }else{

            System.out.println("Non penso sia possibile calcolare l'area con un qualcosa di non positivo..." );
        }
    }
}
