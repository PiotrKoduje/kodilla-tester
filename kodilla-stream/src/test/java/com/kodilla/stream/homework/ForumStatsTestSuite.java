package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {

    ForumStats forumStats = new ForumStats();
    User adam = new User("Adam",10,12,"children");
    User gabi = new User("Gabrysia",12,30,"children");
    User seba = new User("Sebastian", 39,80,"smurf");
    User piotr = new User("Piotr",40,120,"horse");
    User gosia = new User("Małgosia",41,200,"peach");
    User glossy = new User("Ela", 74, 240,"grandParent");
    User Apiotr = new User("Piotr", 76,34,"grandParent");

    @Test
    public void bothMethodsShouldReturnZeroIfThereIsNoOneSuitableInTheList(){
        //given
        List<User> firstList = new ArrayList<>();
        firstList.add(adam);
        firstList.add(gabi);
        firstList.add(seba);

        List<User> secondList = new ArrayList<>();
        secondList.add(piotr);
        secondList.add(gosia);
        secondList.add(glossy);
        secondList.add(Apiotr);

        //when
        double result1 = forumStats.avgPostsAbove40(firstList);
        double result2 = forumStats.avgPostsBelow40(secondList);

        //then
        assertEquals(0.0,result1);
        assertEquals(0.0,result2);
    }

    @Test
    public void bothMethodsShouldReturnSpecificValues(){
        //given
        List<User> list = new ArrayList<>();
        list.add(adam);
        list.add(gabi);
        list.add(seba);
        list.add(piotr);
        list.add(gosia);
        list.add(glossy);
        list.add(Apiotr);

        //when
        double result1 = forumStats.avgPostsAbove40(list);
        double result2 = forumStats.avgPostsBelow40(list);

        //then
        assertEquals(148.5,result1,0.1);
        assertEquals(40.7,result2,0.1);
    }

}