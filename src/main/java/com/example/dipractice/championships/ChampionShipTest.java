package com.example.dipractice.championships;

public class ChampionShipTest {
    public static void main(String[] args) {
        ChampionsShipsService css = new ChampionsShipsService();
        ChampionShips cs = new ChampionShips(1L,"Champions League","UEFA","Real Madrid");

        css.createChampionship(cs);

        if(css.getChampionShip(1L).getName().equals(cs.getName()))
            System.out.println("대회등록 - " + css.getChampionShip(1L).getName());

        css.editChampionShip(1L, "World Cup", "FIFA", "Argentine Republic");

        if (css.getChampionShip(1L).getOrganizer() == "FIFA") {
            System.out.println("대회가 정상적으로 변경됨 - " + css.getChampionShip(1L).getName());
        }

        css.deleteChampionShip(1L);
        if(css.getChampionShip(1L) == null){
            System.out.println("대회가 정상적으로 삭제됨");
        }
    }
}
