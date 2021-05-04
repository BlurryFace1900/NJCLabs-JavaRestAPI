package com.debojit.todolist.model

public class TodoItem{

    private long id;
    @NotBlank
    private String title;
    private boolean done;

    public TodoItem(){

    } 

    publicTodoItem(long id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;
    }

    @id
    @GenerateValue
    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean getDone(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDone(boolean done){
        this.done = done;
    }

}