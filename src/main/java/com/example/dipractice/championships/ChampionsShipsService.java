package com.example.dipractice.championships;

public class ChampionsShipsService {
    private static ChampionShipRepository champsRepository = new ChampionShipRepository();

    // 대회 생성
    public void createChampionship(ChampionShips championShips){
        champsRepository.postChampionShip(championShips);
    }

    // 대회 정보 변경
    public ChampionShips editChampionShip(Long id, String name, String organizer, String winner) {
        return champsRepository.patchInfo(id, name, organizer, winner);
    }

    // 대회 조회
    public ChampionShips getChampionShip(Long id){
        return champsRepository.getChampionShip(id);
    }

    // 대회 삭제
    public void deleteChampionShip(Long id){
        champsRepository.deleteChampionShip(id);
    }
}
