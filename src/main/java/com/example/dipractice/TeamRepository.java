package com.example.dipractice;

import java.util.HashMap;
import java.util.Map;

public class TeamRepository {
    private static Map<Long, Team> teams = new HashMap<>();

    public void postTeam(Team team) {
        teams.put(team.getTeamId(), team);
    }

    public Team getTeam(Long teamId) {
        return teams.get(teamId);
    }

    public void deleteTeam(Long teamId) {
        teams.remove(teamId);
    }
}
