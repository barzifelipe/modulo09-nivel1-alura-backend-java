public class Item {
    public String nome;
    public int quantidade;

    public void vender(int quantVendida){
        if(quantidade > quantVendida){
            quantidade -= quantVendida;
            System.out.println("Venda realizada. Estoque restante de " +nome+": "+quantidade);
        }
        else{
            System.out.println("Estoque insuficiente");
        }
    }
}
