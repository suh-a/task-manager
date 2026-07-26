package sa.com.br.service;

import sa.com.br.model.Task;
import sa.com.br.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private final TaskRepository repository = new TaskRepository();
    private List<Task> tasks = new ArrayList<>();

    public void createTask(Task task){
        repository.save(task);
    }

    public Task findByTitle(String title){
         return repository.findByTitle(title);

    }

    public List<Task> findAll(){
        return repository.findAll();
    }

    public void removeTask(String title){

        Task task = repository.findByTitle(title);

        if (task != null){
            repository.delete(task);
        }else {
            throw new IllegalArgumentException("Task not found");
        }
    }

}
