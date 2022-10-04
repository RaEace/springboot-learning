package myfirstwebapp.service;

import myfirstwebapp.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos = Arrays.asList(
            new Todo(1, "jules", "Springboot", LocalDate.now().plusYears(2),false),
            new Todo(2, "jules", "React", LocalDate.now().plusYears(1),false),
            new Todo(3, "jules", "Through the fire and flames", LocalDate.now().plusYears(100),false)
    );

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
