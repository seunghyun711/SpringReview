package com.example.dipractice;

public class Team {
    private Long teamId;
    private String teamName; // 팀이름
    private String league; // 소속 리그
    private String home; // 홈구장

    // 생성자

    public Team(Long teamId, String teamName, String league, String home) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.league = league;
        this.home = home;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
