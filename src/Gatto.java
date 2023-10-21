public class Gatto extends Animale {
    
    // Sovrascriviamo il metodo faiIlVerso() per il gatto
    @Override
    public void faiIlVerso() {
        System.out.println("Verso del gatto:");
        System.out.println("Il gatto Miagola! -- Miao");
    }
}
