package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuite {
    @Test
    public void methodFilterChemistGroupUserNamesShouldReturnSpecificValues(){
       //given
        UserManager userManager = new UserManager();
        //when
        List<String> result = userManager.getChemistsNames();
        //then
        List<String> expectexList = new ArrayList<>();
        expectexList.add("Walter White");
        expectexList.add("Gale Boetticher");
        assertEquals(expectexList,result);

        //alternative
        assertLinesMatch(asList("Walter White","Gale Boetticher"),result);

    }

    @Test
    public void shouldReturnUsersOlder40(){
        //given
        UserManager userManager = new UserManager();
        //when
        List<User> result = UserManager.getUsersOlderThen(40);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White",50,7,"Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList,result);
    }

    @Test
    public void shouldReturnUsersWithLessPostsThen100(){
        //given
        UserManager userManager = new UserManager();
        //when
        List<String > result = UserManager.getUsersNamesWithLessPostsThan(100);
        //then
        assertLinesMatch(asList("Walter White","Gus Firing","Gale Boetticher","Mike Ehrmantraut"),result);
    }
}