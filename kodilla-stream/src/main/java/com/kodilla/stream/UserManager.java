package com.kodilla.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
        //processUsersStream();

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static void processUsersStream(){
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<User> getUsersOlderThen(int age){
        List<User> result = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return result;
    }

    public static List<String> getUsersNamesWithLessPostsThan(int posts){
        List<String> result = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() < 100)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());
        return result;
    }

    List<String> getChemistsNames(){
        return filterChemistGroupUsernames();
    }

    public static String getUserName(User user){
        return user.getUserName();
    }
}
