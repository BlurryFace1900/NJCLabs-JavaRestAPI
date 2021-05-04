package com.debojit.todolist.repo;

import com.debojit.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, long>{

    

}
