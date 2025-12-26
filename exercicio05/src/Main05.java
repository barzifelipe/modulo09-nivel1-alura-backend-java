public class Main05 {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Felipe";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 9.5;

        aluno1.calcularMedia();
        aluno1.exibirDados();
    }
}
