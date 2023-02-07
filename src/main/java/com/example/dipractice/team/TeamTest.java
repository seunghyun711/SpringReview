package com.example.dipractice.team;

import com.example.dipractice.DependencyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 순수 자바코드로 팀 로직 테스트
public class TeamTest {
    public static void main(String[] args) {
        // 기존에는 DependencyConfig를 직접 가져와 주입하는 방식을 사용했다.
//        DependencyConfig dependencyConfig = new DependencyConfig();
//        TeamService teamService = dependencyConfig.teamService();
        // 이제는 new AnnotationConfigApplicationContext(DependencyConfig.class);로 스프링 컨테이너에 등록된 빈을 가져오는 방식을 사용한다.
        ApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        TeamService teamService = ac.getBean("teamService", TeamService.class);


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
