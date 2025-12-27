import java.util.ArrayList;

public class Main10 {
    public static void main(String[] args){
        ArrayList<Compra> vetCompras = new ArrayList<>();
        double valorTotal = 0;

        Compra c1 = new Compra();
        c1.nome = "Teclado";
        c1.preco = 120.0;
        c1.quantidade = 1;

        Compra c2 = new Compra();
        c2.nome = "Mouse";
        c2.preco = 60.0;
        c2.quantidade = 2;

        vetCompras.add(c1);
        vetCompras.add(c2);

        for(Compra c: vetCompras){
          valorTotal += c.calcularValorPorItem();
        }

        System.out.printf("Total da compra: R$ %.2f\n", valorTotal);
    }
}
