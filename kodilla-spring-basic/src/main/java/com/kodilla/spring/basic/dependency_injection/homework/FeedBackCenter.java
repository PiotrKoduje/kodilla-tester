package com.kodilla.spring.basic.dependency_injection.homework;

public interface FeedBackCenter {
    boolean success(String address, double weight);
    boolean fail(String address, double weight);
}
