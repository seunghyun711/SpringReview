package com.example.dipractice;

import com.example.dipractice.singleton.SingletonService;
import com.example.dipractice.team.TeamService;

public class SingletonTest {
    // 싱글톤 적용 o
    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    public static void main(String[] args) {
        System.out.println("singletonService1 : " + singletonService1);
        System.out.println("singletonService2 : " + singletonService2);
    }
}
