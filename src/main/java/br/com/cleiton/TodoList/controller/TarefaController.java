
package br.com.cleiton.TodoList.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import br.com.cleiton.TodoList.entity.Tarefa;
import br.com.cleiton.TodoList.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Tarefa atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Tarefa tarefa) {
        return tarefaService.atualizar(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        tarefaService.excluir(id);
        return ResponseEntity.noContent().build();
    }



}
