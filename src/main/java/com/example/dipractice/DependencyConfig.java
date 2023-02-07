package com.example.dipractice;

import com.example.dipractice.championships.ChampionShipRepository;
import com.example.dipractice.championships.ChampionsShipsService;
import com.example.dipractice.team.TeamRepository;
import com.example.dipractice.team.TeamService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 의존성 주입을 관리하는 클래스
@Configuration
public class DependencyConfig {

    @Bean
    public TeamService teamService(){
        return new TeamService(teamRepository());
    }

    @Bean
    public TeamRepository teamRepository(){
        return new TeamRepository();
    }

    @Bean
    public ChampionsShipsService championsShipsService(){
        return new ChampionsShipsService(championShipRepository());
    }

    @Bean
    public ChampionShipRepository championShipRepository(){
        return new ChampionShipRepository();
    }
}
