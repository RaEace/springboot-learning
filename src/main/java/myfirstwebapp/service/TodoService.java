package myfirstwebapp.service;

import myfirstwebapp.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private static int todosCount = 0;
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(++todosCount, "jules", "Springboot", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todosCount, "jules", "React", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount, "jules", "Through the fire and flames", LocalDate.now().plusYears(100),false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
    }
}
