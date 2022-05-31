package com.immutability;

import java.util.HashMap;
import java.util.Map;

public class SoccerTeamFactory {

	private static final Map<String, SoccerTeam> SOCCER_TEAM_MAP = new HashMap<>();

	private static final SoccerTeam PALMEIRAS = new SoccerTeam("PALMEIRAS");
	private static final SoccerTeam BARCELONA = new SoccerTeam("BARCELONA");
	private static final SoccerTeam PSG = new SoccerTeam("PSG");
	private static final SoccerTeam REAL_MADRID = new SoccerTeam("REAL MADRID");
	private static final SoccerTeam CEARA = new SoccerTeam("CEARA");

	static {
		SOCCER_TEAM_MAP.put("PALMEIRAS", PALMEIRAS);
		SOCCER_TEAM_MAP.put("BARCELONA", BARCELONA);
		SOCCER_TEAM_MAP.put("PSG", PSG);
		SOCCER_TEAM_MAP.put("REAL MADRID", REAL_MADRID);
		SOCCER_TEAM_MAP.put("CEARA", CEARA);
	}

	public static SoccerTeam getByName(String name) {
		if (SOCCER_TEAM_MAP.containsKey(name)) {
			return SOCCER_TEAM_MAP.get(name);
		} else {
			SoccerTeam newSoccerTeam = new SoccerTeam(name);
			SOCCER_TEAM_MAP.put(name, newSoccerTeam);
			return newSoccerTeam;
		}
	}
	
	public static int getSoccerTeamMapSize() {
		return SOCCER_TEAM_MAP.size();
	}
	
}
