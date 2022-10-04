package myfirstwebapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
public class Todo {
    private int id;
    private String author;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;

    public Todo() {

    }

    public Todo(int id, String author, String description, LocalDate targetDate, boolean isDone) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }
}

