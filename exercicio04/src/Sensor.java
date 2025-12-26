public class Sensor {
    public String local;
    public double temperaturaAtual;

    public void exibirDados(){
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f%n ºC", temperaturaAtual);

        if(temperaturaAtual > 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }


}
