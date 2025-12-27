public class Tarefa {
    public String descricao;
    public boolean concluida;

    public void exibirDados(){
        if(concluida){
            System.out.println("Tarefa: " + descricao +" - Status: Concluída ");
        }
        else {
            System.out.println("Tarefa: " + descricao +" - Status: Pendente ");
        }
    }
}
