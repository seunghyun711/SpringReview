package com.example.dipractice.championships;

// 팀이 참가할 수 있는 대회 클래스
public class ChampionShips {
    private Long leagueId; // 각 대회의 고유 id
    private String name; // 대회명
    private String organizer; // 주관
    private String winner; // 우승 팀

    public ChampionShips(Long leagueId, String name, String organizer, String winner) {
        this.leagueId = leagueId;
        this.name = name;
        this.organizer = organizer;
        this.winner = winner;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
