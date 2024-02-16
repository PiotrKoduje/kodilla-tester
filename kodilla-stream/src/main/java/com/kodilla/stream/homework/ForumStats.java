package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    static List<User> users = UsersRepository.getUsersList();

    public double avgPostsAbove40(List<User> users){
        double posts = users
                .stream()
                .filter(u -> u.getAge()>=40)
                .mapToInt(u -> u.getNumberOfPost())
                .sum();

        List<User> over40 = users
                .stream()
                .filter(u -> u.getAge()>=40)
                .collect(Collectors.toList());

        if (over40.size() == 0)
            return 0.0;

        return (posts/over40.size());
    }

    public double avgPostsBelow40(List<User> users){
        double posts = users
                .stream()
                .filter(u -> u.getAge()<40)
                .mapToInt(u -> u.getNumberOfPost())
                .sum();

        List<User> under40 = users
                .stream()
                .filter(u -> u.getAge()<40)
                .collect(Collectors.toList());

        if (under40.size() == 0)
            return 0.0;

        return (posts/under40.size());
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println("Średnia liczba postów dla użytkowników powyżej 40 roku życia wynosi : " + forumStats.avgPostsAbove40(users));
        System.out.println("Średnia liczba postów dla użytkowników poniżej 40 roku życia wynosi : " + forumStats.avgPostsBelow40(users));
    }
}
