package com.example.dipractice.team;

public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // 팀 생성
    public void createTeam(Team team) {
        teamRepository.postTeam(team);
    }

    // 팀 조회
    public Team getTeam(Long teamId) {
        return teamRepository.getTeam(teamId);
    }

    // 팀삭제
    public void deleteTeam(Long teamId) {
        teamRepository.deleteTeam(teamId);
    }
}
