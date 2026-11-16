
package br.com.cleiton.TodoList.repository;

import br.com.cleiton.TodoList.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
