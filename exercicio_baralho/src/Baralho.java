//importação de bibliotecas
import java.util.Random;
//iniciando classe Baralho
public class Baralho {
    private Carta[] cartas = new Carta[56];

    public Baralho() {

        // Inicializando os arrays com tamanhos específicos
        int contador = 0;

        while (contador < 56) {
            // Atribuindo valores aos elementos dos arrays
            for (Naipe naipe : Naipe.values()) {
                for (Valor valor : Valor.values()) {
                    if (naipe != Naipe.CORINGA && valor != Valor.CORINGA) {
                        Carta carta = new Carta(naipe, valor);
                        cartas[contador] = carta;
                        contador++;
                    }
                }
            }
            for (int c = 0; c < 4; c++) {
                Carta carta = new Carta(Naipe.CORINGA, Valor.CORINGA);
                cartas[contador] = carta;
                contador++;
            }
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

//    embaralhar( ) – usando o método Math.random dá para trocar as
//    cartas dentro do baralho, misturando-as (sorteie duas posições e
//    troque-as. Repita este processo diversas vezes).

    public void embaralhar(Carta[] baralho) {
        for (int i = 0; i < 1000; i++) {

            //math.random é uma operação automatica que vai de 0 a 1 pegando as 2 posiçoes do vetor
            int e1 = (int) (Math.random() * baralho.length);
            int e2 = (int) (Math.random() * baralho.length);

            //embaralhar as posiçoes dos vetores
            Carta temp = baralho[e2];
            baralho[e1] = baralho[e2];
            baralho[e1] = temp;
        }
    }


//distribuirCarta( ) – devolve uma carta, retirada do topo do baralho, se não estiver vazio, ou null.

    public Carta distribuirCarta(Carta[] baralho) {
        int c = 0;
        for (c = 55; c >= 0; c--) {
            if (cartas[c] != null) {
                cartas[c] = null;
            }
        }
        return null;
    }

    public boolean hasCarta(Carta[] baralho) {
        if (cartas == null) {
            return false;
        } else {

            return true;
        }
    }


    public void imprimirBaralho(Carta[] baralho) {
        for (Carta carta : baralho) {
            System.out.println(carta);
        }
    }
}
