import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }

    @Override
    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos) {
        Tarefa tarefa = new Tarefa(descricao, categoria, tempoEmMinutos);
        tarefas.add(tarefa);
    }

    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }

    @Override
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos) {
        List<Tarefa> tarefasQueDuramMaisDeList = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.getTempoTarefaEmMinutos() > tempoEmMinutos) {
                tarefasQueDuramMaisDeList.add(t);
            }
        }
        return tarefasQueDuramMaisDeList;
    }

    @Override
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa) {
        List<Tarefa> tempoTotalList = new ArrayList<>();
        int tempoTotal = 0;
        for (Tarefa t : tarefas) {
            if (t.getCategoria().equalsIgnoreCase(categoriaTarefa)) {
              tempoTotalList.add(t);
            }
        }
        for (Tarefa t : tempoTotalList) {
            tempoTotal += t.getTempoTarefaEmMinutos();
        }
        return tempoTotal;
    }

    @Override
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa) {
        List<Tarefa> tempoTotalList = new ArrayList<>();
        int tempoTotal = 0;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricaoTarefa)) {
                tempoTotalList.add(t);
            }

        }
        for (Tarefa t : tempoTotalList) {
            tempoTotal += t.getTempoTarefaEmMinutos();
        }
        return tempoTotal;
    }

    @Override
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao) {
        List<Tarefa> tarefasEncontradasList = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasEncontradasList.add(t);
            }
        }
        return tarefasEncontradasList;
    }
}