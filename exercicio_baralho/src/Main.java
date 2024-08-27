public class Main {
    public static void main(String[] args){
        Baralho baralho = new Baralho();
        baralho.embaralhar(baralho.getCartas());
        baralho.distribuirCarta(baralho.getCartas());
        baralho.hasCarta(baralho.getCartas());
        baralho.imprimirBaralho(baralho.getCartas());
    }
}
