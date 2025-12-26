public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        double media = (nota1+nota2)/2;
        return media;
    }

    public void exibirDados(){
        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.1f%nNota 2: %.1f%nMédia: %.1f%n", nota1, nota2, calcularMedia());

        if(calcularMedia() >= 7){
            System.out.println("Situação: Aprovado");
        }
        else {
            System.out.println("Situação: Reprovado");
        }
    }
}
