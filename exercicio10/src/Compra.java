public class Compra {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorPorItem(){
        double valorTotal = preco*quantidade;

        return valorTotal;
    }


}
