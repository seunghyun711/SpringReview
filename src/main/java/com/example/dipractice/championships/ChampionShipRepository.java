package com.example.dipractice.championships;

import java.util.HashMap;
import java.util.Map;

public class ChampionShipRepository {
    private static Map<Long, ChampionShips> cs = new HashMap<>();

    public void postChampionShip(ChampionShips championShips) {
        cs.put(championShips.getLeagueId(), championShips);
    }

    public ChampionShips patchInfo(Long id, String name, String organizer, String winner) {
        ChampionShips c = cs.get(id);
        c.setOrganizer(organizer);
        c.setName(name);
        c.setWinner(winner);

        return cs.put(id, c);
    }

    public ChampionShips getChampionShip(Long id) {
        return cs.get(id);
    }

    public void deleteChampionShip(Long id) {
        cs.remove(id);
    }
}
