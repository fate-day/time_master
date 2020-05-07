package com.example.team.service;

import com.example.team.pojo.UserTodoSet;

import java.util.List;

public interface UserTodoSetService {
    void createUserTodoSet(UserTodoSet userTodoSet);
    void updateUserTodoSet(UserTodoSet userTodoSet);
    void deleteUserTodoSet(int userTodoSetId);
    UserTodoSet getById(int userTodoSetId);
    List<UserTodoSet> listByUserId(int userId);
}