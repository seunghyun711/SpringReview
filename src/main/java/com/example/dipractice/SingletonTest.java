package com.example.dipractice;

import com.example.dipractice.singleton.SingletonService;
import com.example.dipractice.team.TeamService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {
    // 싱글톤 적용 o(컨테이너 사용)

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
    static TeamService teamService1 = ac.getBean("teamService", TeamService.class);
    static TeamService teamService2 = ac.getBean("teamService", TeamService.class);

    public static void main(String[] args) {
        System.out.println("teamService1 : " + teamService1);
        System.out.println("teamService2 : " + teamService2);
    }
}
