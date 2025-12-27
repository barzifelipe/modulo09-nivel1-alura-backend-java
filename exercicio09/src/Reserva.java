public class Reserva {
    public String titulo;
    public int diasAtraso;

    public double calcularMulta(){
        double valorMulta = 0;

        for (int i = 0; i < diasAtraso; i++) {
            valorMulta += 2.5;
        }

        return valorMulta;
    }

    public void exibirDados(){
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, calcularMulta());
    }
}
