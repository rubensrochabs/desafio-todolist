package br.com.rubensrochabs.desafio_todolist.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.rubensrochabs.desafio_todolist.entities.Todo;
import br.com.rubensrochabs.desafio_todolist.repositories.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(final TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(final Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }

    public List<Todo> update(final Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(final Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
