
package br.com.cleiton.TodoList.service;

import br.com.cleiton.TodoList.exception.RecursoNaoEncontradoException;
import br.com.cleiton.TodoList.entity.Tarefa;
import br.com.cleiton.TodoList.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return tarefaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException(
                        "Tarefa não encontrada com o ID: " + id
                ));
    }


    public Tarefa atualizar(Long id, Tarefa novosDados) {
        Tarefa tarefa = buscarPorId(id);

        tarefa.setNome(novosDados.getNome());
        tarefa.setDescricao(novosDados.getDescricao());
        tarefa.setRealizado(novosDados.getRealizado());
        tarefa.setPrioridade(novosDados.getPrioridade());

        return tarefaRepository.save(tarefa);
    }



    public void excluir(Long id) {
        Tarefa tarefa = buscarPorId(id);
        tarefaRepository.delete(tarefa);
    }

}
