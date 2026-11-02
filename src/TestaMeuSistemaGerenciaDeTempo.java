import java.util.List;

public class TestaMeuSistemaGerenciaDeTempo {
    public static void main(String[] args) {
        SistemaGerenciaDeTempo sistema = new MeuSistemaGerenciaDeTempo();
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 120);
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 80);
        sistema.cadastrarTarefa("Estudar Cálculo", "Estudo", 60);
        System.out.println(sistema.calcularTempoTotalDeTarefasComDescricao("Estudar LP"));
        List<Tarefa> tarefasEstudo = sistema.pesquisarTarefasDaCategoria("Estudo");
        for (Tarefa f : tarefasEstudo) {
            System.out.println(f.toString());
        }

        sistema.cadastrarTarefa("Estudar Vetorial", "Estudo", 20);
        List<Tarefa> categoriaEstudoList = sistema.pesquisarTarefasDaCategoria("Estudo");
        for (Tarefa t : categoriaEstudoList) {
            System.out.println(t.getDescricao());
        }
    }
}
