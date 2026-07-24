package sa.com.br;

import sa.com.br.enums.Category;
import sa.com.br.model.Task;
import sa.com.br.model.TaskManager;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        LocalDateTime deadlineTaskOne = LocalDateTime.of(2026, Month.DECEMBER, 31, 12, 30);
        LocalDateTime deadlineTaskTwo = LocalDateTime.of(2026, Month.SEPTEMBER, 20, 10, 30);

        Task taskOne = new Task(
                "Study English",
                "A2 English",
                Category.STUDY,
                deadlineTaskOne
        );

        Task taskTwo = new Task(
                "Study Java",
                "Intermediate Java",
                Category.STUDY,
                deadlineTaskTwo
        );

        TaskManager manager = new TaskManager();

        manager.addTask(taskOne);
        manager.addTask(taskTwo);

        manager.listTasks();
    }
}