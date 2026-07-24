package sa.com.br.repository;

import sa.com.br.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public void save(Task task){
        tasks.add(task);
    }

    public List<Task> findAll(){
        return tasks;
    }

    public Task findByTitle(String title){
        for(Task task : tasks){
            if(task.getTitle().equals(title)){
                return task;
            }
        }
        return null;
    }

    public void delete(Task task){
       tasks.remove(task);
    }

}
