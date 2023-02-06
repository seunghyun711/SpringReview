package com.example.dipractice.team;

// 순수 자바코드로 팀 로직 테스트
public class TeamTest {
    public static void main(String[] args) {
        TeamService teamService = new TeamService();

        // 팀 생성
        Team team = new Team(1L,"Manchester United", "EPL","Old Trafford");
        teamService.createTeam(team);

        Team currentTeam = teamService.getTeam(1L);

        System.out.println("팀 이름 : " + team.getTeamName());
        System.out.println("소속 리그 : " + team.getLeague());

        if(team.getTeamName().equals(currentTeam.getTeamName())){
            System.out.println("새로 생성된 팀과 현재 선택된 팀이 같다.");
        }

        // 팀 삭제
        teamService.deleteTeam(1L);

        if(teamService.getTeam(1L) == null){
            System.out.println("팀 삭제 완료");
        }
    }
}
