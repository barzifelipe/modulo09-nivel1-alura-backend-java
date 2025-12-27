import java.util.ArrayList;

public class Main07 {
    public static void main(String[] args){
        ArrayList<Tarefa> vetTarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        vetTarefas.add(t1);
        vetTarefas.add(t2);

        for(Tarefa t : vetTarefas){
            t.exibirDados();
        }
    }
}
