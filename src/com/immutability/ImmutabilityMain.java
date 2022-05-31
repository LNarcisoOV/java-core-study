package com.immutability;

public class ImmutabilityMain {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("--------------------------IMMUTABILITY---------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println();

		
		
		System.out.println("SOCCER TEAM MAP SIZE: " + SoccerTeamFactory.getSoccerTeamMapSize());
		SoccerTeam st1 = SoccerTeamFactory.getByName("TEST");
		System.out.println("SOCCER TEAM MAP SIZE AFTER ADD NEW TEAM: " + SoccerTeamFactory.getSoccerTeamMapSize());
		System.out.println("TEAM NAME: " + st1.getName());
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		System.out.println("SOCCER TEAM MAP SIZE: " + SoccerTeamFactory.getSoccerTeamMapSize());
		SoccerTeam st2 = SoccerTeamFactory.getByName("PALMEIRAS");
		System.out.println("SOCCER TEAM MAP SIZE WITH EXISTING TEAM: " + SoccerTeamFactory.getSoccerTeamMapSize());
		System.out.println("TEAM NAME: " + st2.getName());
		
		System.out.println();
		System.out.println("---------------ADDING 'TEST' AGAIN TO CHECK----------------");
		System.out.println();
		
		System.out.println("SOCCER TEAM MAP SIZE: " + SoccerTeamFactory.getSoccerTeamMapSize());
		SoccerTeam st3 = SoccerTeamFactory.getByName("TEST");
		System.out.println("SOCCER TEAM MAP SIZE AFTER ADD NEW TEAM: " + SoccerTeamFactory.getSoccerTeamMapSize());
		System.out.println("TEAM NAME: " + st3.getName());
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		System.out.println("SOCCER TEAM MAP SIZE: " + SoccerTeamFactory.getSoccerTeamMapSize());
		SoccerTeam st4 = SoccerTeamFactory.getByName("BARCELONA");
		System.out.println("SOCCER TEAM MAP SIZE WITH EXISTING TEAM: " + SoccerTeamFactory.getSoccerTeamMapSize());
		System.out.println("TEAM NAME: " + st4.getName());
	}

}
