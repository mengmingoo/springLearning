package com.mengming.service;

import com.mengming.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserService {
    private UserDao userDao;
    private Integer port;
    private List<String> list;
    private Map<String, String> card;
    private Set<String> games;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void test(){
        System.out.println("UserService test...");
        System.out.println(userDao);
        System.out.println(port);
        System.out.println("----list---");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----end---");
        System.out.println("----map---");
        System.out.println(card);
        System.out.println("----end---");
        System.out.println("----set---");
        for (String game : games) {
            System.out.println(game);
        }
        System.out.println("----end---");
    }
}
