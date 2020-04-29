package com.example.team.dao;

import com.example.team.pojo.UserTodo;

import java.util.List;

public interface UserTodoDAO {
    void add(UserTodo userTodo);
    void delete(int userTodoId);
    void update(UserTodo userTodo);
    UserTodo getById(int userTodoId);
    List<UserTodo> listByUser(int userId,int userTodoSetId);
}
