package tests;

import model.ChampionStats;
import model.PlayerStats;
import model.LeagueLogic;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWinRate {
	ChampionStats champ = new ChampionStats("Draven", .9);
	PlayerStats player = new PlayerStats("David", 1.0, "Bronze 4");
	LeagueLogic logic = new LeagueLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		boolean playerWRHigher = logic.playerWinRateHigher(player, champ);
		assertEquals(true, playerWRHigher);
	}
	@Test
	public void test2() {
		double WRDifference= logic.winRateDifferencePlayerVChamp(player, champ);
		//assertEquals(double,double,double delta)deals with inaccuracy
		assertEquals(.1, WRDifference,.0001);
	}
}
