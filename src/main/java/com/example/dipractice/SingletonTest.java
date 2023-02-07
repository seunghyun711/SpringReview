package com.example.dipractice;

import com.example.dipractice.team.TeamService;

public class SingletonTest {
    static DependencyConfig dependencyConfig = new DependencyConfig();

    static TeamService teamService1 = dependencyConfig.teamService();
    static TeamService teamService2 = dependencyConfig.teamService();

    public static void main(String[] args) {
        System.out.println("teamService1 : " + teamService1);
        System.out.println("teamService2 : " + teamService2);
    }
}
