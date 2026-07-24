package sa.com.br.model;


import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();


    public void addTask(Task task){
       tasks.add(task);
    }

    public void listTasks(){
        for(Task task: tasks){
            System.out.println(task);
        }
    }

    public Task findByTitle(String title){

        for(Task task : tasks){

            if(task.getTitle().equals(title)){
                return task;
            }

        }

        return null;
    }

    public void removeTask(String title){

        Task task = findByTitle(title);

        if(task != null){
            tasks.remove(task);
        }

    }


}


