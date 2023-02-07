package com.example.dipractice.championships;

import com.example.dipractice.DependencyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChampionShipTest {
    public static void main(String[] args) {
        // 기존에는 DependencyConfig를 직접 가져와 주입하는 방식을 사용했다.
//        DependencyConfig dependencyConfig = new DependencyConfig();
//        ChampionsShipsService css = dependencyConfig.championsShipsService();
        // 이제는 new AnnotationConfigApplicationContext(DependencyConfig.class);로 스프링 컨테이너에 등록된 빈을 가져오는 방식을 사용한다.
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        ChampionsShipsService championsShipsService = ac.getBean("championsShipsService", ChampionsShipsService.class);
        ChampionShips cs = new ChampionShips(1L,"Champions League","UEFA","Real Madrid");

        championsShipsService.createChampionship(cs);

        if(championsShipsService.getChampionShip(1L).getName().equals(cs.getName()))
            System.out.println("대회등록 - " + championsShipsService.getChampionShip(1L).getName());

        championsShipsService.editChampionShip(1L, "World Cup", "FIFA", "Argentine Republic");

        if (championsShipsService.getChampionShip(1L).getOrganizer() == "FIFA") {
            System.out.println("대회가 정상적으로 변경됨 - " + championsShipsService.getChampionShip(1L).getName());
        }

        championsShipsService.deleteChampionShip(1L);
        if(championsShipsService.getChampionShip(1L) == null){
            System.out.println("대회가 정상적으로 삭제됨");
        }
    }
}
