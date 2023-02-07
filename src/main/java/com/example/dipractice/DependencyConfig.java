package com.example.dipractice;

import com.example.dipractice.championships.ChampionShipRepository;
import com.example.dipractice.championships.ChampionsShipsService;
import com.example.dipractice.team.TeamRepository;
import com.example.dipractice.team.TeamService;

// 의존성 주입을 관리하는 클래스
public class DependencyConfig {

    public TeamService teamService(){
        return new TeamService(teamRepository());
    }

    public TeamRepository teamRepository(){
        return new TeamRepository();
    }

    public ChampionsShipsService championsShipsService(){
        return new ChampionsShipsService(championShipRepository());
    }

    public ChampionShipRepository championShipRepository(){
        return new ChampionShipRepository();
    }
}
