package com.br.hex.repository.dao;

import java.util.Arrays;
import java.util.List;

import com.br.hex.repository.model.User;

public final class UserRepository {

    private List<User> users = Arrays.asList(
            new User(1,"Victor","victor", "123", "ADMIN"),
            new User(2,"Samuel","samuel", "123", "PEDAGOGUE"),
            new User(3,"Germano","german", "123", "STUDENT")
    );
    private static UserRepository instancia = new UserRepository();

    private UserRepository(){}

    public static UserRepository getInstancia(){ return instancia; }

    public void addUser(User user){
        users.add(user);
    }

    public User selectUser(String user){
        for(User aux : users){
            if(aux.getUser().equals(user)){
                User credentials = new User(
                        aux.getId(),
                        aux.getName(),
                        aux.getUser(),
                        aux.getPassword(),
                        aux.getFunction()
                );
                return credentials;
            }
        }

        return null;
    }
}
