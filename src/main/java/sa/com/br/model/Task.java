package sa.com.br.model;


import sa.com.br.enums.Category;
import sa.com.br.enums.Status;

import java.time.LocalDateTime;


public class Task {
    private Long id;
    private String title;
    private String description;
    private Category category;
    private Status status;

    private LocalDateTime createdAt;
    private LocalDateTime completedAt;
    private LocalDateTime dueDate;

    public Task(String title,
                String description,
                Category category,
                LocalDateTime dueDate){

        validateTitle(title);
        this.description = description;
        this.category = category;
        this.dueDate = dueDate;



        this.status = Status.PENDING;
        this.createdAt = LocalDateTime.now();



    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Task{title='"+ title + "', dueDate=" + dueDate + "', category=" + category + "', status=" + status + "}";
    }

    public void complete(){

        if(status == Status.COMPLETED){
            throw new IllegalStateException("The task is already completed");
        }else {
            this.status = Status.COMPLETED;
            this.completedAt = LocalDateTime.now();
        }
    }

    private void validateTitle(String title){
        if(title == null){
            throw new IllegalArgumentException("Title cannot be null");
        }else if(title.isBlank()){
           throw new IllegalArgumentException("The title can't be empty");
       }else{
           this.title = title;
       }
    }

    public void changeTitle(String newTitle){
        validateTitle(newTitle);
    }

    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }

    public void changeDueDate(LocalDateTime newDueDate){
        this.dueDate = newDueDate;
    }
}

