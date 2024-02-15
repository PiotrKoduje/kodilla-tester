package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1",30,100,"test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        //użycie domyslnego obiektu, gdy wskazany obiekt jest pusty (user=null)
        String username = optionalUser.orElse(new User("",0,0,"")).getUserName();
        System.out.println(username);

        //użycie metody ifPresent(wyrażenie lambda wykona się tyko wtedy, gdy wskazany obiekt nie jest null)
        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));

    }
}
