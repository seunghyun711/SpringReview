package com.example.dipractice.championships;

import com.example.dipractice.DependencyConfig;
import com.example.dipractice.team.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

        TeamService teamService = ac.getBean("teamService", TeamService.class);

        System.out.println(TeamService.class.isInstance(teamService));
    }

}
