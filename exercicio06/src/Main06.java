public class Main06 {
    public static void main(String[] args){
        Colaborador colaborador1 = new Colaborador();
        colaborador1.nome = "Felipe Barzilai";
        colaborador1.cargo = "Desenvolvedor Junior";
        colaborador1.nivelAcesso = 1;

        colaborador1.atualizarDados("Desenvolvedor pleno", 2);
    }
}
