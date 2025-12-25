public class Produto {
    public String nome;
    public double preco;
    public int quant;

    public void exibirDados() {
        System.out.printf("Nome: %s%nPreço: R$ %.2f%nQuantidade em estoque: %d%n",
                nome, preco, quant);
    }

}
