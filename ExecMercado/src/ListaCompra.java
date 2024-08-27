import java.util.List;

public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qtdeMax;

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    @Override
    public double calcularPreco(){
        double soma = 0;
        for(ItemCompra i: itensCompra){
            soma += i.calcularPreco();
        }
        return soma;
    }
}
