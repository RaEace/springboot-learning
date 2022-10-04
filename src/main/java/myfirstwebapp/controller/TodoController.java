package myfirstwebapp.controller;

import myfirstwebapp.model.Todo;
import myfirstwebapp.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public String getAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("jules");
        model.addAttribute("todos", todos);
        return "todos";
    }
}
